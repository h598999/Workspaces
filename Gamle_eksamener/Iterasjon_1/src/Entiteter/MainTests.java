package Entiteter;

import java.io.IOException;
import java.util.Set;

import JPA.VareGetter;

public class MainTests {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Kj�leskap kj�leskap = new Kj�leskap();
		kj�leskap.leggTil(2030);
		Set<Vare> varer = kj�leskap.getAlle();
		System.out.println(kj�leskap.inneholder(VareGetter.getVare(2030)));
		
		
		
	}
}
