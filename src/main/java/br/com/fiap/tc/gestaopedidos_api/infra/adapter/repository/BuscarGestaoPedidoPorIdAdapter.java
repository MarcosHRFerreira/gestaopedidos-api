package br.com.fiap.tc.gestaopedidos_api.infra.adapter.repository;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.BuscarGestaoPedidoPorIdInterface;
import br.com.fiap.tc.gestaopedidos_api.infra.entity.GestaoPedidoEntity;
import br.com.fiap.tc.gestaopedidos_api.infra.repository.GestaoPedidoEntityMapper;
import br.com.fiap.tc.gestaopedidos_api.infra.repository.GestaoPedidoRepository;
import org.springframework.stereotype.Component;

@Component
public class BuscarGestaoPedidoPorIdAdapter implements BuscarGestaoPedidoPorIdInterface {

    private final GestaoPedidoRepository gestaoPedidoRepository;
    private final GestaoPedidoEntityMapper gestaoPedidoEntityMapper;


    public BuscarGestaoPedidoPorIdAdapter(GestaoPedidoRepository gestaoPedidoRepository, GestaoPedidoEntityMapper gestaoPedidoEntityMapper) {
        this.gestaoPedidoRepository = gestaoPedidoRepository;
        this.gestaoPedidoEntityMapper = gestaoPedidoEntityMapper;
    }

    @Override
    public GestaoPedido buscarGestaoPedidoPorId(Long id){
        GestaoPedidoEntity pedidoBuscado = gestaoPedidoRepository.findById(id).orElse(null);
        return gestaoPedidoEntityMapper.toGestaoPedidoResponse(pedidoBuscado);
    }

}
