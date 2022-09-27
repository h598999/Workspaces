package no.hvl.dat102;

public class Prioritetskoe<T extends Comparable<? super T>> implements PrioritetskoeInterface<T> {
	private MaksHaugInterface<T> h;
	
	public Prioritetskoe() {
		h = new MaksHaug();
	}
	
	@Override
	public void leggTil(T nyttElement) {
		h.leggTil(nyttElement);
	}

	@Override
	public T fjern() {
		return h.fjernMaks();
	}

	@Override
	public T peek() {
		return h.finnMaks();
	}

	@Override()
	public boolean erTom() {
		return h.erTom();
	}
	
	@Override
	public int antall() {
		return h.getAntall();
	}

	@Override
	public void toem() {
		h.toem();
	}
}
