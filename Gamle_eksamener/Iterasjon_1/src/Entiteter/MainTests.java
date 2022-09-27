package Entiteter;

import java.io.IOException;
import java.util.Set;

import JPA.VareGetter;

public class MainTests {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Kjøleskap kjøleskap = new Kjøleskap();
		kjøleskap.leggTil(2030);
		Set<Vare> varer = kjøleskap.getAlle();
		System.out.println(kjøleskap.inneholder(VareGetter.getVare(2030)));
		
		
		
	}
}
