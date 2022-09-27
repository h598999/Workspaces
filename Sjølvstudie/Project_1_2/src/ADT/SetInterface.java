package ADT;

public interface SetInterface<T> {
	
	/**
	 * Gets the current number of entries in this bag.
	 * @return The integer number of entries currently in the bag
	 */
	public int getCurrentSize();
	/**
	 * Checks if the bag is empty
	 * @return true if the bag is empty, false if it is not
	 */
	public boolean isEmpty();
	
	/**
	 * Adds a new entry to this set, avoiding duplicates.
	 * @param newEntry The object to be added as a new entry
	 * @return True if the addition is sucssesful, or false if the item already is in the set.
	 */
	public boolean add(T newEntry);
	
	/**
	 * Removes a specific entry from this set, if possible.
	 * @param anEntry The entry to be removed
	 * @return True if the removal was successful, false if not
	 */
	public boolean remove(T anEntry);
	
	/**
	 * removes an unspecified entry from this set if possible
	 * @return the removed object if successful, if not null
	 */
	public T remove();
	
	/**
	 * Removes all the objects from the set
	 */
	
	public void clear();
	
	/**
	 * Checks if the set contains a specific entry
	 * @param anEntry,the entry that the method will check for
	 * @return true if the set contains the specified entry, false if not
	 */
	public boolean contains (T anEntry);
	/**
	 * Turns the set into an array of the object sets
	 * @return the set as an array
	 */
	public T[] toArray();

}
