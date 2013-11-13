package a06.test;

import static org.junit.Assert.*;

import org.junit.Test;

import a06.ListElement;
import a06.QuickSort;

public class JUnit_QuickSort {
	private final int MAX_ANZAHLELEMENTE = 10000;
	private final int PIVOT_METHODE = 3;//0 = rechts, 1 = 3-Median, 2 = Random
	ListElement[] listElements ;
	QuickSort<ListElement> quickSort = new QuickSort<ListElement>();

	@Test
	public void test() {
		int anzahl_elemente;
		int i;
		int pivot;
		for(pivot = 0; pivot < PIVOT_METHODE; pivot++){//for fuer Pivotelement
			for(anzahl_elemente = 10; anzahl_elemente <= MAX_ANZAHLELEMENTE; anzahl_elemente*=10){//for fuer Anzahl der zu testenden Elemente
				quickSort.quickSort(pivot, avgCase(anzahl_elemente));
				for(i = 1; i < anzahl_elemente; i++){//for fuer das Iterieren durchs Array
					assertTrue(quickSort.getArray()[i-1].hashCode() <= quickSort.getArray()[i].hashCode());
				}
			}
		}
	}
	

	private ListElement[] avgCase(int n){
		//worst Case
		listElements = new ListElement[n];
		for(int i = 0; i<n; i++){
			listElements[i] = new ListElement((int)(Math.random()*1000000));
		}
		return listElements;
	}

}
