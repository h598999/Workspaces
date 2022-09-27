package no.hvl.dat100;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set1.add("Hei");
		set1.add("Hei");
		set1.add("Jonas");
		set1.add("Even");
		set1.add("Lol");
		
		set2.add("Hei");
		set2.add("Hallo");
		set2.add("Hallo");
		set2.add("Hade");
		set2.add("Bra");
		
		Set<String> kopiSet1 = new HashSet<>();
		kopiSet1.addAll(set1);
		Set<String> kopiSet2 = new HashSet<>();
		kopiSet2.addAll(set2);
		
		
		for (String i : set1) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (String i :set2) {
			System.out.println(i);
		}
		//set1 er nå snittet av set1 og set2
		set1.retainAll(set2);
		
		System.out.println();
		for (String i : set1) {
			System.out.println(i);
		}
		//set 2 er nå unioinen av (originale) set1 og set2
		set2.addAll(kopiSet1);
		System.out.println();
		for (String i : set2) {
			System.out.println(i);
		}
	}
	
	

}
