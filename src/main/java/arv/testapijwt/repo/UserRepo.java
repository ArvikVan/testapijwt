package arv.testapijwt.repo;

import arv.testapijwt.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
public interface UserRepo extends JpaRepository<Users, Long> {
}
