package br.com.fiap.tc.gestaopedidos_api.infra.config;

import br.com.fiap.tc.gestaopedidos_api.domain.gateway.CadastrarGestaoPedidoInterface;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.CadastrarGestaoPedidoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadastaGestaoPedidoConfig {

    @Bean
    public CadastrarGestaoPedidoUseCase cadastrarGestaoPedidoUseCase (CadastrarGestaoPedidoInterface cadastrarGestaoPedidoInterface){
        return  new CadastrarGestaoPedidoUseCase(cadastrarGestaoPedidoInterface);
    }

}
