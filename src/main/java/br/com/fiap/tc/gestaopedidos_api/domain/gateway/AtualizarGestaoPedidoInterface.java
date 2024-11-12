package br.com.fiap.tc.gestaopedidos_api.domain.gateway;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;

public interface AtualizarGestaoPedidoInterface {

    GestaoPedido atualizarGestaoPedido(Long id,GestaoPedido gestaoPedido);

}
