package br.com.fiap.tc.gestaopedidos_api.application.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("br.com.fiap")
public class AppConfig {

    @Bean
    RestTemplate restTemplate(){

        RestTemplate restTemplate = new RestTemplate();

        MappingJackson2CborHttpMessageConverter converter = new MappingJackson2CborHttpMessageConverter();

        converter.setObjectMapper(new ObjectMapper());

        restTemplate.getMessageConverters().add(converter);

        return  restTemplate;

    }


}
