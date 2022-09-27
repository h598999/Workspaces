package no.hvl.dat102.ADT;

import no.hvl.dat100.Medlem;

public interface DataKontaktADT {

	/**
	 * legger til eit nytt medlem i samlingen
	 * @param medlem2
	 * 
	 */
	void leggtil(Medlem medlem2);
	/**
	 * finner indeks til det første medlemet med gitt navn i medlemstabellen
	 * @param medlemsnavn
	 * @return poisjonen til medlemmet i tabellen, -1 dersom medlemmet ikkje finnes
	 */
	int finnMedlemsIndeks(String medlemsnavn);
	
	/**
	 * returnerer det første medlemmet som passer med gitt medlem og som ikkje er kobla
	 * @param medlemsnavn
	 * @return indeksen til medlemmet som passer med medlemmet gitt som parameter, viss det ikkje finnes returnerer det -1
	 */
	int finnPartnerFor(String medlemsnavn);
	/**
	 * setter statusindeksen til gitt medlem til -1;
	 * @param medlemsnavn
	 */
	void tilbakestillStatusIndeks(String medlemsnavn);
	
}
