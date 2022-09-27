package no.hvl.dat100;

import no.hvl.dat102.ADT.MedlemADT;
import src.no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem implements MedlemADT {
	
	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;
	
	public Medlem(String navn, MengdeADT<Hobby> hobbyer) {
		this.navn=navn;
		this.hobbyer=hobbyer;
		statusIndeks = -1;
	}

	@Override
	public boolean passerTil(Medlem medlem2) {
		boolean passer = false;
		if (medlem2.getHobbyer().equals(hobbyer)&&medlem2.getStatusIndeks()<0&&statusIndeks<0&&!this.equals(medlem2)) {
			passer = true;
		}
		return passer;
	}
	
	public boolean harPartner() {
		if (statusIndeks>=0)
			return true;
		else
			return false;
	}
	
	public String toString() {
		String str = " ";
	if (statusIndeks < 0) {
		str = navn + " , " + hobbyer.toString() + " , ledig" ;
	} else {
		str = navn + " , " + hobbyer.toString() + " , opptatt" ;
	}
		return str;
	}
	
	public void print() {
		System.out.println(this.toString());
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public MengdeADT<Hobby> getHobbyer() {
		return hobbyer;
	}

	public void setHobbyer(MengdeADT<Hobby> hobbyer) {
		this.hobbyer = hobbyer;
	}

	public int getStatusIndeks() {
		return statusIndeks;
	}

	public void setStatusIndeks(int statusIndeks) {
		this.statusIndeks = statusIndeks;
	}
	
	

}
