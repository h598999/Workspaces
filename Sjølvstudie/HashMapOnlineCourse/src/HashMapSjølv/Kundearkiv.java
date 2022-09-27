package HashMapSjølv;

public class Kundearkiv {
	
	private Kunde[] kunde;
	private int antall;
	private final int DEFAULT_CAPACITY = 25;
	
	public Kundearkiv() {
	kunde =new Kunde[DEFAULT_CAPACITY];	
	antall = 0;
	}
	
	public Kundearkiv(int antall) {
		kunde= new Kunde[antall];
		antall = 0;
	}
	
	public boolean leggTil(Kunde nyKunde) {
		boolean lagtTil = false;
		if (!contains(nyKunde)) {
			utvid();
			kunde[antall] = nyKunde;
			antall++;
			lagtTil = true;
		}
		return lagtTil;
	}
	
	public boolean contains(Kunde enKunde) {
		boolean contained = false;
		int i = 0;
		while(i<antall&&!contained) {
			if (kunde[i]==enKunde) {
				contained = true;
			} else {
				i++;
			}
		}
		return contained;
	}
	
	public void utvid() {
		if (antall == kunde.length) {
			Kunde[] temp = new Kunde[antall*2];
			for (int i = 0; i<antall; i++) {
				temp[i] = kunde[i];
			}
			kunde = temp;
		}
	}

}
