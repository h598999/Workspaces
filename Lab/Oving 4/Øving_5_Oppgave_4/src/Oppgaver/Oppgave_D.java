package Oppgaver;

public class Oppgave_D {

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
		long tidførny = System.currentTimeMillis();
		System.out.println(fibonacci(60));
		System.out.println(fibonacci(65));
		System.out.println(fibonacci(70));
		long tidetterny = System.currentTimeMillis();
		System.out.println((tidetterny-tidførny)/1000);
		long tidførnyny = System.currentTimeMillis();
		System.out.println(fibonacci(80));
		System.out.println(fibonacci(90));
		System.out.println(fibonacci(100));
		System.out.println(fibonacci(110));
		long tidetternyny = System.currentTimeMillis();
		System.out.println((tidetternyny-tidførnyny)/1000);
		long tidførigjen = System.currentTimeMillis();
		System.out.println(fibonacci(150));
		System.out.println(fibonacci(200));
		System.out.println(fibonacci(300));
		long tidetterigjen = System.currentTimeMillis();
		System.out.println((tidetterigjen-tidførigjen));
		
		

	}

	
	public static int fibonacci(int n) {
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int i = 0;
		
		for ( i = 0; i<n-1; i++) {
			n3 = n1+n2;
			n1=n2;
			n2=n3;
		}
		return n3;
		
		
	}
	
}
