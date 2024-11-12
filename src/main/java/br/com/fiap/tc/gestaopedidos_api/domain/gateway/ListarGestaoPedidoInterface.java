package br.com.fiap.tc.gestaopedidos_api.domain.gateway;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;

import java.util.List;

public interface ListarGestaoPedidoInterface {
    List<GestaoPedido> listarGestaoPedidos();
}
