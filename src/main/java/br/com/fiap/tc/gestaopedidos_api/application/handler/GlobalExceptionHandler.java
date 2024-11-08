package br.com.fiap.tc.gestaopedidos_api.application.handler;


import br.com.fiap.tc.gestaopedidos_api.domain.exception.GestaoPedidoNotFoundException;
import br.com.fiap.tc.gestaopedidos_api.infra.feign.ClienteConexaoNaoEncontrada;
import br.com.fiap.tc.gestaopedidos_api.infra.feign.ClienteNaoEncontradoException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GestaoPedidoNotFoundException.class)
    public ResponseEntity<ErroCustomizado> restauranteNotFoundException(GestaoPedidoNotFoundException ex, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErroCustomizado erro = new ErroCustomizado(
                Instant.now(),
                ex.getMessage(),
                status.value(),
                request.getRequestURI()
        );

        return new ResponseEntity<>(erro, status);
    }


    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErroCustomizado> handleIllegalArgumentException(IllegalArgumentException ex, HttpServletRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ErroCustomizado erro = new ErroCustomizado(
                Instant.now(),
                ex.getMessage(),
                status.value(),
                request.getRequestURI()
        );

        return new ResponseEntity<>(erro, status);
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<ErroCustomizado> handleIllegalStateException(IllegalStateException ex, HttpServletRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ErroCustomizado erro = new ErroCustomizado(
                Instant.now(),
                ex.getMessage(),
                status.value(),
                request.getRequestURI()
        );

        return new ResponseEntity<>(erro, status);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ErroCustomizado> handleNullPointerException(NullPointerException ex, HttpServletRequest request) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // ou outro status que você considere apropriado
        ErroCustomizado erro = new ErroCustomizado(
                Instant.now(),
                "Um erro inesperado ocorreu: " + ex.getMessage(), // Mensagem personalizada
                status.value(),
                request.getRequestURI()
        );

        return new ResponseEntity<>(erro, status);
    }

    @ExceptionHandler(ClienteNaoEncontradoException.class)
    public ResponseEntity<ErroCustomizado> ClienteNaoEncontradoException(ClienteNaoEncontradoException ex, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErroCustomizado erro = new ErroCustomizado(
                Instant.now(),
                ex.getMessage(),
                status.value(),
                request.getRequestURI()
        );

        return new ResponseEntity<>(erro, status);
    }

    @ExceptionHandler(ClienteConexaoNaoEncontrada.class)
    public ResponseEntity<ErroCustomizado> ClienteConexaoNaoEncontrada(ClienteConexaoNaoEncontrada ex, HttpServletRequest request) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        ErroCustomizado erro = new ErroCustomizado(
                Instant.now(),
                ex.getMessage(),
                status.value(),
                request.getRequestURI()
        );

        return new ResponseEntity<>(erro, status);
    }



}
