package models;

public class Anime extends Movie{
	private Integer pen;

	public Anime(String name, Integer price, Integer pen) {
		super(name, price);
		this.pen = pen;
	}

	public Integer getPen() {
		return pen;
	}

	public void setPen(Integer pen) {
		this.pen = pen;
	}
}
