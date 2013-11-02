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
	QuickSort<ListElement> quickSort_worst;
	QuickSort<ListElement> quickSort_best;
	QuickSort<ListElement> quickSort_avg;

	@Before
	public void setUp() throws Exception {
		listElements = new ListElement[10];

		//Best Case
		for(int i = 0; i<10; i++){
			listElements[i] = new ListElement(i);
		}
		quickSort_best = new QuickSort<ListElement>(listElements);
		
		//worst Case
		for(int i = 9; i>=0; i--){
			listElements[i] = new ListElement(i);
		}
		quickSort_worst = new QuickSort<ListElement>(listElements);
		
		//average Case
	}

	@Test
	public void testQuickSort1() {
		//Test Best Case
		quickSort_best.QuickSort1();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_best.getArray()[i].getSchluessel());
		}

		//Test worst Case

		//Test avarage Case
	}

	@Test
	public void testQuickSort2() {
		//Test Best Case
		quickSort_best.QuickSort3();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_best.getArray()[i].getSchluessel());
		}
		
		//Test worst Case

		//Test avarage Case
		
	}

	@Test
	public void testQuickSort3() {
		//Test Best Case
		quickSort_best.QuickSort3();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_best.getArray()[i].getSchluessel());
		}
		
		//Test worst Case

		//Test avarage Case
		
	}

}
