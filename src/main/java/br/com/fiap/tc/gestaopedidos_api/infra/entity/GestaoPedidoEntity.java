package br.com.fiap.tc.gestaopedidos_api.infra.entity;

import br.com.fiap.tc.gestaopedidos_api.domain.enums.StatusPedidoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "gestaopedido")
public class GestaoPedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedidoId;
    @NonNull
    private Long clienteId;
    @NonNull
    private LocalDateTime datapedido;
    @Enumerated(EnumType.STRING)
    private StatusPedidoEnum statuspedido;


}
