package br.com.fiap.tc.gestaopedidos_api.infra.repository;


import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.infra.entity.GestaoPedidoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GestaoPedidoEntityMapper {


    GestaoPedidoEntityMapper INSTANCE = Mappers.getMapper(GestaoPedidoEntityMapper.class);

    /**
     * @param gestaopedidoEntity
     * @return
     */
    GestaoPedido toGestaoPedidoResponse(GestaoPedidoEntity gestaopedidoEntity);


    /**
     * @param gestaoPedido
     * @return
     */
    GestaoPedidoEntity toEntity(GestaoPedido gestaoPedido);



}
