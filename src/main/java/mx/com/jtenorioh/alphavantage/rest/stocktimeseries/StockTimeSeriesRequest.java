package mx.com.jtenorioh.alphavantage.rest.stocktimeseries;

import mx.com.jtenorioh.alphavantage.rest.api.request.GeneralRequest;
import mx.com.jtenorioh.alphavantage.rest.util.IntervalEnum;
import mx.com.jtenorioh.alphavantage.rest.util.OutputSizeEnum;

public class StockTimeSeriesRequest implements GeneralRequest {

	private StockTimeSeriesEnum timeSeriesFunction;
	private String symbol;
	private IntervalEnum intervalEnum;
	private OutputSizeEnum outputSizeEnum;
	private String keywords;
	private String apikey;

	@Override
	public String queryParameters(String function) {
		StringBuilder builder = new StringBuilder();
		builder.append(GeneralRequest.URL_QUERY);
		if (function != null) {
			if (function.equals(StockTimeSeriesEnum.INTRADAY.getFunction())) {
				builder.append("function=").append(function);
			} else if (function.equals(StockTimeSeriesEnum.DAILY.getFunction())) {
				builder.append("function=").append(function);
			} else if (function.equals(StockTimeSeriesEnum.DAILY_ADJUSTED.getFunction())) {
				builder.append("function=").append(function);
			} else if (function.equals(StockTimeSeriesEnum.WEEKLY.getFunction())) {
				builder.append("function=").append(function);
			} else if (function.equals(StockTimeSeriesEnum.WEEKLY_ADJUSTED.getFunction())) {
				builder.append("function=").append(function);
			} else if (function.equals(StockTimeSeriesEnum.MONTHLY.getFunction())) {
				builder.append("function=").append(function);
			} else if (function.equals(StockTimeSeriesEnum.MONTHLY_ADJUSTED.getFunction())) {
				builder.append("function=").append(function);
			} else if (function.equals(StockTimeSeriesEnum.QUOTE_ENDPOINT.getFunction())) {
				builder.append("function=").append(function);
			}
			if (symbol != null) {
				if (!function.equals(StockTimeSeriesEnum.SEARCH_ENDPOINT.getFunction())) {
					builder.append("&symbol=").append(symbol);
				}
			}
			if (intervalEnum != null) {
				builder.append("&interval=").append(intervalEnum.getIntervalParameter());
			}
			if (outputSizeEnum != null) {
				builder.append("&outputsize=").append(outputSizeEnum.getOutPutSize());
			}
			if (apikey != null) {
				builder.append("&apikey=").append(apikey);
			}
			if (function.equals(StockTimeSeriesEnum.SEARCH_ENDPOINT.getFunction())) {
				builder.append("function=").append(function);
				if (keywords != null) {
					builder.append("&keywords=").append(keywords);
				}
			}
			builder.append("&apikey=").append("demo");
			return builder.toString();
		}
		return "";
	}

	public StockTimeSeriesEnum getTimeSeriesFunction() {
		return timeSeriesFunction;
	}

	public void setTimeSeriesFunction(StockTimeSeriesEnum timeSeriesFunction) {
		this.timeSeriesFunction = timeSeriesFunction;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public IntervalEnum getIntervalEnum() {
		return intervalEnum;
	}

	public void setIntervalEnum(IntervalEnum intervalEnum) {
		this.intervalEnum = intervalEnum;
	}

	public OutputSizeEnum getOutputSizeEnum() {
		return outputSizeEnum;
	}

	public void setOutputSizeEnum(OutputSizeEnum outputSizeEnum) {
		this.outputSizeEnum = outputSizeEnum;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	@Override
	public String toString() {
		return "StockTimeSeriesRequest [timeSeriesFunction=" + timeSeriesFunction + ", symbol=" + symbol
				+ ", intervalEnum=" + intervalEnum + ", outputSizeEnum=" + outputSizeEnum + ", keywords=" + keywords
				+ ", apikey=" + apikey + "]";
	}

}
