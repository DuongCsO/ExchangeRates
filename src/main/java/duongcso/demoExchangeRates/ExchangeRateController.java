package duongcso.demoExchangeRates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchangerates")
public class ExchangeRateController {
	@Autowired
	private final ExchangeRateService exchangeRateService;
	
	public ExchangeRateController(ExchangeRateService exchangeRateService) {
		this.exchangeRateService=exchangeRateService;
	}
	//Get base rate to target rate
	@GetMapping("/{base}/{target}")//ex: http://localhost:8080/api/exchangerates/USD/VND
	public ExchangeRate getExchangeRate(@PathVariable String base, @PathVariable String target) {
		return exchangeRateService.getExchangeRate(base, target);
	}
	//Get all of Exchange Rates
	@GetMapping("/") //ex: http://localhost:8080/api/exchangerates/
	public ExchangeRate getAllExchangeRate() {
		return exchangeRateService.getAllExchangeRate();
	}
}
