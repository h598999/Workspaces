package ADT;

public interface BagInterface<T> {
	/**
	 * Gets the current number of entries in this bag.
	 * @return The integer number of entries currently in the bag
	 */
	
	public int getCurrentSize();
	
	/**
	 * Sees wether this bag is empty.
	 * @return True if the bag is empty, or false if not
	 */
	public boolean isEmpty();
	
	/**
	 * Adds a new entry to this bag.
	 * @param newEntry The object to be added as a new entry.
	 * @return True if the addition was succesfuk, or false if not
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
