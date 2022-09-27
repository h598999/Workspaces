package Oppgave_4;

public class TabellHaug<T extends Comparable<T>> {
private T[] data;
private int antall;// antall elementer
private static final int STDK = 100;
public TabellHaug() {
 data = (T[]) new Comparable[STDK];
 antall = 0;
}
 public boolean erTom() {
 return antall == 0;
}

 public void leggTilElement(T el) {
 if (antall == data.length){
 utvidTabell();
 }
 data[antall] = el; // Plasser den nye helt sist
 antall++;
 if (antall > 1){
 reparerOpp(); // Bytt om oppover hvis nødvendig
 }
}
 private void reparerOpp() {
 
	 int sistlagttil = antall-1;
	 int foreldreindeks = (antall/2);
	 boolean ferdig = false;
	 while(!ferdig&&sistlagttil!=0) {
		 if (data[sistlagttil].compareTo(data[foreldreindeks])>0) {
			 T temp = data[sistlagttil];
			 data[sistlagttil] = data[foreldreindeks];
			 data[foreldreindeks] = temp;
			 sistlagttil = foreldreindeks;
			 foreldreindeks = (sistlagttil-1)/2;
		 } else {
			 ferdig = true;
		 }
	 }
	 
}
 public boolean erHaug(T data[]) {
return erHaug(data,0,antall-1);
}
 private boolean erHaug(T data[], int r, int m) { 
	 
	 if (r > (m-1)/2) {
		 return true;
	 }
	 
	 if (data[r].compareTo(data[2*r+1])>0 && erHaug(data, r*2+1, m)&&data[r].compareTo(data[r*2+2])>0 &&
			 erHaug(data, r*2+2, m)) {
		 return true;
	 } else {
		 return false;
	 }
	 
 }
 private void utvidTabell() {
	 
	 
 }
}//class
