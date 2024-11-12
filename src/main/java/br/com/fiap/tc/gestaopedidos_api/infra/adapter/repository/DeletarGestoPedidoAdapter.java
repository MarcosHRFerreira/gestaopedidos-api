package br.com.fiap.tc.gestaopedidos_api.infra.adapter.repository;

import br.com.fiap.tc.gestaopedidos_api.domain.gateway.DeletarGestaoPedidoInterface;
import br.com.fiap.tc.gestaopedidos_api.domain.output.GestaoPedidoResponse;
import br.com.fiap.tc.gestaopedidos_api.infra.repository.GestaoPedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarGestoPedidoAdapter implements DeletarGestaoPedidoInterface {

   private final GestaoPedidoRepository gestaoPedidoRepository;

    @Override
    public boolean deletarGestaoPedido(Long id){
        gestaoPedidoRepository.deleteById(id);
        return true;
    }

}
