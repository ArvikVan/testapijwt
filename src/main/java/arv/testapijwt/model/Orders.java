package arv.testapijwt.model;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long price;
    private LocalDateTime created = LocalDateTime.now();
    @OneToMany(fetch = FetchType.EAGER)
    private List<Clients> clients = new ArrayList<>();
}
