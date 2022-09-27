package Oppgave_3;

public class PriKoe<T extends Comparable <T>> implements PriKoeADT {

	T[] a;
	private int antall = 0;
	
	public PriKoe(int maks) {

		this.antall = 0;
	}
	
	@Override
	public void settInn(Comparable el) {
		
		
	}

	@Override
	public Comparable neste() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comparable fjern() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean erTom() {
		// TODO Auto-generated method stub
		return false;
	}

}
