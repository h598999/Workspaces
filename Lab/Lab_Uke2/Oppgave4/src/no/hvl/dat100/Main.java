package no.hvl.dat100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		List<String> strengliste = new ArrayList<>();
		String[] strengtabell = {"er","det","alle","er","det","det"};
		for (int i = 0; i<strengtabell.length; i++) {
		strengliste.add(strengtabell[i]);}
		Map<String,Integer> strengmap = new HashMap<>();
		
		
		for (String i : strengliste) {
			if (strengmap.containsKey(i)) {
				strengmap.put(i, strengmap.get(i)+1);
			} else
			strengmap.put(i,1);
		}
		
		String input = JOptionPane.showInputDialog("Skriv inn ordet du vil finne frekvensen for");
		if (!strengmap.containsKey(input)) {
			System.out.println(0);
		} else {
			System.out.println(strengmap.get(input));
		}

	}
}	
