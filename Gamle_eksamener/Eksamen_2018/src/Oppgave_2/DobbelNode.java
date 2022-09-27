package Oppgave_2;

public class DobbelNode<T> {
private DobbelNode<T> neste;
private DobbelNode<T> forrige;
private T element;
	public DobbelNode() {
		neste = null;
		element = null;
		forrige = null;
	}
public DobbelNode(T elem) {
neste = null;
forrige = null;
element = elem;
}
public DobbelNode<T> getNeste() {
 return neste;
}
public DobbelNode<T> getForrige() {
 return forrige;
}
public void setNeste(DobbelNode<T> dnode) {
 neste = dnode;
}
public void setForrige(DobbelNode<T> dnode) {
 forrige = dnode;
}
public T getElement() {
return element;
}
public void setElement(T elem) {
element = elem;
}
}