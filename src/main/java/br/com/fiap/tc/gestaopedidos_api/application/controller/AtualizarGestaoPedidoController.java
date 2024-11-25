package br.com.fiap.tc.gestaopedidos_api.application.controller;


import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.input.AtualizarGestaoPedidoRequest;
import br.com.fiap.tc.gestaopedidos_api.domain.mapper.GestaoPedidoDtoMapper;
import br.com.fiap.tc.gestaopedidos_api.domain.output.GestaoPedidoResponse;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.AtualizarGestaoPedidoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/gestaopedidos")
public class AtualizarGestaoPedidoController {

    private final GestaoPedidoDtoMapper gestaoPedidoDtoMapper;
    private final AtualizarGestaoPedidoUseCase atualizarGestaoPedidoUseCase;

    @PutMapping("/{id}")
    public ResponseEntity<GestaoPedidoResponse>atualizarGestaoPedido(@PathVariable Long id,
                                                                     @RequestBody AtualizarGestaoPedidoRequest atualizarGestaoPedidoRequest){
        GestaoPedido pedidoAtualizado=atualizarGestaoPedidoUseCase.atualizarGestaoPedido(id,gestaoPedidoDtoMapper.toGestaoPedido(atualizarGestaoPedidoRequest));
        GestaoPedidoResponse gestaoPedidoResponse=gestaoPedidoDtoMapper.toGestaoPedidoResponse(pedidoAtualizado);

        return  ResponseEntity.ok(gestaoPedidoResponse);

    }


}


