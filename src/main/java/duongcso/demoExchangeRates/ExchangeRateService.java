package duongcso.demoExchangeRates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ExchangeRateService {
	@Value("${openexchangerates.apikey}")
	private String apiKey;
	private final String apiUrl = "https://openexchangerates.org/api/latest.json";
	@Autowired
	private final RestTemplate restTemplate;
	
	public ExchangeRateService(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	public ExchangeRate getAllExchangeRate() {
		String url = apiUrl+ "?app_id=" + apiKey;
		return restTemplate.getForObject(url, ExchangeRate.class);
	}
	public ExchangeRate getExchangeRate(String baseCurrency, String targetCurrency) {
		String url = apiUrl + "?app_id=" + apiKey + "&base=" + baseCurrency + "&symbols=" + 
				targetCurrency;
		return restTemplate.getForObject(url, ExchangeRate.class);
	}
}
