/**
 * 
 */
package a01.test;

import static org.junit.Assert.*;

import org.junit.*;

import a01.List;
import a01.Node;

/**
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class Junit_List {
	
	List<Integer> list1;
	List<Integer> list2;
	Node<Integer> nodeZwei;
	
	@Before
	public void setUp() throws Exception {
		list1 = new List<Integer>();
		list2 = new List<Integer>();
		nodeZwei = new Node<Integer>(null, 2);
	}


	@Test
	public void testInsert() {
		assertTrue(list1.insert(list1.getHead(), 1));
		assertTrue(list1.insert(list1.find(1), 2));
		assertTrue(list1.insert(list1.find(2), 3));
		
		//Position ungueltig
		assertFalse(list1.insert(null, 6));
	}
	
	@Test
	public void testDelete() {
		insertTest();
		assertTrue(list1.delete(list1.getHead())); //entferne die 1
		assertTrue(list1.delete(list1.getHead())); //entferne die 2
		assertTrue(list1.delete(list1.getHead())); //entferne die 3
		
		//Entferne head oder tail
		assertFalse(list1.delete(list1.getHead())); //entferne die tail
		assertFalse(list1.delete(list1.getTail())); //entferne die head
	}
	
	@Test
	public void testFind() {
		//gesuchtes Element wird nicht gefunden (Rueckgabe: null) : leere Liste
		assertEquals(null, list1.find(2));
		
		//finde Element
	    insertTest();
		assertEquals(nodeZwei.getData(), list1.find(2).getData());
		
		//gesuchtes Element wird nicht gefunden (Rueckgabe: null) : volle Liste
		assertEquals(null, list1.find(6));
	}
	
	@Test
    public void testRetrieve() { //Rückgabe der Daten der ersten Position
            
            assertEquals(list1.getHead().getNext().getData(), list1.retrieve(list1.getHead()));
    }
	
	@Test
    public void testConcat() { //Hinzufügen einer 2ten Liste und die addierten größen vergleichen
	    
            List<Integer> list2 = new List<Integer>();
            list2.insert(list2.getHead(),22);
            list2.insert(list2.find(22),23);
            list2.insert(list2.find(23),24);
            assertEquals((list1.getSize() + list2.getSize()), list1.concat(list2).getSize());
    }
	
	
	
	
	
	
	
	//--------------Eigene Methoden------------------
	public void insertTest() {
        list1.insert(list1.getHead(), 1);
        list1.insert(list1.find(1), 2);
        list1.insert(list1.find(2), 3);

    }
	
	
}
