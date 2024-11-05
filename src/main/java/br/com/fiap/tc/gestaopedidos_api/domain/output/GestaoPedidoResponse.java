package br.com.fiap.tc.gestaopedidos_api.domain.output;

import br.com.fiap.tc.gestaopedidos_api.domain.enums.StatusPedidoEnum;

import java.time.LocalDateTime;

public record GestaoPedidoResponse(
        Long pedidoId,
        Long clienteId,
        LocalDateTime datapedido,
        StatusPedidoEnum statuspedido

) {
}