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
			if(QuickSort.AUFWAND){
				switch(pivot){
				case QuickSort.RECHTS_PIVOT:
					System.out.println("Pivot ist rechts:");
					break;
				case QuickSort.MEDIAN_OF_3_PIVOT:
					System.out.println("Pivot nach 3-Median:");
					break;
				case QuickSort.RANDOM_PIVOT:
					System.out.println("Pivot nach Random:");
					break;
				}
			}
			for(anzahl_elemente = 10; anzahl_elemente <= MAX_ANZAHLELEMENTE; anzahl_elemente*=10) {//for fuer Anzahl der zu testenden Elemente
				quickSort.quickSort(pivot, avgCase(anzahl_elemente));
				if(QuickSort.AUFWAND) { quickSort.showAufwand(); }
				
				for(i = 1; i < anzahl_elemente; i++){//for fuer das Iterieren durchs Array
					assertTrue(quickSort.getArray()[i-1].hashCode() <= quickSort.getArray()[i].hashCode());
				}
			}
			if(QuickSort.AUFWAND) {System.out.println();};
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
