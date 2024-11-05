package br.com.fiap.tc.gestaopedidos_api.domain.usecase;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;

import br.com.fiap.tc.gestaopedidos_api.domain.enums.StatusPedidoEnum;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.CadastrarGestaoPedidoInterface;

public class CadastrarGestaoPedidoUseCase {

    private final CadastrarGestaoPedidoInterface cadastrarGestaoPedidoInterface;


    public CadastrarGestaoPedidoUseCase(CadastrarGestaoPedidoInterface cadastrarGestaoPedidoInterface) {
        this.cadastrarGestaoPedidoInterface = cadastrarGestaoPedidoInterface;
    }

    public GestaoPedido cadastraGestaoPedido(GestaoPedido gestaoPedido){

         gestaoPedido.setStatuspedido(StatusPedidoEnum.PENDENTE);

        return cadastrarGestaoPedidoInterface.cadastraGestaoPedido(gestaoPedido);
    }

}
