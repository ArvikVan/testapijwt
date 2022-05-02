package arv.manipulationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long price;
    private LocalDateTime created = LocalDateTime.now();
    @ManyToOne(fetch = FetchType.EAGER)
    private Clients clients;

    public static Orders of(Long id, Long price, LocalDateTime created, Clients clients) {
        Orders orders = new Orders();
        orders.id = id;
        orders.price = price;
        orders.created = LocalDateTime.now();
        orders.clients = clients;
        return orders;
    }
}
