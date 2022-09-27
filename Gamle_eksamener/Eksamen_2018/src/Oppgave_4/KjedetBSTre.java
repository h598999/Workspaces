package Oppgave_4;

public class KjedetBSTre<T extends Comparable<T>> {
private int antall;
private BinaerTreNode<T> rot;
public KjedetBSTre() {
antall = 0;
rot = null;
}
public KjedetBSTre(T element) {
antall = 1;
rot = new BinaerTreNode<T>(element);
}

public int antall() { return antall;

}
public T finnMin(){
	return	finnMinRek(rot);
}

private T finnMinRek(BinaerTreNode<T> p) {
	
	if (p.getVenstre()==null) {
		return p.getElement();
	} else {
		return finnMinRek(p.getVenstre());
	}
	
}

public KjedetBSTre sortTabTilBST(T[] data){
	KjedetBSTre ny = new KjedetBSTre();
	ny.rot = sortTabTilBSTRek(data, 0, data.length - 1);
	ny.antall = data.length; 
	return ny;
}

private BinaerTreNode<T> sortTabTilBSTRek(T[] data, int min, int maks) {
	if (min<=maks) {
		int midten = (min+maks)/2;
		BinaerTreNode<T> rot = new BinaerTreNode<T>(data[midten]);
		rot.setVenstre(sortTabTilBSTRek(data,min,midten-1));
		rot.setHoyre(sortTabTilBSTRek(data,midten+1,maks));
		return rot;
} else {
	return null;
}
	
}


}//class
