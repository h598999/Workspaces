package no.hvl.dat102.TabellOrdnetListeTest;

import no.hvl.dat102.adt.OrdnetListeADT;
import no.hvl.dat102.adt.OrdnetListeADTTest;
import no.hvl.dat102.kjedet.KjedetOrdnetListe;
import no.hvl.dat102.tabell.TabellOrdnetListe;

public class TabellOrdnetListeTest extends OrdnetListeADTTest {
	@Override
	protected OrdnetListeADT<Integer> reset() {
		return new TabellOrdnetListe<Integer>();
	}
}
