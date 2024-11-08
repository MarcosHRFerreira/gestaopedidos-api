package br.com.fiap.tc.gestaopedidos_api.infra.feign;

public class ClienteNaoEncontradoException extends RuntimeException  {
    public ClienteNaoEncontradoException(String message) {
        super(message);
    }

}
