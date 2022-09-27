package Dictonaries;

import java.util.Iterator;

import ADT.DictonaryADT;
import Iterators.linkedKeyIterator;
import Iterators.linkedValueIterator;
import hjelpeklasser.Entry;
import hjelpeklasser.Node;

public class LinkedDictonary<K,V> implements DictonaryADT<K,V> {

	
	private Node<Entry<K,V>> start;
	private int numberOfEntries;
	
	public LinkedDictonary(Node<Entry<K,V>> start) {
		this.start = start;
	}
	
	public LinkedDictonary() {
		
	}
	
	
	
	@Override
	public void add(K key, V value) {
		if ((key==null)||(value == null)) {
			throw new IllegalArgumentException();
		} else {
			if (containsKey(key)) {
				findKeyNode(key).getElement().setValue(value);
			} else {
				Entry<K,V> newentry = new Entry<K,V>(key,value);
				Node<Entry<K,V>> newNode = new Node<Entry<K,V>>(newentry);
				if (isEmpty()) {
					newNode.setNext(start);
					start = newNode;
					numberOfEntries++;
				}
				else {
					int i = 0;
					Node<Entry<K,V>> temp = start;
					while(i<numberOfEntries) {
						temp = temp.getNext();
						i++;
					}
					temp.setNext(newNode);
					numberOfEntries++;
					
				}
			}
		}
		
	}

	@Override
	public V remove(K key) {
		
		if (start.getElement().getKey().equals(key)) {
			start = start.getNext();
			numberOfEntries--;
			return start.getElement().getValue();
		} else {
		
		int i = 0;
		Node<Entry<K,V>> removenode = start;
		V value = removenode.getElement().getValue();
		Node<Entry<K,V>> forrige = null;
		boolean funnet = false;
		while (i<numberOfEntries&&!funnet) {
			if (removenode.getElement().getKey().equals(key)) {
				forrige.setNext(removenode.getNext());
			} else {
				forrige = removenode;
				removenode = removenode.getNext();
			}
		}
		return value;
		}
	
		
	}

	@Override
	public V getValue(K key) {
		return findKeyNode(key).getElement().getValue();
	}

	@Override
	public boolean containsKey(K key) {
		
		boolean funnet = false;
		Node<Entry<K,V>> temp = new Node<Entry<K,V>>();
		temp = start;
		int i = 0;
		while(!funnet&&i<numberOfEntries) {
			if (temp.getElement().getKey().equals(key)) {
				funnet = true;
			} else {
				temp = temp.getNext();
				i++;
			}
		}
		return funnet;
		
	}

	@Override
	public Iterator<K> getKeyIterator() {
		return new linkedKeyIterator<K,V>(start);
	}

	@Override
	public Iterator<V> getValueIterator() {
		return new linkedValueIterator<K,V>(start);
	}

	@Override
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}

	@Override
	public int getSize() {
		return numberOfEntries;
	}

	@Override
	public void clear() {
		start = null;
		numberOfEntries = 0;
		
	}

	private Node<Entry<K,V>> findKeyNode(K key){
		Node<Entry<K,V>> temp = new Node<Entry<K,V>>();
		temp = start;
		boolean funnet = false;
		int i = 0;
		while(i<numberOfEntries&&!funnet) {
			if (temp.getElement().getKey().equals(key)) {
				return temp;
			} else {
				temp = temp.getNext();
				i++;
			}
		}
		return null;
	}
	
}
