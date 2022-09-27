package no.hvl.data102klient;

import no.hvl.data100.Filmarkiv;

public class KlientFilmarkiv {
	public static void main(String[] args) {
		Filmarkiv filmer = new Filmarkiv(100);
		Meny meny = new Meny(filmer);
		meny.start();
	}
}
