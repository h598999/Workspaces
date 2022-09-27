package Iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import hjelpeklasser.Entry;
import hjelpeklasser.Node;

public class linkedValueIterator<K,V> implements Iterator<V> {

	private Node<Entry<K,V>> nextNode;
	
	public linkedValueIterator(Node<Entry<K,V>> firstNode) {
		nextNode = firstNode;
	}
	
	@Override
	public boolean hasNext() {
		return nextNode != null;
	}

	@Override
	public V next() {
		
		V result;
		
		if (hasNext()) {
			result = nextNode.getElement().getValue();
			nextNode = nextNode.getNext();
		}
		else {
			throw new NoSuchElementException();
		}
		return result;
	}

	
}