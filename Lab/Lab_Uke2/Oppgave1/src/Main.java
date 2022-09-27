
public class Main {
	
	static void skrivTab(int[] tab) {
		for (int i = 0; i<tab.length; i++) {
			System.out.println(tab[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] hTab = {1,2,3,4};
		skrivTab(hTab);
		//a) hva blir skrevet ut her?
		for (int i = 0; i<hTab.length; i++) {
			hTab[i]++;
		}
		skrivTab(hTab);
		//2,3,4,5
		
		//b) hva blir skrevet ut her?
		for (int t :hTab) {
			t++;
		}
		skrivTab(hTab);
		//2,3,4,5
		//c) hvorfor fungerer ikke denne?
		skrivTab(hTab);
		Heltall[] rTab = new Heltall[4];
		rTab[0] = new Heltall(1);
		rTab[1] = new Heltall(2);
		rTab[2] = new Heltall(3);
		rTab[3] = new Heltall(4);
		//skrivTab(rTab);
		//fordi "skrivTab" kun godtar ein int tabell som input
		// d) Hva blir skrevet ut?
		for (Heltall t: rTab) {
			System.out.println(t + " ");
		}
		System.out.println();
		//1,2,3,4
		
		// e) Hva blir skrevet ut=
		for (Heltall t : rTab) {
			t.inkrementer();
		}
		for (Heltall t : rTab) {
			System.out.println(t + " ");
		}
		//2,3,4,5
		System.out.println();
	}

}
