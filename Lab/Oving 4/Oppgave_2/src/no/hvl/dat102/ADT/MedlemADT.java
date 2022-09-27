package no.hvl.dat102.ADT;

import no.hvl.dat100.Medlem;

public interface MedlemADT {

/**
 * Sjekker om to medlemm passer sammen(de passer
 * sammen når de har samme hobbyer)	
 * @param medlem2
 * return true dersom de har samme hobbyer, false ellers
 */
boolean passerTil(Medlem medlem2);
	
}
