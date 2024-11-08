package br.com.fiap.tc.gestaopedidos_api.infra.config;

import br.com.fiap.tc.gestaopedidos_api.domain.gateway.CadastrarGestaoPedidoInterface;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.ConsultaClientePorIDInterface;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.CadastrarGestaoPedidoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CadastaGestaoPedidoConfig {
    /**
     * @param cadastrarGestaoPedidoInterface
     * @param consultaClientePorIDInterface
     * @return
     */

    @Bean
    public CadastrarGestaoPedidoUseCase cadastrarGestaoPedidoUseCase (CadastrarGestaoPedidoInterface cadastrarGestaoPedidoInterface,
                                                                      ConsultaClientePorIDInterface consultaClientePorIDInterface){
        return  new CadastrarGestaoPedidoUseCase(cadastrarGestaoPedidoInterface,consultaClientePorIDInterface);
    }

}
