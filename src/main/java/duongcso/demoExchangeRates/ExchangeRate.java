package duongcso.demoExchangeRates;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRate {
	private String disclaimer;
    private String license;
    private long timestamp;
    private String base;
    private Map<String, Double> rates;
    
	public ExchangeRate(String disclaimer, String license, long timestamp, String base, Map<String, Double> rates) {

		this.disclaimer = disclaimer;
		this.license = license;
		this.timestamp = timestamp;
		this.base = base;
		this.rates = rates;
	}
	public String getDisclaimer() {
		return disclaimer;
	}
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Map<String, Double> getRates() {
		return rates;
	}
	public void setRates(Map<String, Double> rates) {
		this.rates = rates;
	}
	
}
