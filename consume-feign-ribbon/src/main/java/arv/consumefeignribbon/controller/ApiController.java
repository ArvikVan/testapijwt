package arv.consumefeignribbon.controller;

import arv.consumefeignribbon.service.ApiService;
import arv.consumefeignribbon.service.ApiServiceProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 20.05.2022
 */
@RestController
@EnableFeignClients(basePackageClasses = ApiServiceProxy.class)
public class ApiController implements ApiService {

    private final ApiServiceProxy apiServiceProxy;

    public ApiController(ApiServiceProxy apiServiceProxy) {
        this.apiServiceProxy = apiServiceProxy;
    }

    @Override
    @GetMapping("/areas/countries")
    public List<Object> getCounties() {
        return apiServiceProxy.getCounties();
    }

    @Override
    @GetMapping("/areas")
    public List<Object> getCities() {
        return apiServiceProxy.getCities();
    }
}
