package Oppgave_4;

import java.util.Random;

import no.hvl.dat100.BS_Tre;

public class Stokker {
	
	private static int st�rsteh�gde = 0;
	private static int minsteh�gde = 0;
	private static int totalh�gde = 0;
	private static double minstemuligh�gde = 0;
	private static double st�rstmuligh�gde = 0;
	private int antallnoder = 0;
	
	public Stokker(int n) {
		this.antallnoder=n;
	}
	
	public void stokkTre() {
			Random terning = new Random();
			st�rsteh�gde = 0;
			minsteh�gde = 10000000;
			totalh�gde = 0;
			minstemuligh�gde = log2(antallnoder);
			st�rstmuligh�gde = antallnoder-1;
			
			for (int o = 0; o<100; o++) {
			
			BS_Tre<Integer> tre1 = new BS_Tre<Integer>(terning.nextInt());
			
			for (int i = 0; i< antallnoder-1; i++) {
				
				Integer tall = terning.nextInt();
				tre1.leggTil(tall);
				
			}
			
			if (tre1.getH�gde()>st�rsteh�gde) {
				
				st�rsteh�gde = tre1.getH�gde();	
			}
			
			if (tre1.getH�gde()<minsteh�gde) {
				minsteh�gde = tre1.getH�gde();
			}
			
			totalh�gde += tre1.getH�gde();
			
		}
			
			
		  }
	public static double log2(int N)
    {
 
        // calculate log2 N indirectly
        // using log() method
        double result = (double)(Math.log(N) / Math.log(2));
        return Math.floor(result);
 
    }
	
	public void printSt�rsteH�gde() {
		System.out.println("St�rsteh�gde i l�pet av alle kj�ringane = " + st�rsteh�gde);
	}
	
	public void printMinsteH�gde() {
		System.out.println("Minsteh�gde i l�pet av alle kj�ringene = " + minsteh�gde);
	}
	
	public void printTotalh�gde() {
		System.out.println("Gjennomsnitts h�gda p� 100 kj�ringer var : " + totalh�gde/100);
	}
	
	public void printMinsteMuligH�gde() {
		System.out.println("Minstemuligeh�gde = " + minstemuligh�gde);
	}
	public void printSt�rstmuligH�gde() {
		System.out.println("St�rstmuligeh�gde = " + st�rstmuligh�gde);
	}
	public void printAlle() {
		double c = (totalh�gde/100)/log2(antallnoder);
		System.out.println("St�rste h�gda i l�pet av alle kj�ringene = " + st�rsteh�gde);
		System.out.println();
		System.out.println("St�rste teoriteske h�gde = "  + st�rstmuligh�gde);
		System.out.println();
		System.out.println("Minste h�gda i l�pet av alle kj�ringene = " + minsteh�gde);
		System.out.println();
		System.out.println("Minste mulige h�gde = "+ minstemuligh�gde);
		System.out.println();
		System.out.println("Gjennomsnittet av h�gda i alle kj�ringene = " + totalh�gde/100);
		System.out.println();
		System.out.println("Den gjennomsnittlege h�gden p� eit bin�rt tre med 8191 noder b�r teoretisk bli: " + c*log2(8191));
	}

}
