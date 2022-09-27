package Klient;

public class Main {

	public static void main(String[] args) {
		String s = "a{b[c(d+e)/2-f]+1}";
		String s1 = "{[()]}";
		String s2 = "{[])";
		Parentesesjekker sjekker = new Parentesesjekker();
		System.out.println(sjekker.erBalansert(s1));
		System.out.println(sjekker.erBalansert(s));
		System.out.println(sjekker.erBalansert(s2));

	}

}
