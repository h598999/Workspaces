package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import Entiteter.Kj�leskap;
import Entiteter.Vare;
import JPA.VareGetter;

class Kj�leskapTest {

	Kj�leskap kj�leskap = new Kj�leskap();
	
	@Test
	void leggTiltest() throws IOException, InterruptedException {
		kj�leskap.leggTil(2030);
		assertEquals(1,kj�leskap.getAntallAvVare(2030));
	
	}

}
