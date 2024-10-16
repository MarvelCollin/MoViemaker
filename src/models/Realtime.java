package models;

public class Realtime extends Movie{
	private String cameraBrand;

	public Realtime(String name, Integer price, String cameraBrand) {
		super(name, price);
		this.cameraBrand = cameraBrand;
	}

	public String getCameraBrand() {
		return cameraBrand;
	}

	public void setCameraBrand(String cameraBrand) {
		this.cameraBrand = cameraBrand;
	}
}
