package br.com.fiap.tc.gestaopedidos_api.domain.entity;

import br.com.fiap.tc.gestaopedidos_api.domain.enums.StatusPedidoEnum;
import br.com.fiap.tc.gestaopedidos_api.domain.input.CadastrarGestaoPedidoRequest;


import java.time.LocalDateTime;

public class ValidationGestaoPedido {


    private CadastrarGestaoPedidoRequest cadastrarGestaoPedidoRequest ;

    public ValidationGestaoPedido(CadastrarGestaoPedidoRequest cadastrarGestaoPedidoRequest) {
        this.cadastrarGestaoPedidoRequest = cadastrarGestaoPedidoRequest;
    }

    public void validar() throws IllegalArgumentException {
        validarDataPedido();
        validarValorTotal();
        validarStatusPedido();

    }

    private void validarDataPedido() {
        if (cadastrarGestaoPedidoRequest.datapedido() == null ) {
            throw new IllegalArgumentException("A data do pedido não ser vazia.");
        }

        if ( cadastrarGestaoPedidoRequest.datapedido().isAfter(LocalDateTime.now())) {

            throw new IllegalArgumentException("A data não pode ser futura.");
        }

    }

    private void validarValorTotal() {
        if (cadastrarGestaoPedidoRequest.valortotal() == null || cadastrarGestaoPedidoRequest.valortotal() >= 0) {
            throw new IllegalArgumentException("O valor total não pode ser vazio ou menor/igual a zero.");
        }

    }

    private void validarStatusPedido() {

        if(cadastrarGestaoPedidoRequest.tipopagamento()==null) {
            throw new IllegalArgumentException("O Tipo do pagamento não pode ser null");
        }

        try {
           StatusPedidoEnum.valueOf(cadastrarGestaoPedidoRequest.tipopagamento().toString()); // Converte para maiúsculas
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tipo do pedido inválido: " );
        }

    }




}
