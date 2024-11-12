package br.com.fiap.tc.gestaopedidos_api.application.controller;


import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.mapper.GestaoPedidoDtoMapper;
import br.com.fiap.tc.gestaopedidos_api.domain.output.GestaoPedidoResponse;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.ListarGestaoPedidoUseCase;
import br.com.fiap.tc.gestaopedidos_api.infra.repository.GestaoPedidoEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/gestaopedidos")
public class ListarGestaoPedidoController {

    private final GestaoPedidoEntityMapper gestaoPedidoEntityMapper;
    private final ListarGestaoPedidoUseCase listarGestaoPedidoUseCase;
    private final GestaoPedidoDtoMapper gestaoPedidoDtoMapper;

    @GetMapping
    public ResponseEntity<List<GestaoPedidoResponse>>listarGestaoPedidos(){
        List<GestaoPedido> pedidos = listarGestaoPedidoUseCase.listarGestaoPedidos();
        List<GestaoPedidoResponse> listaGestaoPedidoResponse=pedidos.stream().map(gestaoPedidoDtoMapper::toGestaoPedidoResponse).toList();
        return  ResponseEntity.ok(listaGestaoPedidoResponse);
    }


}
