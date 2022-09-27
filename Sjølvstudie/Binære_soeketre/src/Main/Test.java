package Main;

import Tre.BinaertSoekeTre;

public class Test {

	public static void main(String[] args) {
	
		BinaertSoekeTre<Integer> tre = new BinaertSoekeTre<Integer>(1);
		tre.add(3);
		tre.add(2);
		tre.add(1);
		tre.add(4);
		tre.add(10);
		System.out.println(tre.getHeight());

	}

}
