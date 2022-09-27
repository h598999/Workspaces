package Dictonaries;

import java.util.Iterator;

import ADT.DictonaryADT;
import Iterators.linkedKeyIterator;
import Iterators.linkedValueIterator;
import hjelpeklasser.Entry;
import hjelpeklasser.Node;

public class SortedLinkedDictonary <K extends Comparable<? super K>, V> implements DictonaryADT<K,V> {

	private Node<Entry<K,V>> firstNode;
	private int numberOfEntries;
	
	public SortedLinkedDictonary() {
		firstNode = null;
		numberOfEntries = 0;
	}
	
	@Override
	public void add(K key, V value) {
		
	
		
		//Search chain until you either find a node containing key
		//or locate where it should be
		
		Node<Entry<K,V>> currentNode = firstNode;
		Node<Entry<K,V>> forrige = null;
		while ((currentNode!=null)&&key.compareTo(currentNode.getElement().getKey())>0) {
			forrige = currentNode;
			currentNode = currentNode.getNext();
		}
		
		if ((currentNode != null)&&key.equals(currentNode.getElement().getKey())) {

			currentNode.getElement().setValue(value);
		}
		else {
			Entry<K,V> newEntry = new Entry<K,V>(key,value);
			Node<Entry<K,V>> newNode = new Node<Entry<K,V>>(newEntry);
			if (forrige == null) {
				newNode.setNext(firstNode);
				firstNode = newNode;
			}
			else {
				newNode.setNext(currentNode);
				forrige.setNext(newNode);
			}
		
			numberOfEntries++;
		}
		
		
		
	}

	@Override
	public V remove(K key) {
		
		if (firstNode.getElement().getKey().equals(key)) {
			firstNode = firstNode.getNext();
			numberOfEntries--;
			return firstNode.getElement().getValue();
		} else {
			if (containsKey(key)) {
				
			Node<Entry<K,V>> temp = firstNode;
			Node<Entry<K,V>> forrige = null;
			boolean funnet = false;
			int i = 0;
			V value = null;
			while(i<numberOfEntries && !funnet) {
				if (temp.getElement().getKey().equals(key)) {
					forrige.setNext(temp.getNext());
					numberOfEntries--;
					funnet = true;
					value =  temp.getElement().getValue();
				} else {
					forrige = temp;
					temp = temp.getNext();
					i++;
				}
			}
			return value;
				
			} else {
				return null;
			}
		}
		
		
	}

	@Override
	public V getValue(K key) {
		return findNode(key).getElement().getValue();
	}

	@Override
	public boolean containsKey(K key) {
		return findNode(key)!=null;
	}

	@Override
	public Iterator<K> getKeyIterator() {
		return new linkedKeyIterator<K,V>(firstNode);
	}

	@Override
	public Iterator<V> getValueIterator() {
		return new linkedValueIterator<K,V>(firstNode);
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
		firstNode = null;
		
	}

	private Node<Entry<K,V>> findNode(K key) {
		Node<Entry<K,V>> temp = firstNode;
		boolean funnet = false;
		int i = 0;
		while(i<numberOfEntries && !funnet) {
			if (temp.getElement().getKey().equals(key)) {
				funnet = true;
			} else {
				temp = temp.getNext();
				i++;
			}
		}
		if (funnet) {
			return temp;
		} else {
			return null;
		}
	}
	
}
