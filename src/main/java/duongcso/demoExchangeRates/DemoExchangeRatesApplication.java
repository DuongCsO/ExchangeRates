package duongcso.demoExchangeRates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoExchangeRatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoExchangeRatesApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {
	   return new RestTemplate();
	}
}
