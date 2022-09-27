
public class Test {
	
	public static void main(String[] args) {
		Integer[] table1 = {4,1,3,6,7,1,2,5,7,4,100,420,113};
		QuickSortYoutube.quickSortYoutube(table1,0, table1.length-1);
		for (int i = 0; i<table1.length; i++) {
			System.out.println(table1[i]);
		}
	}
}
