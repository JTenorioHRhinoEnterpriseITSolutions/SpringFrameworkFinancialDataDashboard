package mx.com.jtenorioh.alphavantage.rest.model;

public class ForeignExchangeFX {
	private double open;
	private double high;
	private double low;
	private double close;

	public ForeignExchangeFX() {

	}

	public ForeignExchangeFX(double open, double high, double low, double close) {
		super();
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
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

	@Override
	public String toString() {
		return "ForeignExchangeFX [open=" + open + ", high=" + high + ", low=" + low + ", close=" + close + "]";
	}

}
