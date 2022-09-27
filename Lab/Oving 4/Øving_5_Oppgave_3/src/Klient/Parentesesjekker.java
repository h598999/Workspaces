package Klient;

import ADT.ParantesesjekkerADT;
import no.hvl.dat102.adt.StabelADT;
import no.hvl.dat102.kjedet.KjedetStabel;

public class Parentesesjekker implements ParantesesjekkerADT {
	
	public Parentesesjekker() {
		
	}

	@Override
	public boolean erVenstreparentees(char p) {
		if (p=='('||p=='{'||p=='[')
			return true;
		else
			return false;
	}

	@Override
	public boolean erHogreparentes(char p) {
		if (p==')'||p=='}'||p==']')
			return true;
		else
			return false;
	}

	@Override
	public boolean erParentes(char p) {
		if (p==')'||p=='}'||p==']'||p=='('||p=='{'||p=='[') 
			return true;
			else 
				return false;
	}



	@Override
	public boolean erBalansert(String s) {
		StabelADT<Character> stabel = new KjedetStabel<>();
		int antallkarakterer = s.length();
		int index = 0;
		char nextCharacter = ' ';
		boolean balansert = true;
		
		
		while(balansert && (index<antallkarakterer)) {
			nextCharacter = s.charAt(index);
			
			if (erVenstreparentees(nextCharacter)) {
				stabel.push(nextCharacter);
			}
			else if(erHogreparentes(nextCharacter)) {
				if (stabel.erTom())
					balansert = false;
				else {
					char temp = stabel.pop();
					balansert = erPar(temp, nextCharacter);
				}
			}
			index++;
		}
		return balansert;
	
		
	}
	public boolean erPar(char venstre, char høgre) {
		return (venstre=='('&& høgre==')')||(venstre=='['&&høgre==']')||(venstre=='{'&&høgre=='}');
	}
	
	

}
