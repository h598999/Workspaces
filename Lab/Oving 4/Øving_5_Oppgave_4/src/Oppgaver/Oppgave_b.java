package Oppgaver;

public class Oppgave_b {

	public static void main(String[] args) {
		for (int i = 0; i<10; i++) {
		System.out.println(tallf�lge(i));
		}
	}
	
	public static int tallf�lge(int n) {
		int a = 0;
		if (n==0) {
			a = 2;
		} else if(n==1) {
			a = 5;
		}
		else {
			a += (5*tallf�lge(n-1)) - (6*tallf�lge(n-2)) +2;
		}
		return a;
	}

}
