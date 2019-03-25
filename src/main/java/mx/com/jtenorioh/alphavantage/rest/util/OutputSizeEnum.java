package mx.com.jtenorioh.alphavantage.rest.util;

import org.codehaus.jackson.annotate.JsonProperty;

public enum OutputSizeEnum {
	@JsonProperty("compact")
	COMPACT("compact"), @JsonProperty("full")
	FULL("full");

	private String outPutSize;

	private OutputSizeEnum(String outPutSize) {
		this.outPutSize = outPutSize;
	}

	public String getOutPutSize() {
		return outPutSize;
	}

}
