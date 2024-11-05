package br.com.fiap.tc.gestaopedidos_api.infra.repository;

import br.com.fiap.tc.gestaopedidos_api.infra.entity.GestaoPedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestaoPedidoRepository extends JpaRepository<GestaoPedidoEntity, Long> {
}
