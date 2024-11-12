package br.com.fiap.tc.gestaopedidos_api.infra.config;

import br.com.fiap.tc.gestaopedidos_api.domain.gateway.BuscarGestaoPedidoPorIdInterface;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.BuscarGestaoPedidoPorIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarGestaoPedidoPorIdConfig {

    @Bean
    public BuscarGestaoPedidoPorIdUseCase buscarGestaoPedidoPorIdUseCase(BuscarGestaoPedidoPorIdInterface buscarGestaoPedidoPorIdInterface){
        return new BuscarGestaoPedidoPorIdUseCase(buscarGestaoPedidoPorIdInterface);
    }

}
