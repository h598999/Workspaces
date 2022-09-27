package no.hvl.data100;

public class Oppgave_2G {
	
	private static long totaltid = 0;
	private static int x = 0;
	
	public static void main (String[] args) {
		
		for (int i = 0; i<10; i++) {
			tid(1000000000L);
			x+=totaltid;
		}
		
		System.out.println("Gjennomsnittstid på ti kjøringer av 10^9 = " + x/10 + "millisekund");
		x = 0;
		for (int i = 0; i<10; i++) {
			tid(100000000L);
			x+=totaltid;
		}
		System.out.println("Gjennomsnittstid på ti kjøringer av 10^8 = " + x/10 + "millisekund");
		x = 0;
		for (int i = 0; i<10; i++) {
			tid(10000000L);
			x+=totaltid;
		}
		
		System.out.println("Gjennomsnittstid på ti kjøringer av 10^7 = " + x/10 + "millisekund");
	}
	
	
	public static void tid(long n) {
		long tid = System.currentTimeMillis();	
		long k = 0;
		for (long i = 1; i<n; i++) {
			k = k+5;
		}
		long tidferdig = System.currentTimeMillis();
		totaltid = tidferdig-tid;
	}

}
