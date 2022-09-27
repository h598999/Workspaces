package Sorter;

public class test {

	
	public static void main(String[] args) {
		
		Integer[] table = {4,1,3,6,6,3,2,1,456,134,2};
		InserttionSort.InsertionSort(table);
		
		for (int i = 0; i<table.length; i++) {
			System.out.println(table[i]);
		}
		
		System.out.println(5/2);
		
	}
}
