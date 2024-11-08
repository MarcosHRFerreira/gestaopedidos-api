package br.com.fiap.tc.gestaopedidos_api.infra.feign;

public class ErrorResponse {
    private String horario;
    private String erro;
    private int status;
    private String rota;

    // Getters e Setters
    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}

