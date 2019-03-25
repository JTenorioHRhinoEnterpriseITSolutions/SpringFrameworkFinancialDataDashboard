package mx.com.jtenorioh.alphavantage.rest.api.response;

import org.codehaus.jackson.annotate.JsonProperty;

import mx.com.jtenorioh.alphavantage.rest.util.IntervalEnum;
import mx.com.jtenorioh.alphavantage.rest.util.OutputSizeEnum;

public class MetaData {
	public static final String META_DATA_RESPONSE_KEY = "Meta Data";
	
	@JsonProperty("Information")
	private String information;
	@JsonProperty("Symbol")
	private String symbol;
	@JsonProperty("Output Size")
	private OutputSizeEnum outputSizeEnum;
	@JsonProperty("Time Zone")
	private String timezone;
	@JsonProperty("Last Refreshed")
	private String lastRefreshed;
	@JsonProperty("Interval")
	private IntervalEnum intradayIntervalEnum;
	@JsonProperty("Notes")
	private String notes;
	@JsonProperty("From Symbol")
	private String fromCurrency;
	@JsonProperty("To Symbol")
	private String toCurrency;

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public OutputSizeEnum getOutputSizeEnum() {
		return outputSizeEnum;
	}

	public void setOutputSizeEnum(OutputSizeEnum outputSizeEnum) {
		this.outputSizeEnum = outputSizeEnum;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getLastRefreshed() {
		return lastRefreshed;
	}

	public void setLastRefreshed(String lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}

	public IntervalEnum getIntradayIntervalEnum() {
		return intradayIntervalEnum;
	}

	public void setIntradayIntervalEnum(IntervalEnum intradayIntervalEnum) {
		this.intradayIntervalEnum = intradayIntervalEnum;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

}
