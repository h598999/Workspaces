package Oppgave_3;

public interface PriKoeADT<T extends Comparable <T>> {
/**
 * Legger til spesifisert element i prioritetsk�en
 *
 */
public void settInn(T el);
/**
 * Returnerer det neste elementet i k�en uten � fjerne det
 fra k�en
 * @return elementet med lavest verdi
 * @throws EmptyCollectionException unntak som kastes hvis
 haugen er tom
 *
 */
public T neste();

/**
 * Returnerer og fjerner det neste element i prioritetsk�en
 * @return elementet med h�yest prioritet, null hvis k�en er
 * tom.
 * @throws EmptyCollectionException unntak som kastes hvis
 * k�en er tom
 *
 */
 public T fjern();

 /**
 * Returnerer st�rrelsen p� k�en
 * @return antall elementer i k�en
 */
 public int antall();

 /**
 * Avgj�r om k�en er tom.
 * @return true hvis k�en er tom, false ellers
 */
 public boolean erTom();
 
}
