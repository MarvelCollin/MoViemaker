package models;

public abstract class Movie{
	private String title;
	private Integer year;
	
	public Movie(String title, Integer year) {
		super();
		this.title = title;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Integer getYear() {
		return year;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public abstract void sayInfo();
}
