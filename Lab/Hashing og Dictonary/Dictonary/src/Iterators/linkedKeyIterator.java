package Iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import hjelpeklasser.Entry;
import hjelpeklasser.Node;

public class linkedKeyIterator<K,V> implements Iterator<K> {

	private Node<Entry<K,V>> nextNode;
	
	public linkedKeyIterator(Node<Entry<K,V>> firstNode) {
		nextNode = firstNode;
	}
	
	@Override
	public boolean hasNext() {
		return nextNode != null;
	}

	@Override
	public K next() {
		
		K result;
		
		if (hasNext()) {
			result = nextNode.getElement().getKey();
			nextNode = nextNode.getNext();
		}
		else {
			throw new NoSuchElementException();
		}
		return result;
	}

	
}
