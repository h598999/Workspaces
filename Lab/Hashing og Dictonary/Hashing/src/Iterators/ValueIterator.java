package Iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import Dictonaries.HashedDictonary;

public class ValueIterator<K,V> implements Iterator<V> {

	private int currentIndex;
	private int NumberLeft;
	private HashedDictonary<K,V> dictonary;
	
	public ValueIterator(HashedDictonary<K,V> dictonary) {
		this.dictonary = dictonary;
		currentIndex = 0;
		NumberLeft = dictonary.getSize();
	}
	
	@Override
	public boolean hasNext() {
		return NumberLeft > 0;
	}
	
	@Override
	public V next() {
		
		V result = null;
		
		if (hasNext()) {
			while ((dictonary.getHashTable()[currentIndex]==null)||(dictonary.getHashTable()[currentIndex].isRemoved())) {
				currentIndex++;
			}
			result = dictonary.getHashTable()[currentIndex].getValue();
			NumberLeft--;
			currentIndex++;
		} else {
			throw new NoSuchElementException();
		}
		return result;
	}
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	
	
}