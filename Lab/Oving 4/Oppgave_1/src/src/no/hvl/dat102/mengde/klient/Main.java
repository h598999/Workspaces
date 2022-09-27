package src.no.hvl.dat102.mengde.klient;

import java.util.Iterator;

import src.no.hvl.dat102.mengde.adt.MengdeADT;
import src.no.hvl.dat102.mengde.kjedet.KjedetMengde;
import src.no.hvl.dat102.mengde.tabell.TabellMengde;

public class Main {

	
	public static void main(String[] args) {
		TabellMengde<Integer> mengde = new TabellMengde<Integer>();
		mengde.leggTil(1);
		mengde.leggTil(2);
		mengde.leggTil(3);
		mengde.leggTil(4);

		
		TabellMengde<Integer> mengde1 = new TabellMengde<Integer>();
		mengde1.leggTil(1);
		mengde1.leggTil(4);
		mengde1.leggTil(3);
		mengde1.leggTil(2);
		mengde1.leggTil(6);
		
		
		
		
		
		System.out.println(mengde.equals(mengde1));
		MengdeADT<Integer> mengdeunion = mengde.union(mengde1);
		mengdeunion.skrivUt();
		System.out.println();
		MengdeADT<Integer> mengdedifferens = mengde.differens(mengde1);
		mengdedifferens.skrivUt();
		System.out.println();
		MengdeADT<Integer> mengdesnitt = mengde.snitt(mengde1);
		mengdesnitt.skrivUt();
		System.out.println();
		
	
		
		KjedetMengde<Integer> kjedetmengde = new KjedetMengde<Integer>();
		kjedetmengde.leggTil(1);
		kjedetmengde.leggTil(2);
		kjedetmengde.leggTil(3);
		
		KjedetMengde<Integer> kjedetmengde1 = new KjedetMengde<Integer>();
		kjedetmengde1.leggTil(2);
		kjedetmengde1.leggTil(3);
		kjedetmengde1.leggTil(4);
		
		MengdeADT<Integer> mengdeunionkjedet = kjedetmengde.union(kjedetmengde1);
		mengdeunionkjedet.skrivUt();
		MengdeADT<Integer> mengdesnittkjedet = kjedetmengde.snitt(kjedetmengde1);
		System.out.println();
		mengdesnittkjedet.skrivUt();
		System.out.println();
		MengdeADT<Integer> mengdedifferens1 = kjedetmengde.differens(kjedetmengde1);
		mengdedifferens1.skrivUt();

		System.out.println(kjedetmengde.undermengde(kjedetmengde1));
		System.out.print(mengde.undermengde(mengde1));
		
	
	
		
	}

	}



