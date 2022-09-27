package Entiteter;

public class Vare {

	private int id;
	private String barcode;
	private int antall;
	public int getAntall() {
		return antall;
	}
	public void setAntall(int antall) {
		this.antall = antall;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	@Override
	public boolean equals(Object vare) {
		boolean erLike = false;
		Vare nyVare = (Vare) vare;
		if ((nyVare.getBarcode().equals(this.getBarcode())&&(nyVare.getId()==this.getId())))
			erLike = true;
		
		return erLike;
		
	}
	
	
	
	
}
