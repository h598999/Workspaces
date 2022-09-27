package KjedetBag;

public class BagTesting {
	
	public static void main(String[] args) {
		KjedetBag<String> bag = new KjedetBag<String>();
		bag.leggTil("Jonas");
		bag.leggTil("Even");
		bag.leggTil("Kari");
		
		System.out.println(bag.tilTabell()[0]);
	
		
	}

}
