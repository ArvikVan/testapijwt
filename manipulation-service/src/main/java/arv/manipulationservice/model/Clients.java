package arv.manipulationservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

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
    @JsonIgnore
    @OneToMany(mappedBy = "clients", cascade = CascadeType.ALL)
    private Set<Orders> orders = new HashSet<>();
}
