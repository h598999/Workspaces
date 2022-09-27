package no.hvl.dat102.klient;

import java.util.Scanner;

import no.hvl.dat100.Datakontakt;
import no.hvl.dat100.Hobby;
import no.hvl.dat100.Medlem;
import src.no.hvl.dat102.mengde.adt.MengdeADT;
import src.no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class MedlemTekstGrenseSnitt {

	public MedlemTekstGrenseSnitt() {
		
	}
	
	public MedlemTekstGrenseSnitt(Datakontakt data) {
		
	}
	
	public static Medlem lesMedlem() {
		//String navn = JOptionPane.showInputDialog("Skriv inn navnet på medlemmet");
		//String hobbyantallinput = JOptionPane.showInputDialog("Skriv inn antall hobbyer til medlemmet");
		//int antallhobbyer = Integer.parseInt(hobbyantallinput);
		//MengdeADT<Hobby> hobbyer = new KjedetMengde<Hobby>();
		//for (int i = 0; i<antallhobbyer; i++) {
			//String hobbystring = JOptionPane.showInputDialog("Skriv inn navnet på hobby nr " + (i+1));
			//Hobby hobby = new Hobby(hobbystring);
			//hobbyer.leggTil(hobby);
		//}
		//return new Medlem(navn, hobbyer);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv inn navnet på medlemet");
		String medlemsnavn = scan.nextLine();
		System.out.println("Skriv inn antall hobbyer til medlemmet");
		int antallhobbyer = scan.nextInt();
		MengdeADT<Hobby> hobbyer = new KjedetMengde<>(); 
		for (int i = 0; i<antallhobbyer; i++) {
			System.out.println("Skriv inn hobby nr " + (i+1));
			Hobby hobby = new Hobby("");
			hobby = new Hobby(scan.next());
			hobbyer.leggTil(hobby);
		}
		
		return new Medlem(medlemsnavn,hobbyer);
			
		
	}
	
	public  void SkrivHobbyListe(Medlem medlem) {
		medlem.getHobbyer().skrivUt();
	}
	
	public static void skrivParListe(Datakontakt arkiv) {
			String str = "";
			int antallpar = 0;
			for (int i = 0; i<arkiv.getAntall(); i++) {
				if (arkiv.getMedlemmer()[i].harPartner()&&i<arkiv.getMedlemmer()[i].getStatusIndeks()) {
					MengdeADT<Hobby> sammensatt = arkiv.getMedlemmer()[i].getHobbyer();
					str += arkiv.getMedlemmer()[i].getNavn() + " og " + arkiv.getMedlemmer()[arkiv.getMedlemmer()[i].getStatusIndeks()].getNavn() + " " + sammensatt.toString()+ "\n";
					antallpar++;
				}
			
			}
			System.out.println(str);
			System.out.println("antall par" + "\n" + "----------" + "\n" + antallpar);
	
		}
	}
	

