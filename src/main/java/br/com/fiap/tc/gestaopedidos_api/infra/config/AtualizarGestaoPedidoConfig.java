package br.com.fiap.tc.gestaopedidos_api.infra.config;

import br.com.fiap.tc.gestaopedidos_api.domain.gateway.AtualizarGestaoPedidoInterface;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.AtualizarGestaoPedidoUseCase;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.BuscarGestaoPedidoPorIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtualizarGestaoPedidoConfig {

    @Bean
    public AtualizarGestaoPedidoUseCase atualizarGestaoPedidoUseCase(
            AtualizarGestaoPedidoInterface atualizarGestaoPedidoInterface,
            BuscarGestaoPedidoPorIdUseCase buscarGestaoPedidoPorIdUseCase) {

        return new AtualizarGestaoPedidoUseCase(atualizarGestaoPedidoInterface, buscarGestaoPedidoPorIdUseCase);
    }
}
