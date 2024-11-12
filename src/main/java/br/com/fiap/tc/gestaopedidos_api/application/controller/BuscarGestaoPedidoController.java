package br.com.fiap.tc.gestaopedidos_api.application.controller;


import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.mapper.GestaoPedidoDtoMapper;
import br.com.fiap.tc.gestaopedidos_api.domain.output.GestaoPedidoResponse;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.BuscarGestaoPedidoPorIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/gestaopedidos")
public class BuscarGestaoPedidoController {

    private final GestaoPedidoDtoMapper gestaoPedidoDtoMapper;
    private final BuscarGestaoPedidoPorIdUseCase buscarGestaoPedidoPorIdUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<GestaoPedidoResponse>buscaPedido(@PathVariable Long id){
        GestaoPedido pedidoBuscado= buscarGestaoPedidoPorIdUseCase.buscarGestaoPedidoPorId(id);

        return ResponseEntity.ok(gestaoPedidoDtoMapper.toGestaoPedidoResponse(pedidoBuscado));

    }


}
