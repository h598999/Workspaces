package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import Entiteter.Kjøleskap;
import Entiteter.Vare;
import JPA.VareGetter;

class KjøleskapTest {

	Kjøleskap kjøleskap = new Kjøleskap();
	
	@Test
	void leggTiltest() throws IOException, InterruptedException {
		kjøleskap.leggTil(2030);
		assertEquals(1,kjøleskap.getAntallAvVare(2030));
	
	}

}
