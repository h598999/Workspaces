package Dictonaries;

import java.util.HashMap;
import java.util.Iterator;

import ADT.DictonaryADT;

public class Dictonary<K,V> implements DictonaryADT<K,V> {

private HashMap<K,V> map;
	
	@Override
	public void add(K key, V value) {
		map.put(key, value);
		
	}

	@Override
	public V remove(K key) {
		return map.remove(key);
	}

	@Override
	public V getValue(K key) {
		return map.get(key);
	}

	@Override
	public boolean containsKey(K key) {
		return map.get(key)!=null;
	}

	@Override
	public Iterator<K> getKeyIterator() {
		return map.keySet().iterator();
	}

	@Override
	public Iterator<V> getValueIterator() {
		return map.values().iterator();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public int getSize() {
		return map.size();
	}

	@Override
	public void clear() {
		map.clear();
		
	}
	

	
	

}
