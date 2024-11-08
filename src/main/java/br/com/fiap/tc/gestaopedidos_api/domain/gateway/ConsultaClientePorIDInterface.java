package br.com.fiap.tc.gestaopedidos_api.domain.gateway;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.Cliente;

public interface ConsultaClientePorIDInterface {

    /**
     * @param id
     * @return
     */
    Cliente consultaPorId(final Long id );

}
