package arv.consumefeignribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Не очевидный способ, не рабочий способ. Возможен конфликт версий
 */

@SpringBootApplication
public class ConsumeFeignRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeFeignRibbonApplication.class, args);
	}

}
