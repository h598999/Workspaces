package Main;

import no.hvl.dat100.Datakontakt;
import no.hvl.dat100.Hobby;
import no.hvl.dat100.Medlem;
import no.hvl.dat102.klient.MedlemTekstGrenseSnitt;
import src.no.hvl.dat102.mengde.adt.MengdeADT;
import src.no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class DataKontaktMain {

	public static void main(String[] args) {
		
		MengdeADT<Hobby> hobbyer = new KjedetMengde<Hobby>();
		MengdeADT<Hobby> hobbyer2 = new KjedetMengde<Hobby>();
		
		Hobby hobby1 = new Hobby("Ski");
		Hobby hobby2 = new Hobby("Løping");
		Hobby hobby3 = new Hobby("Aking");
		hobbyer.leggTil(hobby1);
		hobbyer.leggTil(hobby2);
		hobbyer2.leggTil(hobby3);
		
		Medlem medlem1 = new Medlem("Jonas", hobbyer);
		Medlem medlem2 = new Medlem("Erna", hobbyer);
		Medlem medlem3 = new Medlem("Per", hobbyer2);
		Medlem medlem4 = new Medlem("Peter",hobbyer2);
		@SuppressWarnings("unused")
		Medlem medlem5 = new Medlem("Peder", hobbyer);
		
		Datakontakt samling = new Datakontakt();
		samling.leggtil(medlem1);
		samling.leggtil(medlem2);
		samling.leggtil(medlem3);
		samling.leggtil(medlem4);
		
		samling.finnPartnerFor("Jonas");
		samling.finnPartnerFor("Per");
		samling.tilbakestillStatusIndeks("peder");
		
		 
		MedlemTekstGrenseSnitt.skrivParListe(samling);
		
		
		

	}

}
