package Oppgave_2;

public class MainTest {

	public static void main(String[] args) {
		
		
		DobbeltKjedetOrdnetListe<Integer> liste = new DobbeltKjedetOrdnetListe<Integer>(1,100);
		liste.leggTil(1);
		liste.leggTil(100);
		liste.leggTil(99);
		liste.leggTil(101);
		
		liste.skrivUt();
		
	}
	
}
