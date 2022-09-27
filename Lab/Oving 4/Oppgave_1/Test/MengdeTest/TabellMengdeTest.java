package MengdeTest;

import AdtTest.MengdeADTtest;
import src.no.hvl.dat102.mengde.adt.MengdeADT;
import src.no.hvl.dat102.mengde.tabell.TabellMengde;

public class TabellMengdeTest extends MengdeADTtest {

	@Override
	protected MengdeADT<Integer> reset() {
		return new TabellMengde<Integer>();
	}

}
