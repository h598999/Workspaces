package Oppgave_3;

public interface PriKoeADT<T extends Comparable <T>> {
/**
 * Legger til spesifisert element i prioritetskøen
 *
 */
public void settInn(T el);
/**
 * Returnerer det neste elementet i køen uten å fjerne det
 fra køen
 * @return elementet med lavest verdi
 * @throws EmptyCollectionException unntak som kastes hvis
 haugen er tom
 *
 */
public T neste();

/**
 * Returnerer og fjerner det neste element i prioritetskøen
 * @return elementet med høyest prioritet, null hvis køen er
 * tom.
 * @throws EmptyCollectionException unntak som kastes hvis
 * køen er tom
 *
 */
 public T fjern();

 /**
 * Returnerer størrelsen på køen
 * @return antall elementer i køen
 */
 public int antall();

 /**
 * Avgjør om køen er tom.
 * @return true hvis køen er tom, false ellers
 */
 public boolean erTom();
 
}
