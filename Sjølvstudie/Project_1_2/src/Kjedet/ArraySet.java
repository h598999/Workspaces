package Kjedet;

import ADT.SetInterface;

public class ArraySet<T> implements SetInterface<T>{
	
	@SuppressWarnings("rawtypes")
	ResizableArrayBag bag = new ResizableArrayBag();

	@Override
	public int getCurrentSize() {
		return bag.getCurrentSize();
	}

	@Override
	public boolean isEmpty() {
		return bag.isEmpty();
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(T newEntry) {
		return bag.add(newEntry);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean remove(T anEntry) {
		return bag.remove(anEntry);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove() {
		return (T)bag.remove();
	}

	@Override
	public void clear() {
		bag.clear();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean contains(T anEntry) {
	return bag.contains(anEntry);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T[] toArray() {
		return (T[])bag.toArray();
	}

}
