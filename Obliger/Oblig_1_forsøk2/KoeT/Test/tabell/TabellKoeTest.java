package tabell;

import adt.KoeADT;
import adt.KoeADTTest;


public class TabellKoeTest extends KoeADTTest {

	@Override
	 protected KoeADT<Integer> reset() {
		return new TabellSirkulaerKoe<Integer>();
	}
}
