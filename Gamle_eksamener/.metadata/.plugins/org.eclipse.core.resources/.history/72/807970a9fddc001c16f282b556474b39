package Oppgave_4;

public class BinaerTre<T extends Comparable<T>> {
private BinaerTreNode<T> rot;
private int antall;
public BinaerTre(){
 rot = null;
 antall = 0;
}
	public BinaerTre(T element){
	rot = new BinaerTreNode<T>(element);
	antall = 1;
}
public BinaerTre(T element, BinaerTre<T> vt, BinaerTre<T> ht){
	rot = new BinaerTreNode<T>(element);
	rot.setVenstre(vt.getRot());
	rot.setHoyre(ht.getRot());
	antall = 1 + vt.antall + ht.antall;
 }
	public BinaerTreNode<T> getRot(){ 
		
		return rot;
		
	}
public int antall(){ 
	return antall; 
	}


public void leggTil(T element) {
	leggTilRek(element, rot);
	
	
}

private void leggTilRek(T element, BinaerTreNode<T> rot) {
	BinaerTreNode<T> nyNode = new BinaerTreNode<T>(element);
	if (rot.getElement().compareTo(element)<0) {
		if (rot.getHoyre()!=null) {
			leggTilRek( element, rot.getHoyre());
		} else {
			rot.setHoyre(nyNode);
			antall++;
		}
	} else {
		if (rot.getVenstre()!=null) {
			leggTilRek(element, rot.getVenstre());
		} else {
			rot.setVenstre(nyNode);
			antall++;
		}
	}
	
}

 public int hoyde() {
	 int resultat = -1;
	 if (!erTom()) {
		 resultat = hoydeRek(rot);
	 }
return resultat;
 }
private int hoydeRek(BinaerTreNode<T> p) {
	
	int høgreveg = 0;
	int venstreverdi = 0;
	
	
	if (p.getVenstre()==null&&p.getHoyre()==null)
		return 0;
	else {
		if (p.getVenstre()!=null) {
			venstreverdi = 1+hoydeRek(p.getVenstre());
		} 
		if (p.getHoyre()!=null) {
			høgreveg = 1+hoydeRek(p.getHoyre());
		}
		return Math.max(venstreverdi, høgreveg);
	}
	
}

public boolean erTom() {
	return antall==0;
}

}//class
