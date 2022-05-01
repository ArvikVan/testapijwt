package arv.testapijwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ArvikV
 * @version 1.0
 * @since 01.05.2022
 * модель для отправки логина и пароля в ответ на который получим токен
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest {
    private String username;
    private String password;
}
