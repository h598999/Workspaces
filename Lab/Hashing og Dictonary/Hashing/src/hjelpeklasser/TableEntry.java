package hjelpeklasser;

public class TableEntry<S,T> {

	private S key;
	private T value;
	private States state;
	private enum States {CURRENT , REMOVED};
	
	public TableEntry(S searchKey, T dataValue) {
		
		key = searchKey;
		value = dataValue;
		state = States.CURRENT;
		
	}
	
	public void setKey(S key) {
		this.key = key;
	}
	
	public S getKey() {
		return key;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public States getState() {
		return state;
	}
	
	public void setToRemoved() {
		state = States.REMOVED;
	}
	public boolean isIn() {
		return state==States.CURRENT;
	}
	
	public boolean isRemoved() {
		return state == States.REMOVED;
	}
	
}
