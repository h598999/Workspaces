package no.hvl.dat102.bagklient;

public class Person {

	private String navn;
	private int nr;

	// Konstruktører

	public Person() {
		this("", 0);
	}

	public Person(String navn, int nr) {
		this.navn = navn;
		this.nr = nr;
	}
	

	// Overkjøring av equals-metoden
	/**
	 * @return navn
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * @return  faar
	 */
	public int getNr() {
		return nr;
	}
	
	public String toString() {
		return navn + " " + nr;
	}

	@Override
   public boolean equals(Object andre) {
		if (this == andre) {
			return true;
		}
		if (andre == null) {
			return false;

		}
		if (getClass() != andre.getClass()) {
			return false;
		}
		Person denAndre = (Person) andre;
		boolean like = this.navn == denAndre.getNavn() && this.nr == denAndre.getNr();
        return like;
   }

}// class