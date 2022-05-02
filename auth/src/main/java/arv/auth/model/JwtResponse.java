package arv.auth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ArvikV
 * @version 1.0
 * @since 01.05.2022
 * модель для получения токена
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {
    private String jwtToken;
}
