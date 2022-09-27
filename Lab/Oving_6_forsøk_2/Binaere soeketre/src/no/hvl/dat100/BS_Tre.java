package no.hvl.dat100;

import java.util.Iterator;

public class BS_Tre<T extends Comparable<? super T>> implements SoektreInterface<T> {
	
	private BinaerTreNode<T> rot;
	
	public BS_Tre() {
		rot = null;
	}
	
	public BS_Tre(T element) {
		rot = new BinaerTreNode<T>(element);
	}
	
	/**
	 * Søker etter et gitt element i treet.
	 * 
	 * @param element elementet vi søker etter.
	 * @return true om elementet finst, false elles.
	 */
	public boolean inneholder(T element) {
		if (finn(element)!=null) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getHøgde() {
		return getHøgde(rot);
	}

	/**
	 * Henter et element i treet.
	 * 
	 * @param element elementet vi leiter etter.
	 * @return Elementet dersom det finst, elles null.
	 */
	public T finn(T element) {
		return finn(element, rot);
	}

	private T finn(T element, BinaerTreNode<T> p) {
		T svar = null;
		
		// p == null  -> tomt tre som er basistille og svar blir null
		if (p != null) {
			int sml = element.compareTo(p.getElement());
			if (sml == 0) {
				svar = p.getElement();
			} else if (sml < 0) {
				svar = finn(element, p.getVenstre());
			} else {
				svar = finn(element, p.getHogre());
			}
		}
		return svar;
	}
	/**
	 * Legg eit element til treet dersom det ikkje finst frå før. Elles etstattar
	 * blir det gamle elementet erstatta med det nye.
	 * 
	 * @param nyElement elementet som skal leggast til
	 * @return null om elementet ikkje finst frå før. Elles det element som var i
	 *         treet frå før.
	 */
	public T leggTil(T nyElement) {
		return leggTil(rot, nyElement).getElement();
	}

	private BinaerTreNode<T> leggTil(BinaerTreNode<T> p, T element){
		if (p == null) {
			return new BinaerTreNode<T>(element);
		} else {
			if (element.compareTo(p.getElement()) < 0) {
				p.setVenstre(leggTil(p.getVenstre(), element));
			} else {
				// Alternativ med to kodelinjer
				BinaerTreNode<T> q = leggTil(p.getHogre(), element);
				p.setHogre(q);
			}
		}
		return p;
	}
	
	
	
	/**
	 * Fjernar eit element frå treet.
	 * 
	 * @param element elementet som skal fjernast.
	 * @return elementet som vart fjerna eller null om det ikkje finst.
	 */
	public T fjern(T element) {
		return null;
	}

	/**
	 * Lagar ein iterator som går gjennom alle element i treet i inorden.
	 * 
	 * @return ein iterator som elementa i sortert rekkefølge.
	 */
	public Iterator<T> getInordenIterator() {
		return null;
	}
	
	private int getHøgde(BinaerTreNode<T> root) {
		int height = -1;
		
		if (root!=null) {
			height = 1 + Math.max(getHøgde(root.getVenstre()), getHøgde(root.getHogre()));
		}
		
		return height;
		
	}

}
