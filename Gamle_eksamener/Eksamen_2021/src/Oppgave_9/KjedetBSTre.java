package Oppgave_9;

import Ekstra.BinaerTreNode;

public class KjedetBSTre<T extends Comparable<T>>	 {
	 private int antall;
	 private BinaerTreNode<T> rot;
	 public KjedetBSTre() {
	antall = 0;
	rot = null;
	 }
	 
	 // � get- og set metoder kan du anta
	 public T finnMinste() {
		 if (erTom()) {
			 return null;
		 }
		 BinaerTreNode<T> temp = rot;
		 while(temp.getVenstre()!=null) {
			 temp = temp.getVenstre();
		 }
		 return temp.getElement();
	 }
	 public int antallBlad() {
	 return antallBladRek(rot);
	 }
	 private int antallBladRek(BinaerTreNode<T> p) {
		 if (p==null) {
			 return 0;
		 }
		 if (p.getHoyre()==null&&p.getVenstre()==null) {
			 return 1;
		 } else {
			 int antall = 0;
			 if (p.getHoyre()!=null) {
				 antall += antallBladRek(p.getHoyre());
			 }
			 if (p.getVenstre()!=null) {
				 antall+= antallBladRek(p.getVenstre());
			 }
			 return antall;
		 }
	 }
	 
	 private int antallBladRek(BinaerTreNode<T> p) {
		 if (p==null) {
			 return 0;
		 }
		 if (p.getHoyre()==null&&p.getVenstre()==null) {
			 return 1;
		 } else {
			 int antall = 0;
			 if (p.getVenstre()!=null) {
				 antall += antallBladRek(p.getVenstre());
			 }
			 if (p.getHoyre()!=null) {
				 antall+= antallBladRek(p.getHoyre());
			 }
		 }
		 return antall;
	 }
	 // � andre metoder
	}
