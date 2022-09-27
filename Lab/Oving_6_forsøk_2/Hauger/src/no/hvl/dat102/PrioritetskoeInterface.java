package no.hvl.dat102;

public interface PrioritetskoeInterface<T extends Comparable<? super T>> {
	void leggTil(T nyttElement);
	T fjern();
	T peek();
	boolean erTom();
	int antall();
	void toem();
}
