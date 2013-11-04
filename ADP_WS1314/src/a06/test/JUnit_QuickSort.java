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
	QuickSort<ListElement> quickSort_best10;
	QuickSort<ListElement> quickSort_best50;
	QuickSort<ListElement> quickSort_best100;
	QuickSort<ListElement> quickSort_best500;
	QuickSort<ListElement> quickSort_best1000;
	QuickSort<ListElement> quickSort_best5000;
	QuickSort<ListElement> quickSort_worst10;
	QuickSort<ListElement> quickSort_worst50;
	QuickSort<ListElement> quickSort_worst100;
	QuickSort<ListElement> quickSort_worst500;
	QuickSort<ListElement> quickSort_worst1000;
	QuickSort<ListElement> quickSort_worst5000;
	QuickSort<ListElement> quickSort_avg10;
	QuickSort<ListElement> quickSort_avg50;
	QuickSort<ListElement> quickSort_avg100;
	QuickSort<ListElement> quickSort_avg500;
	QuickSort<ListElement> quickSort_avg1000;
	QuickSort<ListElement> quickSort_avg5000;

	@Before
	public void setUp() throws Exception {

		//best Case
		quickSort_best10 = new QuickSort<ListElement>(bestCase(10));
		quickSort_best50 = new QuickSort<ListElement>(bestCase(50));
		quickSort_best100 = new QuickSort<ListElement>(bestCase(100));
		quickSort_best500 = new QuickSort<ListElement>(bestCase(500));
		quickSort_best1000 = new QuickSort<ListElement>(bestCase(1000));
		quickSort_best5000 = new QuickSort<ListElement>(bestCase(5000));
		
		//worst Case
		quickSort_worst10 = new QuickSort<ListElement>(worstCase(10));
		quickSort_worst50 = new QuickSort<ListElement>(worstCase(50));
		quickSort_worst100 = new QuickSort<ListElement>(worstCase(100));
		quickSort_worst500 = new QuickSort<ListElement>(worstCase(500));
		quickSort_worst1000 = new QuickSort<ListElement>(worstCase(1000));
		quickSort_worst5000 = new QuickSort<ListElement>(worstCase(5000));
		
		//average Case
//		listElements = new ListElement[]{ new ListElement(5), new ListElement(3),
//										  new ListElement(2), new ListElement(1),
//										  new ListElement(9), new ListElement(7),
//										  new ListElement(4), new ListElement(6),
//										  new ListElement(8), new ListElement(0)
//										};
		quickSort_avg10 = new QuickSort<ListElement>(avgCase(10));
		quickSort_avg50 = new QuickSort<ListElement>(avgCase(50));
		quickSort_avg100 = new QuickSort<ListElement>(avgCase(100));
		quickSort_avg500 = new QuickSort<ListElement>(avgCase(500));
		quickSort_avg1000 = new QuickSort<ListElement>(avgCase(1000));
		quickSort_avg5000 = new QuickSort<ListElement>(avgCase(5000));
	}
	
	private ListElement[] bestCase(int n){
		//Best Case
		listElements = new ListElement[n];
		for(int i = 0; i<(n-1); i++){
			if(i == (n-1)/2){
				listElements[n-1] = new ListElement(i);
				listElements[(n-1)/2] = new ListElement(n-1);
			}else{
				listElements[i] = new ListElement(i);
			}
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
	
	private ListElement[] avgCase(int n){
		//worst Case
		listElements = new ListElement[n];
		for(int i = 0; i<n; i++){
			listElements[i] = new ListElement((int)(Math.random()*n));
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
		quickSort_best50.quickSort1();
		quickSort_best50.showAufwand();
		quickSort_best100.quickSort1();
		quickSort_best100.showAufwand();
		quickSort_best500.quickSort1();
		quickSort_best500.showAufwand();
		quickSort_best1000.quickSort1();
		quickSort_best1000.showAufwand();
		quickSort_best5000.quickSort1();
		quickSort_best5000.showAufwand();

		//Test worst Case
		quickSort_worst10.quickSort1();
		System.out.print("testQuickSort1 worst Case: ");
		quickSort_worst10.showDaten();
		quickSort_worst10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_worst10.getArray()[i].hashCode());
		}
		quickSort_worst50.quickSort1();
		quickSort_worst50.showAufwand();
		quickSort_worst100.quickSort1();
		quickSort_worst100.showAufwand();
		quickSort_worst500.quickSort1();
		quickSort_worst500.showAufwand();
		quickSort_worst1000.quickSort1();
		quickSort_worst1000.showAufwand();
		quickSort_worst5000.quickSort1();
		quickSort_worst5000.showAufwand();

		//Test avarage Case
		quickSort_avg10.quickSort1();
		System.out.print("testQuickSort1 avg Case:   ");
		quickSort_avg10.showDaten();
		quickSort_avg10.showAufwand();
		for(int i = 1; i<10; i++){
			assertTrue(quickSort_avg10.getArray()[i-1].hashCode() <= quickSort_avg10.getArray()[i].hashCode());
		}
		quickSort_avg50.quickSort1();
		quickSort_avg50.showAufwand();
		quickSort_avg100.quickSort1();
		quickSort_avg100.showAufwand();
		quickSort_avg500.quickSort1();
		quickSort_avg500.showAufwand();
		quickSort_avg1000.quickSort1();
		quickSort_avg1000.showAufwand();
		quickSort_avg5000.quickSort1();
		quickSort_avg5000.showAufwand();
	}

	@Test
	public void testQuickSort2() {
		//Test Best Case
		quickSort_best10.quickSort2();
		System.out.print("\ntestQuickSort2 best Case:  ");
		quickSort_best10.showDaten();
		quickSort_best10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_best10.getArray()[i].hashCode());
		}
		quickSort_best100.quickSort2();
		quickSort_best100.showAufwand();
		quickSort_best1000.quickSort2();
		quickSort_best1000.showAufwand();
		
		//Test worst Case
		quickSort_worst10.quickSort2();
		System.out.print("testQuickSort2 worst Case: ");
		quickSort_worst10.showDaten();
		quickSort_worst10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_worst10.getArray()[i].hashCode());
		}
		quickSort_worst100.quickSort2();
		quickSort_worst100.showAufwand();
		quickSort_worst1000.quickSort2();
		quickSort_worst1000.showAufwand();

		//Test avarage Case
		quickSort_avg10.quickSort2();
		System.out.print("testQuickSort2 avg Case:   ");
		quickSort_avg10.showDaten();
		quickSort_avg10.showAufwand();
		for(int i = 1; i<10; i++){
			assertTrue(quickSort_avg10.getArray()[i-1].hashCode() <= quickSort_avg10.getArray()[i].hashCode());
		}
		quickSort_avg100.quickSort2();
		quickSort_avg100.showAufwand();
		quickSort_avg1000.quickSort2();
		quickSort_avg1000.showAufwand();
		
	}

	@Test
	public void testQuickSort3() {
		//Test Best Case
		quickSort_best10.quickSort3();
		System.out.print("\ntestQuickSort3 best Case:  ");
		quickSort_best10.showDaten();
		quickSort_best10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_best10.getArray()[i].hashCode());
		}
		quickSort_best100.quickSort3();
		quickSort_best100.showAufwand();
		quickSort_best1000.quickSort3();
		quickSort_best1000.showAufwand();
		
		//Test worst Case
		quickSort_worst10.quickSort3();
		System.out.print("testQuickSort3 worst Case: ");
		quickSort_worst10.showDaten();
		quickSort_worst10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_worst10.getArray()[i].hashCode());
		}
		quickSort_worst100.quickSort3();
		quickSort_worst100.showAufwand();
		quickSort_worst1000.quickSort3();
		quickSort_worst1000.showAufwand();

		//Test avarage Case
		quickSort_avg10.quickSort3();
		System.out.print("testQuickSort3 avg Case:   ");
		quickSort_avg10.showDaten();
		quickSort_avg10.showAufwand();
		for(int i = 1; i<10; i++){
			assertTrue(quickSort_avg10.getArray()[i-1].hashCode() <= quickSort_avg10.getArray()[i].hashCode());
		}
		quickSort_avg100.quickSort3();
		quickSort_avg100.showAufwand();
		quickSort_avg1000.quickSort3();
		quickSort_avg1000.showAufwand();
		
	}

}
