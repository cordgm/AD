package a07.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import a07.ListElement;
import a07.Sorttest;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 * @version 0
 */
public class JUnit_QuickSort {
	
	ListElement[] listElements;
	Sorttest<ListElement> quickSort_upCount10;
	Sorttest<ListElement> quickSort_upCount50;
	Sorttest<ListElement> quickSort_upCount100;
	Sorttest<ListElement> quickSort_upCount500;
	Sorttest<ListElement> quickSort_upCount1000;
	Sorttest<ListElement> quickSort_upCount5000;
	Sorttest<ListElement> quickSort_downCount10;
	Sorttest<ListElement> quickSort_downCount50;
	Sorttest<ListElement> quickSort_downCount100;
	Sorttest<ListElement> quickSort_downCount500;
	Sorttest<ListElement> quickSort_downCount1000;
	Sorttest<ListElement> quickSort_downCount5000;
	Sorttest<ListElement> quickSort_avg10;
	Sorttest<ListElement> quickSort_avg50;
	Sorttest<ListElement> quickSort_avg100;
	Sorttest<ListElement> quickSort_avg500;
	Sorttest<ListElement> quickSort_avg1000;
	Sorttest<ListElement> quickSort_avg5000;

	@Before
	public void setUp() throws Exception {

		//best Case
		quickSort_upCount10 = new Sorttest<ListElement>(upCount(10));
		quickSort_upCount50 = new Sorttest<ListElement>(upCount(50));
		quickSort_upCount100 = new Sorttest<ListElement>(upCount(100));
		quickSort_upCount500 = new Sorttest<ListElement>(upCount(500));
		quickSort_upCount1000 = new Sorttest<ListElement>(upCount(1000));
		quickSort_upCount5000 = new Sorttest<ListElement>(upCount(5000));
		
		//worst Case
		quickSort_downCount10 = new Sorttest<ListElement>(downCount(10));
		quickSort_downCount50 = new Sorttest<ListElement>(downCount(50));
		quickSort_downCount100 = new Sorttest<ListElement>(downCount(100));
		quickSort_downCount500 = new Sorttest<ListElement>(downCount(500));
		quickSort_downCount1000 = new Sorttest<ListElement>(downCount(1000));
		quickSort_downCount5000 = new Sorttest<ListElement>(downCount(5000));
		
		quickSort_avg10 = new Sorttest<ListElement>(avgCase(10));
		quickSort_avg50 = new Sorttest<ListElement>(avgCase(50));
		quickSort_avg100 = new Sorttest<ListElement>(avgCase(100));
		quickSort_avg500 = new Sorttest<ListElement>(avgCase(500));
		quickSort_avg1000 = new Sorttest<ListElement>(avgCase(1000));
		quickSort_avg5000 = new Sorttest<ListElement>(avgCase(5000));
	}
	
	private ListElement[] upCount(int n){
		//Best Case
		listElements = new ListElement[n];
		for(int i = 0; i<n; i++){
			listElements[i] = new ListElement(i);
		}
		
		return listElements;
	}
	
	private ListElement[] downCount(int n){
		//worst Case
		listElements = new ListElement[n];
		for(int i = 0, j = n-1; i<n; i++, j--){
			listElements[i] = new ListElement(j);
		}
		return listElements;
	}
	
	private ListElement[] avgCase(int n){
		//worst Case
		listElements = new ListElement[n];
		for(int i = 0; i<n; i++){
			listElements[i] = new ListElement((int)(Math.random()*1000000));
		}
		return listElements;
	}

	@Test
	public void testQuickSort_R() {
		//Test Best Case
		quickSort_upCount10.quickSort_R();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_upCount10.getArray()[i].hashCode());
		}

		quickSort_upCount100.quickSort_R();
		for(int i = 0; i<100; i++){
			assertEquals(i, quickSort_upCount100.getArray()[i].hashCode());
		}

		quickSort_upCount1000.quickSort_R();
		for(int i = 0; i<1000; i++){
			assertEquals(i, quickSort_upCount1000.getArray()[i].hashCode());
		}

		//Test worst Case
		quickSort_downCount10.quickSort_R();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_downCount10.getArray()[i].hashCode());
		}
		
		quickSort_downCount100.quickSort_R();
		for(int i = 0; i<100; i++){
			assertEquals(i, quickSort_downCount100.getArray()[i].hashCode());
		}
		
		quickSort_downCount1000.quickSort_R();
		for(int i = 0; i<1000; i++){
			assertEquals(i, quickSort_downCount1000.getArray()[i].hashCode());
		}
		
		//Test avarage Case
		quickSort_avg10.quickSort_R();
		for(int i = 1; i<10; i++){
			assertTrue(quickSort_avg10.getArray()[i-1].hashCode() <= quickSort_avg10.getArray()[i].hashCode());
		}
		
		quickSort_avg100.quickSort_R();
		for(int i = 1; i<100; i++){
			assertTrue(quickSort_avg100.getArray()[i-1].hashCode() <= quickSort_avg100.getArray()[i].hashCode());
		}
		
		quickSort_avg1000.quickSort_R();
		for(int i = 1; i<1000; i++){
			assertTrue(quickSort_avg1000.getArray()[i-1].hashCode() <= quickSort_avg1000.getArray()[i].hashCode());
		}
	}

	@Test
	public void testQuickSort_3M() {
		//Test Best Case
		quickSort_downCount10.quickSort_3M();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_downCount10.getArray()[i].hashCode());
		}

		quickSort_downCount100.quickSort_3M();
		for(int i = 0; i<100; i++){
			assertEquals(i, quickSort_downCount100.getArray()[i].hashCode());
		}

		quickSort_downCount1000.quickSort_3M();
		for(int i = 0; i<1000; i++){
			assertEquals(i, quickSort_downCount1000.getArray()[i].hashCode());
		}
		
		//Test worst Case
		quickSort_upCount10.quickSort_3M();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_downCount10.getArray()[i].hashCode());
		}
		
		quickSort_upCount100.quickSort_3M();
		for(int i = 0; i<100; i++){
			assertEquals(i, quickSort_downCount100.getArray()[i].hashCode());
		}
		
		quickSort_upCount1000.quickSort_3M();
		for(int i = 0; i<1000; i++){
			assertEquals(i, quickSort_downCount1000.getArray()[i].hashCode());
		}

		//Test avarage Case
		quickSort_avg10.quickSort_3M();
		for(int i = 1; i<10; i++){
			assertTrue(quickSort_avg10.getArray()[i-1].hashCode() <= quickSort_avg10.getArray()[i].hashCode());
		}

		quickSort_avg100.quickSort_3M();
		for(int i = 1; i<100; i++){
			assertTrue(quickSort_avg100.getArray()[i-1].hashCode() <= quickSort_avg100.getArray()[i].hashCode());
		}

		quickSort_avg1000.quickSort_3M();
		for(int i = 1; i<1000; i++){
			assertTrue(quickSort_avg1000.getArray()[i-1].hashCode() <= quickSort_avg1000.getArray()[i].hashCode());
		}
		
	}

	@Test
	public void testQuickSort_Insertion() {
		//Test Best Case
		quickSort_downCount10.quick_Insertion();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_downCount10.getArray()[i].hashCode());
		}
		
		quickSort_downCount100.quick_Insertion();
		for(int i = 0; i<100; i++){
			assertEquals(i, quickSort_downCount100.getArray()[i].hashCode());
		}
		
		quickSort_downCount1000.quick_Insertion();
		for(int i = 0; i<1000; i++){
			assertEquals(i, quickSort_downCount1000.getArray()[i].hashCode());
		}
		
		//Test worst Case
		quickSort_upCount10.quick_Insertion();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_upCount10.getArray()[i].hashCode());
		}

		quickSort_upCount100.quick_Insertion();
		for(int i = 0; i<100; i++){
			assertEquals(i, quickSort_upCount100.getArray()[i].hashCode());
		}

		quickSort_upCount1000.quick_Insertion();
		for(int i = 0; i<1000; i++){
			assertEquals(i, quickSort_upCount1000.getArray()[i].hashCode());
		}

		//Test avarage Case
		quickSort_avg10.quick_Insertion();
		for(int i = 1; i<10; i++){
			assertTrue(quickSort_avg10.getArray()[i-1].hashCode() <= quickSort_avg10.getArray()[i].hashCode());
		}

		quickSort_avg100.quick_Insertion();
		for(int i = 1; i<100; i++){
			assertTrue(quickSort_avg100.getArray()[i-1].hashCode() <= quickSort_avg100.getArray()[i].hashCode());
		}

		quickSort_avg1000.quick_Insertion();
		for(int i = 1; i<1000; i++){
			assertTrue(quickSort_avg1000.getArray()[i-1].hashCode() <= quickSort_avg1000.getArray()[i].hashCode());
		}
		
	}

}
