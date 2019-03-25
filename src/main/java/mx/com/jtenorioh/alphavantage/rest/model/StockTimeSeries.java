package mx.com.jtenorioh.alphavantage.rest.model;

public class StockTimeSeries {

	private double open;
	private double high;
	private double low;
	private double close;
	private double volume;

	public StockTimeSeries() {

	}

	public StockTimeSeries(double open, double high, double low, double close, double volume) {
		super();
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "StockTimeSeries [open=" + open + ", high=" + high + ", low=" + low + ", close=" + close + ", volume="
				+ volume + "]";
	}

}
