package br.com.fiap.tc.gestaopedidos_api.infra.feign;

public class ClienteConexaoNaoEncontrada extends RuntimeException{
    public ClienteConexaoNaoEncontrada(String message) {
        super(message);
    }

}
