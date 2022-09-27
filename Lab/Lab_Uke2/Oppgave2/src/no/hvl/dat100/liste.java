package no.hvl.dat100;

import java.util.ArrayList;
import java.util.List;

public class liste {
	
	public static void main(String[] args) {
		List<Integer> lister = new ArrayList<>(5);
		lister.add(1);
		lister.add(2);
		lister.add(3);
		lister.add(3);
		lister.add(4);

	
		if (lister.contains(7))
			System.out.println("True");
		else
			System.out.println("False");
		System.out.println(lister.get(3));
		System.out.println();
		System.out.println(lister.get(4));
		System.out.println();
		System.out.println(lister.size());
		lister.remove(1);
		lister.add(1, 6);
		System.out.println();
		
		for (int i = 0; i<lister.size(); i++) {
			System.out.println(lister.get(i));
		}
		System.out.println();
		
		System.out.println(lister.contains(7));
		System.out.println();
		System.out.println(lister.contains(4));
		
		System.out.println(lister.indexOf(3));
		System.out.println(lister.lastIndexOf(3));
		
		lister.clear();
		if (lister.isEmpty())
			System.out.println("True");
		else
			System.out.println("False");
		
	
		
	}

}
