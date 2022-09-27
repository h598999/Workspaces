package ADT;

public interface ParantesesjekkerADT {
	
	/**
	 * Metoden sjekker om et tegn er '(', '[' eller '{'
	 * @param p tegn som skal sjekkes
	 * @return true dersom tegnet er en venstreparantes, false ellers
	 */
	boolean erVenstreparentees(char p);
	
	/**
	 * Metoden sjekker om et tegn er ')', ']' eller '}'
	 * @param p tegn som skal sjekkes
	 * @return true dersom tegnet er en hogreparantes, false ellers
	 */
	boolean erHogreparentes(char p);
	
	/**
	 * Metoden sjekker om et tegn er parentes.
	 * @param p tegn som skal sjekkes
	 * @return true dersom tegnet er '(', '[' , '{' ')', ']' eller '}', false ellers
	 */
	boolean erParentes(char p);

	/**
	 * Metoden sjekker om to tegn er et parantespar
	 * @param venstre er første tegn i potensielt par
	 * @param hogre er andre tegn i potensielt par
	 * @return true dersom de matcher, dvs. venstre er en ventsreparantes og hogre er tilhørende høgreparantes
	 */
	boolean erPar(char venstre, char hogre);
	
	/**
	 * Metoden sjekker om en streng som inneholder paranteser er balansert. Den ser bort fra tegn som ikke er paranteser.
	 * @param s streng som skal sjekkes
	 * @return true dersom parantesene i strengen er balansert false ellers.
	 */
	boolean erBalansert(String s);
	
}
