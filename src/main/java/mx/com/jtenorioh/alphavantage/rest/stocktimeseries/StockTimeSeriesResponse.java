package mx.com.jtenorioh.alphavantage.rest.stocktimeseries;

import java.util.Date;
import java.util.Map;

import mx.com.jtenorioh.alphavantage.rest.model.StockTimeSeries;

public class StockTimeSeriesResponse {
	private mx.com.jtenorioh.alphavantage.rest.api.response.MetaData metaData;
	private Map<Date, StockTimeSeries> stockTimeSeries;

	public mx.com.jtenorioh.alphavantage.rest.api.response.MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(mx.com.jtenorioh.alphavantage.rest.api.response.MetaData metaData) {
		this.metaData = metaData;
	}

	public Map<Date, StockTimeSeries> getStockTimeSeries() {
		return stockTimeSeries;
	}

	public void setStockTimeSeries(Map<Date, StockTimeSeries> stockTimeSeries) {
		this.stockTimeSeries = stockTimeSeries;
	}

}
