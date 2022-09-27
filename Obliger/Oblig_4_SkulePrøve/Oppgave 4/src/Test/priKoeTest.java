package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ADT.PriKoeADT;
import klasser.PriKoe;

class priKoeTest {
	
	private PriKoeADT<Integer> koe;
	
	@BeforeEach 
	public void reset() {
		koe = new PriKoe<Integer>();
	}

	@Test
	void setteInnOgFjerne() {
		koe.settInn(5);
		koe.settInn(7);
		koe.settInn(6);
		koe.settInn(1);
		assertEquals(koe.fjern(), 1);
		assertEquals(koe.fjern(), 5);
		assertEquals(koe.fjern(),6);
		assertEquals(koe.fjern(),7);
	}

}
