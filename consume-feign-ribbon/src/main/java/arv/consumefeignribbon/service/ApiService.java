package arv.consumefeignribbon.service;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 20.05.2022
 */
public interface ApiService {

    @GetMapping("/areas/countries")
    public List<Object> getCounties();
    @GetMapping("/areas")
    public List<Object> getCities();
}
