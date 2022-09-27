package no.hvl.dat102.klient;

public class KlientLabyrint {

	public static void main(String[] args) {
		Labyrint labyrint = new Labyrint();
		
        System.out.println("labyrinten");
		System.out.println(labyrint);

		LabyrintSpill spill = new LabyrintSpill(labyrint);

		if (spill.gjennomgaa()) {
			System.out.println("Det er en sti gjennom labyrinten");
		} else {
			System.out.println("Det er ingen mulig sti.");
		}
		System.out.println(labyrint);

	}// main
}
