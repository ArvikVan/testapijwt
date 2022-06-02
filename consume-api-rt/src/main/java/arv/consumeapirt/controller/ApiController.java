package arv.consumeapirt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 20.05.2022
 */
@RestController
public class ApiController {
    @Autowired
    private RestTemplate restTemplate;
    private static final String url = "https://jsonplaceholder.typicode.com/users";

    @GetMapping("/consume-api-by-rest-template")
    public List<Object> getSomeApi() {
        Object[] hhruapi = restTemplate.getForObject(url, Object[].class);
        assert hhruapi != null;
        return Arrays.asList(hhruapi);
    }
}
