package arv.manipulationservice.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author ArvikV
 * @version 1.0
 * @since 01.05.2022
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
    /**
     * задаем логин пароль и роли
     * @param username the username identifying the user whose data is required.
     * @return на выходе логин пароль и роль, в данном случае ролей нет, лист для их содержания
     * @throws UsernameNotFoundException ловим ексепшны
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("admin", "password", new ArrayList<>());
    }
}
