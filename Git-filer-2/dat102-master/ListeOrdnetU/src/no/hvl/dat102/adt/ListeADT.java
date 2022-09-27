package no.hvl.dat102.adt;

/**
 * Definerer interface til en generell liste. Spesielle typer av lister vil bli
 * avledet av dette grensesnittet.
 *
 * @param <T> elementtypen
 */
public interface ListeADT<T> {

	/**
	 * Fjerner og returnerer det spesifiserte elementet fra denne listen hvis det
	 * fins.
	 *
	 * @exception EmptyCollectionException unntak kastes hvis listen allerede er tom
	 * @return elementet som er fjernet
	 */
	T fjern(T element);

	/**
	 * Returner sann hvis denne listen inneholder det spesifiserte elmentet.
	 *
	 * @return sann hvis elementet finnes
	 */
	boolean inneholder(T element);

	/**
	 * Fjerner og returnerer referansen det første elmentet fra listen.
	 *
	 * @return elementet som er fjernet
	 */
	T fjernFoerste();

	/**
	 * Fjerner og returnerer referansen til det siste elementet fra denne listen.
	 * 
	 * @exception EmpyCollectionException unntak kastes dersom listen allerede er tom
	 * @return elementet som er fjernet
	 */
	T fjernSiste();

	/**
	 * Returnerer en referanse til det første elementet i denne listen.
	 * 
	 * @exception EmpyCollectionException unntak kastes dersom listen allerede er tom
	 * @return første element i listen
	 */
	T foerste();

	/**
	 * Returnerer en referanse til det siste elmentet i denne listen.
	 * 
	 * @exception EmptyCollectionException unntak kastes dersom listen allerede er tom
	 * @return siste element i listen
	 */
	T siste();

	/**
	 * Returnerer sann hvis listen er tom.
	 *
	 * @return sann hvis tom liste
	 */
	boolean erTom();

	/**
	 * Returnerer antall elementer i listen.
	 *
	 * @return antall elementer
	 */
	int antall();

	/** Returnerer en iterator for elementene i denne listen. */
	// public Iterator<T> iterator();

}
