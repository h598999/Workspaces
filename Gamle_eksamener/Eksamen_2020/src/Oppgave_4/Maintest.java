package Oppgave_4;

public class Maintest {

	public static void main(String[] args) {
		KjedetUordnetListe<Integer> liste = new KjedetUordnetListe<Integer>();
		liste.settInn(3);
		liste.settInn(2);
		liste.settInn(5);
		System.out.println(liste.toString());
		
	}
	
}
