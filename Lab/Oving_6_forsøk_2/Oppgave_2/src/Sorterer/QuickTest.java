package Sorterer;

public class QuickTest {

	public static void main(String[] args) {
		
		Integer[] tab = {2,1,3,6,9,12,3,10,999999999,1};
		QuickSort.quickSortYoutube(tab, 0,tab.length-1);
		

		for (int o = 0; o<tab.length; o++ ) {
			System.out.println(tab[o]);
		}
		

	}

}
