package br.com.fiap.tc.gestaopedidos_api.domain.entity;

import br.com.fiap.tc.gestaopedidos_api.domain.enums.StatusPedidoEnum;


import java.time.LocalDateTime;

public class GestaoPedido {

    private Long pedidoId;
    private Long clienteId;
    private LocalDateTime datapedido;
    private StatusPedidoEnum statuspedido  ;


    public GestaoPedido(Long pedidoId, Long clienteId, LocalDateTime datapedido, StatusPedidoEnum statuspedido) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.datapedido = datapedido;
        this.statuspedido = statuspedido;
    }

    public GestaoPedido() {
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDateTime getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(LocalDateTime datapedido) {
        this.datapedido = datapedido;
    }

    public StatusPedidoEnum getStatuspedido() {
        return statuspedido;
    }

    public void setStatuspedido(StatusPedidoEnum statuspedido) {
        this.statuspedido = statuspedido;
    }
}
