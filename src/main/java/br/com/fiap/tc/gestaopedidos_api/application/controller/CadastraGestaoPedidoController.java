package br.com.fiap.tc.gestaopedidos_api.application.controller;

import br.com.fiap.tc.gestaopedidos_api.domain.entity.GestaoPedido;
import br.com.fiap.tc.gestaopedidos_api.domain.input.CadastrarGestaoPedidoRequest;
import br.com.fiap.tc.gestaopedidos_api.domain.mapper.GestaoPedidoDtoMapper;
import br.com.fiap.tc.gestaopedidos_api.domain.output.GestaoPedidoResponse;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.CadastrarGestaoPedidoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RequiredArgsConstructor
@RestController
@RequestMapping("/gestaopedidos")

public class CadastraGestaoPedidoController {

    private final GestaoPedidoDtoMapper gestaoPedidoDtoMapper;
    private final CadastrarGestaoPedidoUseCase cadastrarGestaoPedidoUseCase;


    @PostMapping
    public ResponseEntity<GestaoPedidoResponse>cadastrarGestaoPedido(@RequestBody CadastrarGestaoPedidoRequest cadastrarGestaoPedidoRequest){


        GestaoPedido gestaoPedido=gestaoPedidoDtoMapper.toGestaoPedido(cadastrarGestaoPedidoRequest);

        GestaoPedido gestaopedidoCadastrado = cadastrarGestaoPedidoUseCase.cadastraGestaoPedido(gestaoPedido);

        GestaoPedidoResponse gestaoPedidoResponse = gestaoPedidoDtoMapper.toGestaoPedidoResponse(gestaopedidoCadastrado);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(gestaoPedidoResponse.pedidoId())
                .toUri();

        return ResponseEntity.created(uri).body(gestaoPedidoResponse);

    }


}
