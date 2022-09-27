package no.hvl.dat102;

public class Main {

	public static void main(String[] args) {
		MaksHaugInterface<Integer> h = new MaksHaug<>();
		
		Integer[] verdier = {19, 2, 7, 1, 20, 3};
		
		for (Integer e : verdier) {
			h.leggTil(e);
		}
		
		while (!h.erTom()) {
			System.out.print(h.fjernMaks() + " ");
		}
	}

}
