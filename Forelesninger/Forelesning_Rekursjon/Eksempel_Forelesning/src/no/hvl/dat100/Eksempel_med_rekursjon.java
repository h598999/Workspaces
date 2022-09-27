package no.hvl.dat100;

public class Eksempel_med_rekursjon {
	
	

		public static int sum(int n) {
			if (n==1)
				return 1;
			int restenSum = sum(n-1);
			
			return n + restenSum;
		}


	public static void main(String[] args) {
		System.out.println(sum(5));
		System.out.println(sum(6));
		System.out.println(sum(1));
	}

}
