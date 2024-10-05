package models;

public class Realtime extends Movie{
	private Integer camera;
	
	public Realtime(String title, Integer year, Integer camera) {
		super(title, year);
		this.camera = camera;
	}

	public Integer getCamera() {
		return camera;
	}

	public void setCamera(Integer camera) {
		this.camera = camera;
	}

	@Override
	public void sayInfo() {
		System.out.println("Nama Movie : " + getTitle());
		System.out.println("Keluar pada tahun : " + getYear());
		System.out.println("Type : Realtime");
		System.out.println("Total Camera : " + getCamera());
		System.out.println();
	}
	
	
	
}
