package no.hvl.dat102.adt;
public interface OrdnetListeADT<T extends Comparable<T>> extends ListeADT<T> {

	
		
	/**
	 * Legger til det spesifiserte elementet til denne listen.
	 *
	 * @param element det nye elementet som skal legges til
	 */
	void leggTil(T element);


}
