package br.com.fiap.tc.gestaopedidos_api.infra.feign;


import br.com.fiap.tc.gestaopedidos_api.domain.entity.Cliente;
import br.com.fiap.tc.gestaopedidos_api.infra.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "clientes", primary = false, url = "${application.client.host}",
        configuration = FeignConfiguration.class)
public interface ConsultarClientePorID {


    /**
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Cliente consultaClientePorID(@PathVariable("id") Long id);





}

