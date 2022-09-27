package Oppgave_4;

import java.util.Iterator;

public interface MengdeADT<T> {
	// Interface som definerer alle operasjoner i en ADT
	// med navn MengdeADT 
	/**
	* 
	* @param element er det gitte elementet
	* @return sann hvis elementet fins ellers usann
	*/
	boolean inneholder(T element);
	 
	/** @return sann hvis mengden er tom ellers usann
	*/
	boolean erTom();
	/**
	* Finn antall elementer i mengden
	* 
	* @return antall i mengden
	*/
	int antall();
	/**
	* 
	* @param m2 er mengden som det skal testes mot
	* @return sann dersom m2 er en undermengde av this-mengden
	* ellers returneres usann
	*/
	boolean undermengde(MengdeADT<T> m2);
	Iterator<T> oppramser();
	}// interface

