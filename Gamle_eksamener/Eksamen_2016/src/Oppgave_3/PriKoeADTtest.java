package Oppgave_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PriKoeADTtest {
	
	private PriKoeADT<Integer> pk;
	private Integer e0 = 0;
	private Integer e1 = 1;
	private Integer e2 = 2;
	private Integer e3 = 3;
	private Integer e4 = 4;
	private Integer e5 = 5;

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void setteInnOgfjerne() {
		pk.settInn(e0);
		pk.settInn(e5);
		pk.settInn(e3);
		pk.settInn(e4);
		pk.settInn(e2);
		pk.settInn(e1);
	
		assertEquals(pk.fjern(),e0);
		assertEquals(pk.fjern(), e1);
		assertEquals(pk.fjern(), e2);
		assertEquals(pk.fjern(), e3);
		assertEquals(pk.fjern(), e4);
		assertEquals(pk.fjern(), e5);
		
	}

}
