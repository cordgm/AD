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
public class JUnit_QuickSort_old {
	
	ListElement[] listElements;
	QuickSort<ListElement> quickSort_upCount10;
	QuickSort<ListElement> quickSort_upCount50;
	QuickSort<ListElement> quickSort_upCount100;
	QuickSort<ListElement> quickSort_upCount500;
	QuickSort<ListElement> quickSort_upCount1000;
	QuickSort<ListElement> quickSort_upCount5000;
	QuickSort<ListElement> quickSort_downCount10;
	QuickSort<ListElement> quickSort_downCount50;
	QuickSort<ListElement> quickSort_downCount100;
	QuickSort<ListElement> quickSort_downCount500;
	QuickSort<ListElement> quickSort_downCount1000;
	QuickSort<ListElement> quickSort_downCount5000;
	QuickSort<ListElement> quickSort_avg10;
	QuickSort<ListElement> quickSort_avg50;
	QuickSort<ListElement> quickSort_avg100;
	QuickSort<ListElement> quickSort_avg500;
	QuickSort<ListElement> quickSort_avg1000;
	QuickSort<ListElement> quickSort_avg5000;

	@Before
	public void setUp() throws Exception {

		//best Case
//		listElements = new ListElement[10];
//		for(int i = 0; i<(10-1); i++){
//			if(i == (1-1)/2){
//				listElements[1-1] = new ListElement(i);
//				listElements[(1-1)/2] = new ListElement(1-1);
//			}else{
//				listElements[i] = new ListElement(i);
//			}
//		}
//		listElements = new ListElement[]{ 	new ListElement(1), new ListElement(3),
//											new ListElement(2), new ListElement(6),
//											new ListElement(5), new ListElement(7),
//											new ListElement(4)
//										};
//		};
		quickSort_upCount10 = new QuickSort<ListElement>(upCount(10));
		quickSort_upCount50 = new QuickSort<ListElement>(upCount(50));
		quickSort_upCount100 = new QuickSort<ListElement>(upCount(100));
		quickSort_upCount500 = new QuickSort<ListElement>(upCount(500));
		quickSort_upCount1000 = new QuickSort<ListElement>(upCount(1000));
		quickSort_upCount5000 = new QuickSort<ListElement>(upCount(5000));
		
		//worst Case
		quickSort_downCount10 = new QuickSort<ListElement>(downCount(10));
		quickSort_downCount50 = new QuickSort<ListElement>(downCount(50));
		quickSort_downCount100 = new QuickSort<ListElement>(downCount(100));
		quickSort_downCount500 = new QuickSort<ListElement>(downCount(500));
		quickSort_downCount1000 = new QuickSort<ListElement>(downCount(1000));
		quickSort_downCount5000 = new QuickSort<ListElement>(downCount(5000));
		
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
	
	private ListElement[] upCount(int n){
		//Best Case
		listElements = new ListElement[n];
		for(int i = 0; i<n; i++){
//			if(i == (n-1)/2){
//				listElements[n-1] = new ListElement(i);
//				listElements[(n-1)/2] = new ListElement(n-1);
//			}else{
				listElements[i] = new ListElement(i);
//			}
		}
		
//		int size = rechts - links + 1;
//		if(size>1){
//			listElements[rechts] = new ListElement(size/2-1 + links);
//			listElements[size/2-1 + links] = new ListElement(rechts);
//			bestCase(links, size/2-2 + links);
//			bestCase(size/2 + links, rechts-1);
//		}
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
	public void testQuickSort1() {
		//Test Best Case
//		quickSort_upCount10.quickSort1();
//		System.out.print("testQuickSort1 best Case:  ");
//		quickSort_upCount10.showDaten();
//		quickSort_upCount10.showAufwand();
//		for(int i = 0; i<10; i++){
//			assertEquals(i, quickSort_best10.getArray()[i].hashCode());
//		}
//		quickSort_best50.quickSort1();
//		quickSort_best50.showAufwand();
//		quickSort_upCount100.quickSort1();
//		quickSort_upCount100.showAufwand();
//		quickSort_best500.quickSort1();
//		quickSort_best500.showAufwand();
//		quickSort_upCount1000.quickSort1();
//		quickSort_upCount1000.showAufwand();
//		quickSort_best5000.quickSort1();
//		quickSort_best5000.showAufwand();

		//Test worst Case
		quickSort_downCount10.quickSort1();
		System.out.print("testQuickSort1 worst Case: ");
		quickSort_downCount10.showDaten();
		quickSort_downCount10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_downCount10.getArray()[i].hashCode());
		}
		quickSort_downCount50.quickSort1();
		quickSort_downCount50.showAufwand();
		quickSort_downCount100.quickSort1();
		quickSort_downCount100.showAufwand();
		quickSort_downCount500.quickSort1();
		quickSort_downCount500.showAufwand();
		quickSort_downCount1000.quickSort1();
		quickSort_downCount1000.showAufwand();
		quickSort_downCount5000.quickSort1();
		quickSort_downCount5000.showAufwand();

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
		quickSort_downCount10.quickSort2();
		System.out.print("\ntestQuickSort2 best Case:  ");
		quickSort_downCount10.showDaten();
		quickSort_downCount10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_downCount10.getArray()[i].hashCode());
		}
		quickSort_downCount50.quickSort2();
		quickSort_downCount50.showAufwand();
		quickSort_downCount100.quickSort2();
		quickSort_downCount100.showAufwand();
		quickSort_downCount500.quickSort2();
		quickSort_downCount500.showAufwand();
		quickSort_downCount1000.quickSort2();
		quickSort_downCount1000.showAufwand();
		quickSort_downCount5000.quickSort2();
		quickSort_downCount5000.showAufwand();
		
		//Test worst Case
		quickSort_upCount10.quickSort2();
		System.out.print("testQuickSort2 worst Case: ");
		quickSort_upCount10.showDaten();
		quickSort_upCount10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_downCount10.getArray()[i].hashCode());
		}
		quickSort_upCount50.quickSort2();
		quickSort_upCount50.showAufwand();
		quickSort_upCount100.quickSort2();
		quickSort_upCount100.showAufwand();
		quickSort_upCount500.quickSort2();
		quickSort_upCount500.showAufwand();
		quickSort_upCount1000.quickSort2();
		quickSort_upCount1000.showAufwand();
		quickSort_upCount5000.quickSort2();
		quickSort_upCount5000.showAufwand();

		//Test avarage Case
		quickSort_avg10.quickSort2();
		System.out.print("testQuickSort2 avg Case:   ");
		quickSort_avg10.showDaten();
		quickSort_avg10.showAufwand();
		for(int i = 1; i<10; i++){
			assertTrue(quickSort_avg10.getArray()[i-1].hashCode() <= quickSort_avg10.getArray()[i].hashCode());
		}
		quickSort_avg50.quickSort2();
		quickSort_avg50.showAufwand();
		quickSort_avg100.quickSort2();
		quickSort_avg100.showAufwand();
		quickSort_avg500.quickSort2();
		quickSort_avg500.showAufwand();
		quickSort_avg1000.quickSort2();
		quickSort_avg1000.showAufwand();
		quickSort_avg5000.quickSort2();
		quickSort_avg5000.showAufwand();
		
	}

	@Test
	public void testQuickSort3() {
		//Test Best Case
		quickSort_downCount10.quickSort3();
		System.out.print("\ntestQuickSort3 best Case:  ");
		quickSort_downCount10.showDaten();
		quickSort_downCount10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_downCount10.getArray()[i].hashCode());
		}
		quickSort_downCount50.quickSort3();
		quickSort_downCount50.showAufwand();
		quickSort_downCount100.quickSort3();
		quickSort_downCount100.showAufwand();
		quickSort_downCount500.quickSort3();
		quickSort_downCount500.showAufwand();
		quickSort_downCount1000.quickSort3();
		quickSort_downCount1000.showAufwand();
		quickSort_downCount5000.quickSort3();
		quickSort_downCount5000.showAufwand();
		
		//Test worst Case
		quickSort_upCount10.quickSort3();
		System.out.print("testQuickSort3 worst Case: ");
		quickSort_upCount10.showDaten();
		quickSort_upCount10.showAufwand();
		for(int i = 0; i<10; i++){
			assertEquals(i, quickSort_upCount10.getArray()[i].hashCode());
		}
		quickSort_upCount50.quickSort3();
		quickSort_upCount50.showAufwand();
		quickSort_upCount100.quickSort3();
		quickSort_upCount100.showAufwand();
		quickSort_upCount500.quickSort3();
		quickSort_upCount500.showAufwand();
		quickSort_upCount1000.quickSort3();
		quickSort_upCount1000.showAufwand();
		quickSort_upCount5000.quickSort3();
		quickSort_upCount5000.showAufwand();

		//Test avarage Case
		quickSort_avg10.quickSort3();
		System.out.print("testQuickSort3 avg Case:   ");
		quickSort_avg10.showDaten();
		quickSort_avg10.showAufwand();
		System.out.print("Average Array: ");
		for(int i = 1; i<10; i++){
			assertTrue(quickSort_avg10.getArray()[i-1].hashCode() <= quickSort_avg10.getArray()[i].hashCode());
			System.out.print(quickSort_avg10.getArray()[i]);
		}
		System.out.println();
		quickSort_avg50.quickSort3();
		quickSort_avg50.showAufwand();
		quickSort_avg100.quickSort3();
		quickSort_avg100.showAufwand();
		quickSort_avg500.quickSort3();
		quickSort_avg500.showAufwand();
		quickSort_avg1000.quickSort3();
		quickSort_avg1000.showAufwand();
		quickSort_avg5000.quickSort3();
		quickSort_avg5000.showAufwand();
		
	}

}
