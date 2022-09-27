package kjedet;

import adt.KoeADT;
import adt.KoeADTTest;

public class KjedetKoeTest extends KoeADTTest {
	@Override 
	 protected KoeADT<Integer> reset() {
		return new KjedetKoe<Integer>();
		} 
	
	
	

}
