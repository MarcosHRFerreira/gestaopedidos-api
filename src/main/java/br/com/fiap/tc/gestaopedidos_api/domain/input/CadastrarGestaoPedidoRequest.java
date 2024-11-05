package br.com.fiap.tc.gestaopedidos_api.domain.input;

import br.com.fiap.tc.gestaopedidos_api.domain.enums.StatusPedidoEnum;

import java.time.LocalDateTime;

public record CadastrarGestaoPedidoRequest(
        Long pedidoId,
        Long clienteId,
        LocalDateTime datapedido

) {
}
