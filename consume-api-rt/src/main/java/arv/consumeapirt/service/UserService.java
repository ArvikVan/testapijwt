package arv.consumeapirt.service;

import arv.consumeapirt.models.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ArvikV
 * @version 1.0
 * @since 07.06.2022
 */
@Service
public class UserService {
    private final RestTemplate restTemplate;

    private static final String url = "https://jsonplaceholder.typicode.com/users";


    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User[] getAllUsers() {
        return this.restTemplate.getForObject(url, User[].class);
    }
}
