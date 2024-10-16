package models;

public class Movie {
	private String title;
	private Integer price;
	
	public Movie(String title, Integer price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}
