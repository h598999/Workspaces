package Oppgave_1;

public class Main {
	
	public static void main(String[] args) {
		
		BinaerTreNode<Integer> rot = new BinaerTreNode<Integer>(30);
		Bs_tre<Integer> t = new Bs_tre<Integer>(rot);
		
		t.leggTil(25);
		t.leggTil(40);
		t.leggTil(15);
		t.leggTil(27);
		t.leggTil(35);
		t.leggTil(45);
		t.leggTil(5);
		t.leggTil(17);
		t.leggTil(32);
		
		Bs_tre<Integer> t2 = t;
		System.out.println(t.erIdentisk(t2));
		
		//t.f(14, 35);
		//t.visPostorden();
		
		System.out.println(t.finn(5));
		
		
	}

}
