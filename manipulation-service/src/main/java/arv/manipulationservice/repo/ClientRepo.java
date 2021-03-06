package arv.manipulationservice.repo;

import arv.manipulationservice.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
public interface ClientRepo extends JpaRepository<Clients, Long> {
}
