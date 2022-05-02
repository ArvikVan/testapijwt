package arv.manipulationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ManipulationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManipulationServiceApplication.class, args);
    }

}
