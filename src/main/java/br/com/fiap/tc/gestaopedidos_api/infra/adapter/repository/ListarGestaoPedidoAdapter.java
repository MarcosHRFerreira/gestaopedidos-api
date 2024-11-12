package br.com.fiap.tc.gestaopedidos_api.infra.adapter.repository;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.ListarGestaoPedidoInterface;
import br.com.fiap.tc.gestaopedidos_api.infra.repository.GestaoPedidoEntityMapper;
import br.com.fiap.tc.gestaopedidos_api.infra.repository.GestaoPedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarGestaoPedidoAdapter implements ListarGestaoPedidoInterface {

   private final GestaoPedidoRepository gestaoPedidoRepository;
   private final GestaoPedidoEntityMapper gestaoPedidoEntityMapper;

   @Override
    public List<GestaoPedido> listarGestaoPedidos(){
       return gestaoPedidoRepository.findAll().stream().map(gestaoPedidoEntityMapper::toGestaoPedidoResponse).toList();
   }


}
