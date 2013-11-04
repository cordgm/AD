package a06.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import a06.ListElement;
import a06.QuickSort;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 * @version 0
 */
public class JUnit_QuickSort {
	
	ListElement[] listElements;
	QuickSort<ListElement> quickSort_worst10;
	QuickSort<ListElement> quickSort_worst100;
	QuickSort<ListElement> quickSort_worst1000;
	QuickSort<ListElement> quickSort_best10;
	QuickSort<ListElement> quickSort_best100;
	QuickSort<ListElement> quickSort_best1000;
	QuickSort<ListElement> quickSort_best10000;
	QuickSort<ListElement> quickSort_best100000;
	QuickSort<ListElement> quickSort_best1000000;
	QuickSort<ListElement> quickSort_avg;

	@Before
	public void setUp() throws Exception {

		//best Case
		quickSort_best10 = new QuickSort<ListElement>(bestCase(10));
		quickSort_best100 = new QuickSort<ListElement>(bestCase(100));
		quickSort_best1000 = new QuickSort<ListElement>(bestCase(1000));
//		quickSort_best10000 = new QuickSort<ListElement>(bestCase(10000));
//		quickSort_best100000 = new QuickSort<ListElement>(bestCase(100000));
//		quickSort_best1000000 = new QuickSort<ListElement>(bestCase(1000000));
		
		//worst Case
		quickSort_worst10 = new QuickSort<ListElement>(worstCase(10));
		quickSort_worst100 = new QuickSort<ListElement>(worstCase(100));
		quickSort_worst1000 = new QuickSort<ListElement>(worstCase(1000));
		
		//average Case
		listElements = new ListElement[]{ new ListElement(5), new ListElement(3),
										  new ListElement(2), new ListElement(1),
										  new ListElement(9), new ListElement(7),
										  new ListElement(4), new ListElement(6),
										  new ListElement(8), new ListElement(0)
										};
		quickSort_avg = new QuickSort<ListElement>(listElements);
	}
	
	private ListElement[] bestCase(int n){
		//Best Case
		listElements = new ListElement[n];
		for(int i = 0; i<n; i++){
			listElements[i] = new ListElement(i);
		}
		return listElements;
	}
	
	private ListElement[] worstCase(int n){
		//worst Case
		listElements = new ListElement[n];
		for(int i = 0, j = 9; i<n; i++, j--){
			listElements[i] = new ListElement(j);
		}
		return listElements;
	}

	@Test
	public void testQuickSort1() {
		//Test Best Case
		quickSort_best10.quickSort1();
		System.out.print("testQuickSort1 best Case:  ");
		quickSort_best10.showDaten();
		quickSort_best10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_best10.getArray()[i].hashCode());
		}
		quickSort_best100.quickSort1();
		quickSort_best100.showAufwand();
		quickSort_best1000.quickSort1();
		quickSort_best1000.showAufwand();

		//Test worst Case
		quickSort_worst10.quickSort1();
		System.out.print("testQuickSort1 worst Case: ");
		quickSort_worst10.showDaten();
		quickSort_worst10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_worst10.getArray()[i].hashCode());
		}
		quickSort_worst100.quickSort1();
		quickSort_worst100.showAufwand();
		quickSort_worst1000.quickSort1();
		quickSort_worst1000.showAufwand();

		//Test avarage Case
		quickSort_avg.quickSort1();
		System.out.print("testQuickSort1 avg Case:   ");
		quickSort_avg.showDaten();
		quickSort_avg.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_avg.getArray()[i].hashCode());
		}
	}

	@Test
	public void testQuickSort2() {
		//Test Best Case
		quickSort_best10.quickSort2();
		System.out.print("\ntestQuickSort2 best Case:  ");
		quickSort_best10.showDaten();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_best10.getArray()[i].hashCode());
		}
		
		//Test worst Case
		quickSort_worst10.quickSort2();
		System.out.print("testQuickSort2 worst Case: ");
		quickSort_worst10.showDaten();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_worst10.getArray()[i].hashCode());
		}

		//Test avarage Case
		quickSort_avg.quickSort2();
		System.out.print("testQuickSort2 avg Case:   ");
		quickSort_avg.showDaten();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_avg.getArray()[i].hashCode());
		}
		
	}

	@Test
	public void testQuickSort3() {
		//Test Best Case
		quickSort_best10.quickSort3();
		System.out.print("\ntestQuickSort3 best Case:  ");
		quickSort_best10.showDaten();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_best10.getArray()[i].hashCode());
		}
		
		//Test worst Case
		quickSort_worst10.quickSort3();
		System.out.print("testQuickSort3 worst Case: ");
		quickSort_worst10.showDaten();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_worst10.getArray()[i].hashCode());
		}

		//Test avarage Case
		quickSort_avg.quickSort3();
		System.out.print("testQuickSort3 avg Case:   ");
		quickSort_avg.showDaten();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_avg.getArray()[i].hashCode());
		}
		
	}

}
