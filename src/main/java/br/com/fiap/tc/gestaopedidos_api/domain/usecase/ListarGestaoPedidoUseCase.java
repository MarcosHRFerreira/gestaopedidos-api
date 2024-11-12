package br.com.fiap.tc.gestaopedidos_api.domain.usecase;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.ListarGestaoPedidoInterface;

import java.util.List;

public class ListarGestaoPedidoUseCase {
    private final ListarGestaoPedidoInterface listarGestaoPedidoInterface;


    public ListarGestaoPedidoUseCase(ListarGestaoPedidoInterface listarGestaoPedidoInterface) {
        this.listarGestaoPedidoInterface = listarGestaoPedidoInterface;
    }

    public List<GestaoPedido> listarGestaoPedidos(){
        return listarGestaoPedidoInterface.listarGestaoPedidos();
    }

}
