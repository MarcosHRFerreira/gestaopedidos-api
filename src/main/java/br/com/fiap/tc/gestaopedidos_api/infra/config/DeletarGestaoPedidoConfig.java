package br.com.fiap.tc.gestaopedidos_api.infra.config;

import br.com.fiap.tc.gestaopedidos_api.domain.gateway.DeletarGestaoPedidoInterface;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.BuscarGestaoPedidoPorIdUseCase;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.DeletarGestaoPedidoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeletarGestaoPedidoConfig {

    @Bean
    public DeletarGestaoPedidoUseCase deletarGestaoPedidoUseCase(
            DeletarGestaoPedidoInterface deletarGestaoPedidoInterface,
            BuscarGestaoPedidoPorIdUseCase buscarGestaoPedidoPorIdUseCase
    ){
        return  new DeletarGestaoPedidoUseCase(deletarGestaoPedidoInterface,buscarGestaoPedidoPorIdUseCase);
    }

}
