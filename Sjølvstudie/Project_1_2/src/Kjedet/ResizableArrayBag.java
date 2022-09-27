package Kjedet;

import java.util.Random;

import ADT.BagInterface;

public class ResizableArrayBag<T> implements BagInterface<T> {
	
	private T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY = 3;
	
	@SuppressWarnings("unchecked")
	public ResizableArrayBag() {
		bag = (T[]) new Object[DEFAULT_CAPACITY];
		numberOfEntries = 0;
	}
	
	@Override
	public int getCurrentSize() {
		return numberOfEntries;
	}
	@Override
	public boolean isEmpty() {
		if (numberOfEntries==0) {
			return true;
		} else
			return false;
	}
	@Override
	public boolean add(T newEntry) {
		if (numberOfEntries==bag.length)
			expand();
		if (contains(newEntry)) {
			return false;
		} else {
		bag[numberOfEntries] = newEntry;
		numberOfEntries++;
		return true;
		}
	}
	@Override
	public boolean remove(T anEntry) {
		int funnetindeks = -1;
		boolean slettet = false;
		int i = 0;
		while (i<numberOfEntries&&!slettet) {
			if (bag[i]==anEntry) {
				funnetindeks = i;
				slettet = true;
			} else {
				i++;
			}}
			if (slettet) {
				bag[funnetindeks] = bag[numberOfEntries-1];
				bag[numberOfEntries-1] = null;
				numberOfEntries--;
			}
			return slettet;
		}
	@Override
	public T remove() {
		Random ran = new Random();
		int x = ran.nextInt(numberOfEntries);
		T removed = bag[x];
		remove(removed);
		return removed;
	}
	@Override
	public void clear() {
		while(!isEmpty()) {
			remove();
			
		}
	}
	@Override
	public boolean contains(T anEntry) {
		boolean contains = false;
		int i = 0;
		while(i<numberOfEntries&&!contains) {
			if (bag[i]==anEntry) {
				contains=true;
			} else {
				i++;
			}
		}
		return contains;
	}
	@Override
	public T[] toArray() {
		return bag;
	}
	public void expand() {
		@SuppressWarnings("unchecked")
		T[] newTab = (T[]) new Object[numberOfEntries*2];
		for (int i = 0; i<numberOfEntries; i++) {
			newTab[i] = bag[i];
		}
		bag = newTab;
	}

}
