package br.com.fiap.tc.gestaopedidos_api.domain.usecase;

import br.com.fiap.tc.gestaopedidos_api.domain.gateway.DeletarGestaoPedidoInterface;

public class DeletarGestaoPedidoUseCase {

    private final DeletarGestaoPedidoInterface deletarGestaoPedidoInterface;
    private final BuscarGestaoPedidoPorIdUseCase buscarGestaoPedidoPorIdUseCase;


    public DeletarGestaoPedidoUseCase(DeletarGestaoPedidoInterface deletarGestaoPedidoInterface, BuscarGestaoPedidoPorIdUseCase buscarGestaoPedidoPorIdUseCase) {
        this.deletarGestaoPedidoInterface = deletarGestaoPedidoInterface;
        this.buscarGestaoPedidoPorIdUseCase = buscarGestaoPedidoPorIdUseCase;
    }

    public boolean deletarGestaoPedido(Long id){

        buscarGestaoPedidoPorIdUseCase.buscarGestaoPedidoPorId(id);

        return deletarGestaoPedidoInterface.deletarGestaoPedido(id);

    }

}
