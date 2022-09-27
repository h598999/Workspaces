package Oppgaver;

public class Oppgave_c {

	public static void main(String[] args) {
		long tidfør = System.currentTimeMillis();
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(15));
		System.out.println(fibonacci(20));
		System.out.println(fibonacci(30));
		System.out.println(fibonacci(40));
		System.out.println(fibonacci(50));
		long tidetter = System.currentTimeMillis();
		System.out.println((tidetter-tidfør)/1000);
	}

	public static int fibonacci(int n) {
		int sum = 0;
		if (n == 0) {
			sum = 0;
		} else if (n == 1) {
			sum = 1;
		} else {
			sum += fibonacci(n - 1) + fibonacci(n - 2);

		}
		return sum;
	}

}
