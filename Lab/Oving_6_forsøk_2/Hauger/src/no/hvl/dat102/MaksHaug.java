package no.hvl.dat102;

public final class MaksHaug<T extends Comparable<? super T>> implements MaksHaugInterface<T> {
	private T[] haug;
	private int antall; 
	private static final int STANDARD_KAPASITET = 100;

	public MaksHaug() {
		this(STANDARD_KAPASITET); 
	}

	public MaksHaug(int startkapasitet) {
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Comparable[startkapasitet + 1];
		haug = tmp;
		antall = 0;
	}

	public MaksHaug(T[] elementer) {
		this(elementer.length);
		antall = elementer.length;

		for (int index = 1; index <= antall; index++)
			haug[index] = elementer[index - 1];

		for (int node = antall / 2; node > 0; node--)
			reparerNed(node);
	} 

	private boolean harVB(int node) {
		return 2 * node <= antall;
	}

	private boolean harHB(int node) {
		return 2 * node + 1 <= antall;
	}

	@Override
	public void leggTil(T nyttElement) {
		// Har inkludert reparerOpp-metoden frå forelesing
		
		int nyPos = antall + 1;
		int forelder = nyPos / 2;
		
		while (forelder > 0 && nyttElement.compareTo(haug[forelder]) > 0) {
			haug[nyPos] = haug[forelder];
			nyPos = forelder;
			forelder = nyPos / 2;
		}
		
		haug[nyPos] = nyttElement;
		antall++;
	} 

	@Override
	public T fjernMaks() {
		T rot = null;

		if (!erTom()) {
			rot = haug[1];
			haug[1] = haug[antall];
			antall--;
			reparerNed(1);
		}

		return rot;
	} 

	@Override
	public T finnMaks() {
		T rot= null;
		if (!erTom())
			rot = haug[1];
		return rot;
	} 

	@Override
	public boolean erTom() {
		return antall < 1;
	} 

	@Override
	public int getAntall() {
		return antall;
	} 

	@Override
	public void toem() {
		for (int i = 1; i <= antall; i++) {
			haug[i] = null;
		}
		antall = 0;
	} 

	/*
	 * Vi har et undertre med rot i posisjon node. Undertreet er en haug
	 * bortsett fra at roten kanskje ikke oppyller kravet om å være
	 * større enn barna sine. Metoden reparer undertreet slik at undertreet
	 * er en haug etter at metoden er utført.
	 */
	private void reparerNed(int node) {
		boolean ferdig = false;
		
		T verdiRot = haug[node];
		int posVB = 2 * node;
		
		while (!ferdig && harVB(node)) {
			// finn posisjon for største barn
			int posStorste = posVB;
			int posHB = posVB + 1;
			
			if (harHB(node) && haug[posHB].compareTo(haug[posStorste]) > 0) {
				posStorste = posHB;
			}
			
			// samanlikner verdi i roten med storste barn
			if (verdiRot.compareTo(haug[posStorste]) < 0) {
				haug[node] = haug[posStorste];
				node = posStorste;
				posVB = 2 * node;
			} else {
				ferdig = true;
			}
		}
		
		haug[node] = verdiRot;
	} 

}
