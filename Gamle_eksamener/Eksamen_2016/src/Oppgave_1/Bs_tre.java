package Oppgave_1;

public class Bs_tre<T extends Comparable<T>> {
	 private int antall;
	 private BinaerTreNode<T> rot;
	 public Bs_tre(BinaerTreNode<T> rot) {
	 antall = 0;
	 this.rot = rot;
	 }
	 //..andre metoder
	 public void visPostorden() {
	visRekPostorden(rot);
	 System.out.println();
	 }
	 private void visRekPostorden(BinaerTreNode<T> p) {
		if (p==null) {
			return;
		}
		visRekPostorden(p.getVenstre());
		visRekPostorden(p.getHoyre());
		System.out.println(p.getElement());
	 }

	 public T finn(T element) {
	return finnRek(element, rot);
	 }
	 private T finnRek(T element, BinaerTreNode<T> p) {
		 if (p!=element) {
			 if (element.compareTo(p.getElement())<0) {
				 return (finnRek(element, p.getVenstre()));
			 } else if(element.compareTo(p.getElement())>0) {
				 return (finnRek(element,p.getHoyre()));
			 }
		 }
		 return p.getElement();
	 }
	 public boolean erIdentisk(Bs_tre<T> t){
	 return erIdentiskRek(rot, t.rot);
	 }

	 private boolean erIdentiskRek(BinaerTreNode<T> t1,BinaerTreNode<T> t2){
		
		 
		 if (!t1.equals(t2)||t1==null) {
			return false;
		} 
		 boolean erIdentiskVenstre = false;
		 if (t1.getVenstre()==null||t2.getVenstre()==null) {
			 erIdentiskVenstre = t1.getVenstre()==null&&t2.getVenstre()==null;
		} else {
			erIdentiskVenstre = erIdentiskRek(t1.getVenstre(),t2.getVenstre());
		}
		boolean erIdentiskHøyre = false;
		if (t2.getHoyre()==null||t2.getHoyre()==null) {
			erIdentiskHøyre = t1.getHoyre()==null&&t2.getHoyre()==null;
		} else {
			erIdentiskHøyre = erIdentiskRek(t1.getHoyre(),t2.getHoyre());	
		}
		return (erIdentiskHøyre&&erIdentiskVenstre);
	 }
	 public void f(T a, T b) {
	 fRek(rot, a, b);
	 }
	 
	 
	 private void fRek(BinaerTreNode<T> p, T a, T b) {
		 
	if (p != null) {
	 if (p.getElement().compareTo(a) >= 0) {
	fRek(p.getVenstre(), a, b);
	if (p.getElement().compareTo(b) <= 0) {
	System.out.println(p.getElement());
	fRek(p.getHoyre(), a, b);
	}
	 }
	 }
	 }
	 
	 public T leggTil(T nyElement) {
	        return leggTil(rot,nyElement).getElement();
	    }

	    private BinaerTreNode<T> leggTil(BinaerTreNode<T> p, T element){
	        if (p == null) {
	            return new BinaerTreNode<T>(element);
	        } else {
	            if (element.compareTo(p.getElement()) < 0) {
	                p.setVenstre(leggTil(p.getVenstre(), element));
	            } else {
	                // Alternativ med to kodelinjer
	                BinaerTreNode<T> q = leggTil(p.getHoyre(), element);
	                p.setHoyre(q);
	            }
	        }
	        return p;
	    }
}

