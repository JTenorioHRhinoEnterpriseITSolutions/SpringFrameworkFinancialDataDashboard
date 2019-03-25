package mx.com.jtenorioh.alphavantage.rest.forex;

import mx.com.jtenorioh.alphavantage.rest.api.request.GeneralRequest;
import mx.com.jtenorioh.alphavantage.rest.util.IntervalEnum;
import mx.com.jtenorioh.alphavantage.rest.util.OutputSizeEnum;

public class ForeignExchangeFXRequest implements GeneralRequest {
	private ForeignExhangeFXEnum foreignExhangeFXEnum;
	private String fromCurrency;
	private String toCurrency;
	private String fromSymbol;
	private String toSymbol;
	private OutputSizeEnum outputSizeEnum;
	private IntervalEnum intervalEnum;
	private String apikey;
	private String dataType;

//	function=CURRENCY_EXCHANGE_RATE &from_currency=BTC	&to_currency=CNY								&apikey=demo
//	function=CURRENCY_EXCHANGE_RATE &from_currency=USD	&to_currency=JPY								&apikey=demo
//	function=FX_INTRADAY            &from_symbol=EUR	&to_symbol=USD&interval=5min					&apikey=demo
//	function=FX_INTRADAY            &from_symbol=EUR	&to_symbol=USD&interval=5min&outputsize=full	&apikey=demo
//	function=FX_INTRADAY            &from_symbol=EUR	&to_symbol=USD&interval=5min					&apikey=demo	&datatype=csv
//	function=FX_DAILY				&from_symbol=EUR	&to_symbol=USD									&apikey=demo
//  function=FX_DAILY				&from_symbol=EUR	&to_symbol=USD									&outputsize=full&apikey=demo
// 	function=FX_DAILY				&from_symbol=EUR	&to_symbol=USD									&apikey=demo&datatype=csv
//  function=DIGITAL_CURRENCY_WEEKLY 					&symbol=BTC 	&market=CNY 					&apikey=demo
//	function=DIGITAL_CURRENCY_WEEKLY 					&symbol=BTC		&market=CNY						&apikey=demo	&datatype=csv
//	function=DIGITAL_CURRENCY_MONTHLY					&symbol=BTC		&market=CNY						&apikey=demo
//  function=DIGITAL_CURRENCY_MONTHLY 					&symbol=BTC		&market=CNY						&apikey=demo	&datatype=csv

	@Override
	public String queryParameters(String function) {
		StringBuilder builder = new StringBuilder();
		builder.append(GeneralRequest.URL_QUERY);
		if (function != null) {
			if (function.equals(ForeignExhangeFXEnum.CURRENCY_EXCHANGE_RATE.getFunction())) {
				builder.append("function=").append(function);
				if (fromCurrency != null) {
					builder.append("&from_currency=").append(fromCurrency);
					builder.append("&to_currency=").append(toCurrency);
				}
			} else if (function.equals(ForeignExhangeFXEnum.FX_INTRADAY.getFunction())) {
				builder.append("function=").append(function);
				builder.append("&from_symbol=").append(fromSymbol);
				builder.append("&to_symbol=").append(toSymbol);
				if (intervalEnum != null) {
					if (intervalEnum.equals(IntervalEnum.ONE_MINUTE.getIntervalParameter())) {
						builder.append("&interval=").append(intervalEnum.ONE_MINUTE.getIntervalParameter());
					}
				}
			} else if (function.equals(ForeignExhangeFXEnum.FX_DAILY.getFunction())) {
				builder.append("function=").append(function);
				builder.append("&from_symbol=").append(fromSymbol);
				builder.append("&to_symbol=").append(toSymbol);
				if(outputSizeEnum!= null) {
					builder.append("&outputsize=").append(outputSizeEnum.getOutPutSize());
				}
			} else if (function.equals(ForeignExhangeFXEnum.FX_WEEKLY.getFunction())) {
				builder.append("function=").append(function);
			}
			builder.append("&from_symbol=").append(fromCurrency);
			builder.append("&to_symbol=").append(toCurrency);
			if (outputSizeEnum != null) {
				builder.append("&outputsize=").append(outputSizeEnum);
			}
			if (intervalEnum != null) {
				builder.append("&interval=").append(intervalEnum.getIntervalParameter());
			}
			builder.append("&apikey=demo");
			return builder.toString();
		}
		return "";
	}

	public ForeignExhangeFXEnum getForeignExhangeFXEnum() {
		return foreignExhangeFXEnum;
	}

	public void setForeignExhangeFXEnum(ForeignExhangeFXEnum foreignExhangeFXEnum) {
		this.foreignExhangeFXEnum = foreignExhangeFXEnum;
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

	public OutputSizeEnum getOutputSizeEnum() {
		return outputSizeEnum;
	}

	public void setOutputSizeEnum(OutputSizeEnum outputSizeEnum) {
		this.outputSizeEnum = outputSizeEnum;
	}

	public IntervalEnum getIntervalEnum() {
		return intervalEnum;
	}

	public void setIntervalEnum(IntervalEnum intervalEnum) {
		this.intervalEnum = intervalEnum;
	}

	@Override
	public String toString() {
		return "ForeignExchangeFXRequest [foreignExhangeFXEnum=" + foreignExhangeFXEnum + ", fromCurrency="
				+ fromCurrency + ", toCurrency=" + toCurrency + ", outputSizeEnum=" + outputSizeEnum + ", intervalEnum="
				+ intervalEnum + "]";
	}

}
