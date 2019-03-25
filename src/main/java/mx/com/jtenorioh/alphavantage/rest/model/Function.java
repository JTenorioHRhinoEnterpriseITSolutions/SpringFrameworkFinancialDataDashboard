package mx.com.jtenorioh.alphavantage.rest.model;

public class Function {
	private String functionId;
	private String description;

	public Function() {
	}

	public Function(String functionId, String description) {
		super();
		this.functionId = functionId;
		this.description = description;
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Function [functionId=" + functionId + ", description=" + description + "]";
	}

}
