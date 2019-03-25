package mx.com.jtenorioh.alphavantage.rest.sectorperformances;

public enum SectorEnum {

	SECTOR("SECTOR ", "High Usage");

	private String function;
	private String usage;

	private SectorEnum(String function, String usage) {
		this.function = function;
		this.usage = usage;
	}

	public String getFunction() {
		return function;
	}

	public String getUsage() {
		return usage;
	}

}
