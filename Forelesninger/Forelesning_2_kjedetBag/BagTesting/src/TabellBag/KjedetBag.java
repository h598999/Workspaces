package TabellBag;

public interface KjedetBag<T> {

	
public int getCurrentSize();

public boolean isEmpty();

public boolean add(T newEntry);

public T remove(T anEntry);

public void clear();

public int getFrequency(T anEntry);

public boolean contains(T anEntry);

public T[] toArray();
}
