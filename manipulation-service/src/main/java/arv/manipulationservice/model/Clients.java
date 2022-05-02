package arv.manipulationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(mappedBy = "clients")
    private List<Orders> orders = new ArrayList<>();
}
