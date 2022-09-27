package Oppgave_4;

import java.util.Random;

import no.hvl.dat100.BS_Tre;

public class Stokker {
	
	private static int størstehøgde = 0;
	private static int minstehøgde = 0;
	private static int totalhøgde = 0;
	private static double minstemulighøgde = 0;
	private static double størstmulighøgde = 0;
	private int antallnoder = 0;
	
	public Stokker(int n) {
		this.antallnoder=n;
	}
	
	public void stokkTre() {
			Random terning = new Random();
			størstehøgde = 0;
			minstehøgde = 10000000;
			totalhøgde = 0;
			minstemulighøgde = log2(antallnoder);
			størstmulighøgde = antallnoder-1;
			
			for (int o = 0; o<100; o++) {
			
			BS_Tre<Integer> tre1 = new BS_Tre<Integer>(terning.nextInt());
			
			for (int i = 0; i< antallnoder-1; i++) {
				
				Integer tall = terning.nextInt();
				tre1.leggTil(tall);
				
			}
			
			if (tre1.getHøgde()>størstehøgde) {
				
				størstehøgde = tre1.getHøgde();	
			}
			
			if (tre1.getHøgde()<minstehøgde) {
				minstehøgde = tre1.getHøgde();
			}
			
			totalhøgde += tre1.getHøgde();
			
		}
			
			
		  }
	public static double log2(int N)
    {
 
        // calculate log2 N indirectly
        // using log() method
        double result = (double)(Math.log(N) / Math.log(2));
        return Math.floor(result);
 
    }
	
	public void printStørsteHøgde() {
		System.out.println("Størstehøgde i løpet av alle kjøringane = " + størstehøgde);
	}
	
	public void printMinsteHøgde() {
		System.out.println("Minstehøgde i løpet av alle kjøringene = " + minstehøgde);
	}
	
	public void printTotalhøgde() {
		System.out.println("Gjennomsnitts høgda på 100 kjøringer var : " + totalhøgde/100);
	}
	
	public void printMinsteMuligHøgde() {
		System.out.println("Minstemuligehøgde = " + minstemulighøgde);
	}
	public void printStørstmuligHøgde() {
		System.out.println("Størstmuligehøgde = " + størstmulighøgde);
	}
	public void printAlle() {
		double c = (totalhøgde/100)/log2(antallnoder);
		System.out.println("Største høgda i løpet av alle kjøringene = " + størstehøgde);
		System.out.println();
		System.out.println("Største teoriteske høgde = "  + størstmulighøgde);
		System.out.println();
		System.out.println("Minste høgda i løpet av alle kjøringene = " + minstehøgde);
		System.out.println();
		System.out.println("Minste mulige høgde = "+ minstemulighøgde);
		System.out.println();
		System.out.println("Gjennomsnittet av høgda i alle kjøringene = " + totalhøgde/100);
		System.out.println();
		System.out.println("Den gjennomsnittlege høgden på eit binært tre med 8191 noder bør teoretisk bli: " + c*log2(8191));
	}

}
