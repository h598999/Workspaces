package TabellBag;

public class TabellBag<T> implements KjedetBag<T>{
	
	private final T[] bag;
	private boolean initialized = false;
	private int numberOfEntries;
	
	
	public TabellBag(int st?rrelse) {
		@SuppressWarnings("unchecked")
		T[] tempbag = (T[])(new Object[st?rrelse]);
		bag = tempbag;
		numberOfEntries = 0;
		initialized = true;
	}

	@Override
	public int getCurrentSize() {
		return numberOfEntries;
	}

	@Override
	public boolean isEmpty() {
		if (numberOfEntries==0)
			return true;
		else
			return false;
	}

	@Override
	public boolean add(T newEntry) {
		boolean result = false;
		if (initialized&&!(getCurrentSize()>=numberOfEntries)) {
			result = true;
		}
		if (result) {
		bag[numberOfEntries] = newEntry;
		numberOfEntries++;}
		return result;
	}

	@Override
	public T remove(T anEntry) {
		int funnetindeks = -1;
		boolean funnet = false;
		int i = 0;
		while(i<numberOfEntries&&!funnet) {
			if (bag[i]==anEntry) {
				funnetindeks = i;
				funnet = true;
			} else
				i++;
		}
		if (funnet) {
			for (int o = funnetindeks; o<numberOfEntries-1; o++) {
				bag[o] = bag[o+1];
			}
			numberOfEntries--;
			return anEntry;
		} else
			return null;
	}

	@Override
	public void clear() {
		for (int i = 0; i<numberOfEntries; i++) {
			bag[i] = null;
		}
		numberOfEntries = 0;
		
	}

	@Override
	public int getFrequency(T anEntry) {
		int frequency = 0;
		for (int i = 0; i<numberOfEntries; i++) {
			if (bag[i].equals(anEntry))
				i++;
		}
		return frequency;
	}

	@Override
	public boolean contains(T anEntry) {
		boolean finnes = false;
		for (int i = 0; i<numberOfEntries; i++) {
			if (bag[i].equals(anEntry))
				finnes = true;
		}
		return finnes;
	}
	public T[] toArray() {
		return bag;	
	}
}
