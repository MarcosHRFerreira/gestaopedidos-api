package br.com.fiap.tc.gestaopedidos_api.infra.adapter.repository;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;

import br.com.fiap.tc.gestaopedidos_api.domain.gateway.CadastrarGestaoPedidoInterface;
import br.com.fiap.tc.gestaopedidos_api.infra.entity.GestaoPedidoEntity;
import br.com.fiap.tc.gestaopedidos_api.infra.repository.GestaoPedidoEntityMapper;
import br.com.fiap.tc.gestaopedidos_api.infra.repository.GestaoPedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CadastarGestaoPedidoAdpter implements CadastrarGestaoPedidoInterface {

    private final GestaoPedidoRepository gestaoPedidoRepository;
    private final GestaoPedidoEntityMapper gestaoPedidoEntityMapper;

    @Override
    public GestaoPedido cadastraGestaoPedido(GestaoPedido gestaoPedido){

        GestaoPedidoEntity gestaoPedidoEntity = gestaoPedidoEntityMapper.toEntity(gestaoPedido);
        GestaoPedidoEntity novoGestaoPedido = gestaoPedidoRepository.save(gestaoPedidoEntity);

        return gestaoPedidoEntityMapper.toGestaoPedidoResponse(novoGestaoPedido);

    }


}
