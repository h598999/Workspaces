package no.hvl.dat102.klient;

import no.hvl.dat100.Medlem;
public class KlientMedlem {

	public static void main(String[] args) {
		
		
		Medlem medlem1 = MedlemTekstGrenseSnitt.lesMedlem();
		Medlem medlem2 = MedlemTekstGrenseSnitt.lesMedlem();
		medlem1.print();
		medlem2.print();
	}

}
