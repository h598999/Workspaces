package HashMapOppgave_2;

import java.util.HashMap;

public class Main_Oppgave_2 {
	public void main(String[] args) {
	HashMap<String, Book> map = new HashMap<String, Book>();
	Book senseAndSensibility = new Book("Sense and Sensibility",  "...", 1811);
	Book prideAndPrejudice = new Book("Pride and Prejudice", "....", 1813);
	map.put(prideAndPrejudice.getName(), prideAndPrejudice);
	map.put(senseAndSensibility.getName(), senseAndSensibility);
	
	Book book = map.get("Persuasion");
	System.out.println(book);
	Book book1 = map.get("Sense and Sensibility");
	System.out.println(book1);
	}

}
