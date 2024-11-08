package br.com.fiap.tc.gestaopedidos_api.infra.adapter.out;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.Cliente;
import br.com.fiap.tc.gestaopedidos_api.domain.gateway.ConsultaClientePorIDInterface;
import br.com.fiap.tc.gestaopedidos_api.domain.mapper.ClienteDtoMapper;
import br.com.fiap.tc.gestaopedidos_api.infra.feign.ClienteConexaoNaoEncontrada;
import br.com.fiap.tc.gestaopedidos_api.infra.feign.ConsultarClientePorID;
import lombok.RequiredArgsConstructor;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ConsultarClientePorIDAdapter implements ConsultaClientePorIDInterface {

    @Value("${application.client.host}")
    String clientHost;

    private final ConsultarClientePorID consultarClientePorID;

    private final ClienteDtoMapper clienteDtoMapper;

    @Override
    public Cliente consultaPorId(Long id) {
        try {

            var clienteResponse = consultarClientePorID.consultaClientePorID(id);

            return clienteDtoMapper.toCliente(clienteResponse);

        } catch (feign.RetryableException e) {
                     throw new ClienteConexaoNaoEncontrada("Erro de conexão: não foi possível acessar o serviço de clientes. " + clientHost );
        }
    }
}
