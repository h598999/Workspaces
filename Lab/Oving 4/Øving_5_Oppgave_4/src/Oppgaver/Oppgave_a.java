package Oppgaver;

public class Oppgave_a {

	public static void main(String[] args) {
		System.out.println(sumAv(100));

	}	
		public static int sumAv(int n) {
			int sum = 0;
			if (n==1){
				sum=1;
			} else if(n==0) {
				sum = 0;
			}
			else {
				sum = sumAv(n-1) +n;
			}
			return sum;
		}

	}

	
	

