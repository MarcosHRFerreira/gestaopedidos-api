package br.com.fiap.tc.gestaopedidos_api.application.controller;

import br.com.fiap.tc.gestaopedidos_api.domain.output.GestaoPedidoDeletadoResponse;
import br.com.fiap.tc.gestaopedidos_api.domain.output.GestaoPedidoResponse;
import br.com.fiap.tc.gestaopedidos_api.domain.usecase.DeletarGestaoPedidoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gestaopedidos")
public class DeletarGestaoPedidoController {

    private final DeletarGestaoPedidoUseCase deletarGestaoPedidoUseCase;

    @DeleteMapping("/{id}")
    public ResponseEntity<GestaoPedidoDeletadoResponse>deletarGestaoPedido(@PathVariable Long id){

        boolean pedidoFoiDeletado= deletarGestaoPedidoUseCase.deletarGestaoPedido(id);

        return ResponseEntity.ok(new GestaoPedidoDeletadoResponse(pedidoFoiDeletado));

    }


}
