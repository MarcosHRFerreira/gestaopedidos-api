package br.com.fiap.tc.gestaopedidos_api.domain.mapper;

import br.com.fiap.tc.gestaopedidos_api.domain.input.CadastrarGestaoPedidoRequest;
import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.output.GestaoPedidoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GestaoPedidoDtoMapper {


    /**
     * @param cadastrarGestaoPedidoRequest
     * @return
     */
    @Mapping(target = "pedidoId", ignore = true)
    GestaoPedido toGestaoPedido(CadastrarGestaoPedidoRequest cadastrarGestaoPedidoRequest);

//    /**
//     * @param atualizarGestaoPedidoRequest
//     * @return
//     */
//    @Mapping(target = "gestaopedidoId", ignore = true)
//    GestaoPedido toGestaoPedido(AtualizarGestaoPedidoRequest atualizarGestaoPedidoRequest);

    /**
     * @param gestaoPedido
     * @return
     */
    GestaoPedidoResponse toGestaoPedidoResponse(GestaoPedido gestaoPedido);


}
