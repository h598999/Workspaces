package ADT;

import java.util.Iterator;

public interface DictonaryADT<K, V> {

	/**
	 * Adds this Value value linked to this Key key to the Dictonary
	 * @param key the key to this new entry
	 * @param value the value of the new entry
	 */
	
	public void add(K key, V value);
	
	/**
	 * Removes the entry/entries with the given key
	 * @param key
	 * @return the value linked to the key that gets removed
	 */
	
	public V remove(K key);
	
	/**
	 * Returns the value linked to the key in the dictonary
	 * @param key
	 * @return the value linked to the key
	 */
	
	public V getValue(K key);
	
	/**
	 * Checks if the given an entry with the given key can be found in the dictonary
	 * @param key
	 * @return true if an entry with the given key is in the array, else returns false
	 */
	
	public boolean containsKey(K key);
	
	/**
	 * Creates an Iterator that traverses all search keys in the dictonary
	 * @return an iterator that provides sequential access to the search keys to the dictonary
	 */
	
	public Iterator<K> getKeyIterator();
	
	/**
	 * Creates an Iterator that traverses all the values in the dictonary
	 * @return an Iterator that provides sequential access to the values in the dictonary
	 */
	
	public Iterator<V> getValueIterator();
	
	/**
	 * Checks if the dictonary is empty
	 * @return true if the dictonary is empty, if not returns false
	 */
	
	public boolean isEmpty();
	
	
	/**
	 * 
	 * @return the number of entries in the dictonary
	 */
	public int getSize();
	
	/**
	 * Deletes every entry from the Dictonary
	 */
	
	public void clear();
	
}
