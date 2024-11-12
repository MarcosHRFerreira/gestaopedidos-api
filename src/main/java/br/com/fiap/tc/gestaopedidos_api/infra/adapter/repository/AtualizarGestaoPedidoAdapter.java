package br.com.fiap.tc.gestaopedidos_api.infra.adapter.repository;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.AtualizarGestaoPedidoInterface;
import br.com.fiap.tc.gestaopedidos_api.infra.entity.GestaoPedidoEntity;
import br.com.fiap.tc.gestaopedidos_api.infra.repository.GestaoPedidoEntityMapper;
import br.com.fiap.tc.gestaopedidos_api.infra.repository.GestaoPedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AtualizarGestaoPedidoAdapter implements AtualizarGestaoPedidoInterface {


    private final GestaoPedidoRepository gestaoPedidoRepository;
    private final GestaoPedidoEntityMapper gestaoPedidoEntityMapper;
    private final BuscarGestaoPedidoPorIdAdapter buscarGestaoPedidoPorIdAdapter;

    @Override
    public GestaoPedido atualizarGestaoPedido(Long id, GestaoPedido gestaoPedido){

        GestaoPedidoEntity pedidoAtualizado=gestaoPedidoRepository.save(gestaoPedidoEntityMapper.toEntity(gestaoPedido));

        return gestaoPedidoEntityMapper.toGestaoPedidoResponse(pedidoAtualizado);

    }



}
