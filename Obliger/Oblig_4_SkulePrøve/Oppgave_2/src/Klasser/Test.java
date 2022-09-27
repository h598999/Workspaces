package Klasser;

public class Test {
	
	public static void main(String[] args) {
		
	
	
	BinaerTreNode<Integer> rot = new BinaerTreNode<Integer>(3);
	
	KjedetBSTre<Integer> tre1 = new KjedetBSTre<Integer>(rot);
	tre1.add(2);
	tre1.add(4);
	
	KjedetBSTre<Integer> tre2 = new KjedetBSTre<Integer>(rot);
	tre2.add(2);
	tre2.add(5);
	
	System.out.println(tre1.erIdentisk(tre2));
	
	}
	
}
