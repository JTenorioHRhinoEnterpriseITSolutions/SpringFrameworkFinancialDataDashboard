package mx.com.jtenorioh.alphavantage.rest.util;

import org.codehaus.jackson.annotate.JsonProperty;

public enum IntervalEnum {

	@JsonProperty("1min")
	ONE_MINUTE("1min"),

	@JsonProperty("5min")
	FIVE_MINUTES("5min"), 

	@JsonProperty("15min")
	FIFTEEN_MINUTES("15min"), 

	@JsonProperty("30min")
	THIRTY_MINUTES("30min"), 

	@JsonProperty("60min")
	SIXTY_MINUTES("60min");

	private String intervalParameter;

	IntervalEnum(String intervalParameter) {
		this.intervalParameter = intervalParameter;
	}

	public String getIntervalParameter() {
		return intervalParameter;
	}

}
