package mx.com.jtenorioh.alphavantage.rest.model;

public class Category {
	private int id;
	private String description;

	public Category() {
	}

	public Category(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", description=" + description + "]";
	}

}
