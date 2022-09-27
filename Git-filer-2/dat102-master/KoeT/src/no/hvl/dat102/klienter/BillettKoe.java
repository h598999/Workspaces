package no.hvl.dat102.klienter;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.kjedet.KjedetKoe;
import no.hvl.dat102.tabell.TabellSirkulaerKoe;

public class BillettKoe{	
	private final static int PROSESSTID = 120;  	// Gj.sn tid for å betjene en kunde
	private final static int MAKS_ANT_LUKER = 10; 	// Antal billettluker
	private final static int ANT_KUNDER = 100;		// Antall kunder i alt
	
	public static void main(String[]a){
		Kunde kunde;
		KoeADT<Kunde> kundekoe = new TabellSirkulaerKoe<>();
		//Bytte ut med en anne imlementasjon
		int[] lukeTid = new int[MAKS_ANT_LUKER];
		int totalTid, gjsnittsTid, ferdig, start;
		System.out.println("Antall kunder totalt: "+ ANT_KUNDER + " (4 pr. minutt)");
		
		// Simulerer alle alternativer fra 1 til MAKS_ANT_LUKER billett-luker
		for(int ant_luker=1; ant_luker <= MAKS_ANT_LUKER; ant_luker++){//Simuleringsløkke
			
			// Nullstiller tid for alle luker, klokke over hver luke
			for(int i = 0; i<ant_luker; i++){
				lukeTid[i] = 0;
			}
			// Fyller køen med alle kundene
			for(int i = 1; i<=ANT_KUNDER; i++){ // Gj.sn ankommer en kunde hvert 15.sek
				kundekoe.innKoe(new Kunde(i*15)); 
			}
			totalTid = 0;
			// Behandler alle kunder i køen
			// Hver luke tar etter tur 1 kunde om gangen inntil køen er tom
			while(!kundekoe.erTom()){
				for (int lukenr = 0; lukenr < ant_luker; lukenr++){
					if(!kundekoe.erTom()){
						kunde = kundekoe.utKoe();
						if(kunde.getAnkTid()>lukeTid[lukenr]){// kunden har ventet
							start = kunde.getAnkTid(); 
						}else{                                // kunden har ikke ventet 
							start = lukeTid[lukenr];    
						}
						ferdig = start + PROSESSTID;          //  legger til betjeningstid
						kunde.setFerdigTid(ferdig);           //  kunden er betjent 
						lukeTid[lukenr] = ferdig;              //  Oppdatere klokken over luken
						totalTid = totalTid + kunde.totalTid();//  Oppdaterer totaltid   
					}
				}
			}
			
			// Skriv ut resultatet for dette antall luker
			gjsnittsTid = totalTid/ANT_KUNDER;
			System.out.print("Antall luker: " + ant_luker);
			System.out.println(" Gjennomsnittlig totaltid pr. kunde: " + gjsnittsTid);
		}//Simuleringsløkke
	}
}		
