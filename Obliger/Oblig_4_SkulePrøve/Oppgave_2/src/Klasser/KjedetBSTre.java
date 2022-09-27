package Klasser;

public class KjedetBSTre<T extends Comparable<T>> {
	 private int antall;
	 private BinaerTreNode<T> rot;
	 public KjedetBSTre() {
	 antall = 0;
	 rot = null;
	 }
	 
	 public KjedetBSTre(BinaerTreNode<T> rot) {
		 this.rot = rot;
		 antall = 0;
	 }
	 
	 public void add(T newEntry) {
		 addEntry(rot, newEntry);
	 }
	 
	 private T addEntry(BinaerTreNode<T> rot, T newEntry) {
		 assert rot != null;
		 T result = null;
		 int comparison = newEntry.compareTo(rot.getElement());
		 
		 if (comparison == 0) {
			 result = rot.getElement();
		 }
		 
		 else  if (comparison<0) {
			 if (rot.getVenstre()!=null) {
				 result = addEntry(rot.getVenstre(), newEntry);
			 } else {
				 rot.setVenstre(new BinaerTreNode<T>(newEntry));
			 }
		 } else {
			 if (rot.getHoyre()!=null) {
				 result = addEntry(rot.getHoyre(), newEntry);
			 } else {
				 rot.setHoyre(new BinaerTreNode<T>(newEntry));
			 }
		 }
		 return result;
		 
	 }
	 
	 //..andre metoder
	 public void visPostorden() {
	visRekPostorden(rot);
	 System.out.println();
	 }
	 private void visRekPostorden(BinaerTreNode<T> p) {
		 
		 if (p== null)
			 return;
		 
		 visRekPostorden(p.getVenstre());
		 
		visRekPostorden(p.getHoyre());
		
		System.out.println(p.getElement());
		 
	 }
	 
	 public T finn(T element) {
	return finnRek(element, rot);
	 }
	 private T finnRek(T element, BinaerTreNode<T> p) {
		 
		 p = rot;
		 T resultat = null;
		 
		 if (p!=null) {
			 T rotelement =p.getElement();
			 
			 if (element.equals(rotelement))
				 resultat = rotelement;
			 else if (element.compareTo(rotelement)<0) {
				 resultat = finnRek(element,p.getVenstre());
			 } else {
				 resultat = finnRek(element, p.getHoyre());
			 }
			 
		 }
		 return resultat;
	  
	 }
	 public boolean erIdentisk(KjedetBSTre<T> t){
	 return erIdentiskRek(rot, t.rot);
	 } 
	 
	 private boolean erIdentiskRek(BinaerTreNode<T> t1,  BinaerTreNode<T> t2){
	 
		 if (!t1.equals(t2)) {
			 return false;
		 }
		 boolean erIdentiskVenstre = false;
		 if (t1.getVenstre()==null||t2.getVenstre()==null) {
			 erIdentiskVenstre = t1.getVenstre()==null&&t2.getVenstre()==null;
		 } else {
		 
		 erIdentiskVenstre = erIdentiskRek(t1.getVenstre(),t2.getVenstre());}
		
		 boolean erIdentiskHøgre = false;
		 	if(t1.getHoyre()==null||t2.getHoyre()==null) {
		 		erIdentiskHøgre = t1.getHoyre()==null&&t2.getHoyre()==null;
		 	} else {
		 		erIdentiskHøgre = erIdentiskRek(t1.getHoyre(),t2.getHoyre());
		 	}
		 	return (erIdentiskVenstre&&erIdentiskHøgre);
		 
		 }
		 
	 }
	 