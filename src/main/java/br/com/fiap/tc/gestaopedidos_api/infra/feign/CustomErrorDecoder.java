package br.com.fiap.tc.gestaopedidos_api.infra.feign;

import feign.Response;
import feign.codec.ErrorDecoder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.coyote.BadRequestException;



public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new ErrorDecoder.Default();
    private final ObjectMapper objectMapper = new ObjectMapper(); // Para mapear o JSON
    @Override
    public Exception decode(String methodKey, Response response) {
        // Decode error response and return custom exception based on status code or response body
        switch (response.status()) {
            case 400:
                return new BadRequestException("Bad request");
            case 404:
                return new ClienteNaoEncontradoException("Cliente não encontrado");
            case 500:
                 return new BadRequestException("Verifique o Serviço GestaoClientes");
            default:
                return new Exception("Unknown error occurred");
        }
    }




}