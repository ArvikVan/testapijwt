package arv.consumefeignribbon.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ArvikV
 * @version 1.0
 * @since 20.05.2022
 */
@FeignClient(name = "api-service")
public interface ApiServiceProxy extends ApiService {
}
