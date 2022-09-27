package Oppgave_3;

public class TabellKoe<T> {
	
	private final static int STDK = 100;
	 private int bak;
	 private T[] koe; 
	 public TabellKoe() {
	 this(STDK);
	} 
	 public TabellKoe (int startKapasitet){
	 bak = 0; 
	 koe = (T[])(new Object[startKapasitet]);
	 }
	 public void innKoe(T element) {
		 
		 koe[bak] = element;
		 bak++;
		 
		 
	 }
	 public T utKoe() {
		 if (erTom()) {
			 return null;
		 } else {
			T el = koe[0];
			
			for (int i = 0; i<bak-1;i++) {
				koe[i] = koe[i+1];
			}
			bak--;
			koe[bak] = null;
			
			return el;
		 }
		 
	 }
	 
	 public T foerste()  {
	  if (erTom()) {
		  return null;
	  } else {
		  return koe[0];
	  }
	 }
	 
	 private void utvid() { 
	 // Denne metoden utvider tabellområdet ved å lage en
	 // større tabell og kopierer referansene
	 // Du antar at denne metoden eksisteter 
	
	 }
	 
	 public boolean erTom() {
	 return (bak == 0);
	}
	public int antall() {
	 return bak;
	}
	}//class


