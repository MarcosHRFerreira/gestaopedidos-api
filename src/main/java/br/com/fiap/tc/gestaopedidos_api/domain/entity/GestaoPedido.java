package br.com.fiap.tc.gestaopedidos_api.domain.entity;

import br.com.fiap.tc.gestaopedidos_api.domain.enums.StatusPedidoEnum;
import br.com.fiap.tc.gestaopedidos_api.domain.enums.TipoPagamentoEnum;

import java.time.LocalDateTime;

public class GestaoPedido {

    private Long pedidoId;
    private Long clienteId;
    private LocalDateTime datapedido;
    private StatusPedidoEnum statuspedido  ;
    private Double valortotal;
    private TipoPagamentoEnum tipopagamento;

    public GestaoPedido(Long pedidoId, Long clienteId, LocalDateTime datapedido, StatusPedidoEnum statuspedido,Double valortotal, TipoPagamentoEnum tipopagamento) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.datapedido = datapedido;
        this.statuspedido = statuspedido;
        this.valortotal = valortotal;
        this.tipopagamento = tipopagamento;
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

    public Double getValortotal() {
        return valortotal;
    }

    public void setValortotal(Double valortotal) {
        this.valortotal = valortotal;
    }

    public TipoPagamentoEnum getTipopagamento() {
        return tipopagamento;
    }

    public void setTipopagamento(TipoPagamentoEnum tipopagamento) {
        this.tipopagamento = tipopagamento;
    }

}
