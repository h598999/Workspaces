package Ekstra;

public class BinaerTreNode<T>{
	 private T element;
	 private BinaerTreNode<T> venstre, hoyre;
	 public BinaerTreNode(T el){
	venstre = null; 
	hoyre = null;
	element = el;
	}
	 public BinaerTreNode(T element,
	 BinaerTreNode<T> venstre,
	BinaerTreNode<T> hoyre){
	 this.element = element;
	 this.venstre = venstre;
	 this.hoyre = hoyre;
	}
	public BinaerTreNode<T> getVenstre(){
	 return venstre;
	}
	public BinaerTreNode<T> getHoyre(){
	 return hoyre;
	}
	public void setVenstre(BinaerTreNode<T> ny){
	 venstre = ny;
	}
	public void setHoyre(BinaerTreNode<T> ny){
	 hoyre = ny;
	}
	public T getElement(){
	 return element;
	}
	public void setElement(T el){
	 element = el;
	}
	}
