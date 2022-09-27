package no.hvl.dat102;

public interface MaksHaugInterface<T extends Comparable<? super T>> {
	void leggTil(T nyttElement);
	T fjernMaks();
	T finnMaks();
	boolean erTom();
	int getAntall();
	void toem();
}
