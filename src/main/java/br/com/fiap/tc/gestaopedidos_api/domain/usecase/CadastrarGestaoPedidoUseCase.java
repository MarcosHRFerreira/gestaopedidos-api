package br.com.fiap.tc.gestaopedidos_api.domain.usecase;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;

import br.com.fiap.tc.gestaopedidos_api.domain.enums.StatusPedidoEnum;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.CadastrarGestaoPedidoInterface;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.ConsultaClientePorIDInterface;

public class CadastrarGestaoPedidoUseCase {

    private final CadastrarGestaoPedidoInterface cadastrarGestaoPedidoInterface;
    private final ConsultaClientePorIDInterface consultaClientePorIDInterface;


    public CadastrarGestaoPedidoUseCase(CadastrarGestaoPedidoInterface cadastrarGestaoPedidoInterface, ConsultaClientePorIDInterface consultaClientePorIDInterface) {
        this.cadastrarGestaoPedidoInterface = cadastrarGestaoPedidoInterface;
        this.consultaClientePorIDInterface = consultaClientePorIDInterface;
    }

    public GestaoPedido cadastraGestaoPedido(GestaoPedido gestaoPedido){


        consultaClientePorIDInterface.consultaPorId(gestaoPedido.getClienteId());

         gestaoPedido.setStatuspedido(StatusPedidoEnum.PENDENTE);

        return cadastrarGestaoPedidoInterface.cadastraGestaoPedido(gestaoPedido);
    }

}
