package Oppgave_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KjedetBSTreTest {
	
	private KjedetBSTre<Integer> tre;
	private Integer e0 = 0;
	private Integer e1 = 1;
	private Integer e2 = 2;
	private Integer e3 = 3;
	private Integer e4 = 4;

	@Test
	void fjernMinste() {
		tre.leggTil(e0);
		tre.leggTil(e2);
		tre.leggTil(e3);
		tre.leggTil(e1);
		tre.leggTil(e4);
		assertEquals(e0,tre.fjernMin());
		assertEquals(e1,tre.fjernMin());
		assertEquals(e2,tre.fjernMin());
		assertEquals(e3,tre.fjernMin());
		assertEquals(e4,tre.fjernMin());
		
	}

}
