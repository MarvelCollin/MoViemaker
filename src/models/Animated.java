package models;

public class Animated extends Movie{
	private Integer pen;

	public Animated(String title, Integer year, Integer pen) {
		super(title, year);
		this.pen = pen;
	}

	public Integer getPen() {
		return pen;
	}

	public void setPen(Integer pen) {
		this.pen = pen;
	}

	@Override
	public void sayInfo() {
		System.out.println("Nama Movie : " + getTitle());
		System.out.println("Keluar pada tahun : " + getYear());
		System.out.println("Type : Animated");
		System.out.println("Total Pen : " + getPen());
		System.out.println();
	}
	
	
}
