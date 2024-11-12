package br.com.fiap.tc.gestaopedidos_api.infra.config;

import br.com.fiap.tc.gestaopedidos_api.domain.gateway.ListarGestaoPedidoInterface;

import br.com.fiap.tc.gestaopedidos_api.domain.usecase.ListarGestaoPedidoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListarGestaoPedidoConfig {

    @Bean
    public ListarGestaoPedidoUseCase listarGestaoPedidoUseCase(
            ListarGestaoPedidoInterface listarGestaoPedidoInterface){
            return new ListarGestaoPedidoUseCase(listarGestaoPedidoInterface);
    }

}
