package br.com.fiap.tc.gestaopedidos_api;

import br.com.fiap.tc.gestaopedidos_api.infra.feign.CustomErrorDecoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.fiap.tc.gestaopedidos_api"})
@EnableFeignClients(basePackages = {"br.com.fiap.tc.gestaopedidos_api.infra.feign"})

public class GestaopedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaopedidosApplication.class, args);
	}

	@Bean
	public CustomErrorDecoder errorDecoder() {
		return new CustomErrorDecoder();
	}


}
