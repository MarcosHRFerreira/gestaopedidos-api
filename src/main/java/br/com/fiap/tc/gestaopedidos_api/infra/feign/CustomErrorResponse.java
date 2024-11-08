package br.com.fiap.tc.gestaopedidos_api.infra.feign;

public class CustomErrorResponse {
    private String message;  // Mensagem amigável de erro
    private String timestamp; // Timestamp do erro

    // Construtor
    public CustomErrorResponse(String message, String timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    // Getters e Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
