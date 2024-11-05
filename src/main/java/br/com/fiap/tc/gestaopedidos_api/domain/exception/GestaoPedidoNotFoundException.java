package br.com.fiap.tc.gestaopedidos_api.domain.exception;

public class GestaoPedidoNotFoundException extends RuntimeException {
    public GestaoPedidoNotFoundException(String message) {
        super(message);
    }
}