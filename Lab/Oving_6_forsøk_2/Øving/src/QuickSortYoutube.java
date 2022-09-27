
public class QuickSortYoutube {

	public static <T extends Comparable<? super T>> void quickSortYoutube(T[] a, int lowIndex, int highIndex) {
		
		if (lowIndex >= highIndex) {
			return;
		}
		
		int mid = (lowIndex + highIndex)/2;
		sortFirstMiddleLast(a, lowIndex, mid, highIndex);
		swap(a, mid, highIndex);
		T pivot = a[highIndex];
		
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer) {
			
			while(a[leftPointer].compareTo(pivot)<=0 && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			while (a[rightPointer].compareTo(pivot)>= 0 && leftPointer < rightPointer) {
				rightPointer--;
			}
		
			swap(a, leftPointer, rightPointer);
		}
		
		swap(a, leftPointer, highIndex);
		
		quickSortYoutube(a, lowIndex, leftPointer-1);
		quickSortYoutube(a, leftPointer + 1, highIndex);
	}
	
	private static <T extends Comparable<? super T>> void sortFirstMiddleLast(T[] a, int first, int mid, int last) {
		order(a, first, mid); // Make a[first] <= a[mid]
		order(a, mid, last); // Make a[mid] <= a[last]
		order(a, first, mid); // Make a[first] <= a[mid]
	} // end sortFirstMiddleLast

	private static <T extends Comparable<? super T>> void order(T[] a, int i, int j) {
		if (a[i].compareTo(a[j]) > 0)
			swap(a, i, j);
	} // end order
	
	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
