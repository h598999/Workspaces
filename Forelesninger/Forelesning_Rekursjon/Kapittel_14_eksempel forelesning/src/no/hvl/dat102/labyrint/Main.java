package no.hvl.dat102.labyrint;

public class Main {

	public static void main(String[] args) {
		Labyrint labyrint = new Labyrint();
		System.out.println(labyrint);
		Stifinner sf = new Stifinner(labyrint);
		sf.finnSti(0, 0);
		System.out.println();
		System.out.println(labyrint);
		System.out.println(sf.finnSti(0, 0));
		
	}

}
