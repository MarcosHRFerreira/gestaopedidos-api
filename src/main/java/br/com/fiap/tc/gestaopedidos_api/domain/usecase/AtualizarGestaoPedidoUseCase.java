package br.com.fiap.tc.gestaopedidos_api.domain.usecase;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.AtualizarGestaoPedidoInterface;

public class AtualizarGestaoPedidoUseCase {

    private final AtualizarGestaoPedidoInterface atualizarGestaoPedidoInterface;
    private final BuscarGestaoPedidoPorIdUseCase buscarGestaoPedidoPorIdUseCase;


    public AtualizarGestaoPedidoUseCase(AtualizarGestaoPedidoInterface atualizarGestaoPedidoInterface, BuscarGestaoPedidoPorIdUseCase buscarGestaoPedidoPorIdUseCase) {
        this.atualizarGestaoPedidoInterface = atualizarGestaoPedidoInterface;
        this.buscarGestaoPedidoPorIdUseCase = buscarGestaoPedidoPorIdUseCase;
    }

    public GestaoPedido atualizarGestaoPedido(Long id, GestaoPedido gestaoPedido){

        GestaoPedido pedidoBuscado= buscarGestaoPedidoPorIdUseCase.buscarGestaoPedidoPorId(id);

        pedidoBuscado.setStatuspedido(gestaoPedido.getStatuspedido());
        pedidoBuscado.setDatapedido(gestaoPedido.getDatapedido());
        pedidoBuscado.setValortotal(gestaoPedido.getValortotal());
        pedidoBuscado.setTipopagamento(gestaoPedido.getTipopagamento());

        return atualizarGestaoPedidoInterface.atualizarGestaoPedido(id,pedidoBuscado);


    }


}
