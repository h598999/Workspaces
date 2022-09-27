package Oppgave_2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SorteringTest {
private static final int SIZE = 100;
private Integer[] testdata = new Integer[SIZE];
@BeforeEach //Det samme som @Before i JUnit4
public final void setup() {
 Random rInt = new Random();
 for (int i = 0; i < testdata.length; i++) {
 testdata [i] = new Integer(rInt.nextInt());
 }
}
@Test
public final void testKvikkSort() {
	QuickSort.kvikkSort(testdata);
	assertTrue(verifiser(testdata));
}
private <T extends Comparable<T>> boolean verifiser(T[] data) {
	
	boolean erSortert = true;
	int i = 0;
	while(i<data.length-1&&erSortert) {
		if (data[i].compareTo(data[i+1])>0) {
			erSortert = true;
		}
		i++;
	}
	return erSortert;
	
}
}
