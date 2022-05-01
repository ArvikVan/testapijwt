package arv.testapijwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private final LocalDateTime created = LocalDateTime.now();
}
