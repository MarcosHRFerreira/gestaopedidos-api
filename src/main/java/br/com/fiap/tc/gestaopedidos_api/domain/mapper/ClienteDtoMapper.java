package br.com.fiap.tc.gestaopedidos_api.domain.mapper;


import br.com.fiap.tc.gestaopedidos_api.domain.entity.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ClienteDtoMapper {


    ClienteDtoMapper INSTANCE = Mappers.getMapper(ClienteDtoMapper.class);

    Cliente toCliente(Cliente cliente);








}
