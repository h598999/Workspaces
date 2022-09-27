package MengdeTest;

import AdtTest.MengdeADTtest;
import src.no.hvl.dat102.mengde.adt.MengdeADT;
import src.no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class KjedetMengdeTest extends MengdeADTtest  {

	@Override
	public MengdeADT<Integer> reset() {
		KjedetMengde<Integer> nymengde = new KjedetMengde<Integer>();
		return nymengde;
	}

}
