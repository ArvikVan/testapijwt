package arv.manipulationservice.repo;

import arv.manipulationservice.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
public interface OrderRepo extends JpaRepository<Orders, Long> {
}
