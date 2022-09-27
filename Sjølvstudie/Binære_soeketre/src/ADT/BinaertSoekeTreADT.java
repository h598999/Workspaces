package ADT;

import java.util.Iterator;

public interface BinaertSoekeTreADT<T extends Comparable <?super T>> extends TreeInterFace<T> {
	
	/**
	 * Leiter etter en spesifikk entry i treet
	 * @param anEntry objektet som leites etter
	 * @return true dersom objektet finnes i treet, false viss ikke
	 */
	
	public boolean inneholder(T anEntry);

	/**
	 * Lieter etter en spesifikk entry i treet 
	 * @param entry
	 * @return null dersom elementet som leites etter ikkje finnes, ellers returneres elementet
	 */
	
	public T getEntry(T entry);
	
	/**
	 * Legger til eit nytt element i treet, dersom det ikkje finnes frå før. Ellers erstattes det 
	 * gamle elementet med det nye?
	 * @param newEntry elementet som skal legges til
	 * @return null dersom newEntry ikkje fantes i treet frå før. ellers returneres
	 *  objektet som skulle legges til.
	 */
	
	public T add(T newEntry);
	
	
	/**
	 * Fjerner en spesifikk entry fra treet
	 * @param entry elementet som skal fjernes. 
	 * @return enten elementet som blei fjerna fra treet ekker null dersom elementet ikkje finnes i treet
	 */
	
	public T remove(T entry);
	
	/**
	 * Lager en iterator som kan gå igjennom alle elementa i treet.
	 * @return en iterator som gir sekvensiell og ordna tilgang til elementa i treet.
	 */
	
	public Iterator<T> getInorderIterator();
	
}
