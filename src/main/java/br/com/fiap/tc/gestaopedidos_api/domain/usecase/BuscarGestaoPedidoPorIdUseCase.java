package br.com.fiap.tc.gestaopedidos_api.domain.usecase;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.exception.GestaoPedidoNotFoundException;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.BuscarGestaoPedidoPorIdInterface;

public class BuscarGestaoPedidoPorIdUseCase {

    private final BuscarGestaoPedidoPorIdInterface buscarGestaoPedidoPorIdInterface;


    public BuscarGestaoPedidoPorIdUseCase(BuscarGestaoPedidoPorIdInterface buscarGestaoPedidoPorIdInterface) {
        this.buscarGestaoPedidoPorIdInterface = buscarGestaoPedidoPorIdInterface;
    }

    public GestaoPedido buscarGestaoPedidoPorId(Long id){

        GestaoPedido gestaoPedido= buscarGestaoPedidoPorIdInterface.buscarGestaoPedidoPorId(id);

        if(gestaoPedido==null){
            throw  new GestaoPedidoNotFoundException("Pedido de id: " + id + " não foi encontrado.");
        }

        return gestaoPedido;

    }


}
