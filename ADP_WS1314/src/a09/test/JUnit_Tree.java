/**
 * 
 */
package a09.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import a08.*;

/**
 * @author cordgm
 *
 */
public class JUnit_Tree {
	ITree<Element> treeLinked;
	ITree<Element> treeArray;
	Node<Element> node;
	Node<Element> wurzelNode;
	final static int wurzel = 10;
	final static int anzahlNodes = 20;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		wurzelNode = new Node<Element>(new Element(wurzel), wurzel, null, null, null);
	}

	@Test
	public void testTreeLinked() {
		treeLinked = new TreeLinked<Element>(wurzelNode);
		treeLinked.insert(wurzelNode);
		for(int i = 1; i<=anzahlNodes; i++){
			node = new Node<Element>(new Element(i), i, null, null, null);
			assertTrue(treeLinked.insert(node));
			assertTrue(treeLinked.exists(i));
		}

    	treeLinked.inorder(wurzelNode);
    	System.out.println();
    	treeLinked.preorder(wurzelNode);
    	System.out.println();
    	treeLinked.postorder(wurzelNode);
    	System.out.println();
    	
		//Fehlerfaelle
		assertFalse(treeLinked.insert(null));
		assertFalse(treeLinked.exists(999999));
	}

	@Test
	public void testTreeArray() {
		treeArray = new TreeArray<Element>(anzahlNodes);
		treeArray.insert(wurzelNode);
		
		for(int i = 1; i<=anzahlNodes; i++) {
			node = new Node<Element>(new Element(i), i, null, null, null);
			assertTrue(treeArray.insert(node));
			assertTrue(treeArray.exists(i));
		}

		treeArray.inorder(wurzelNode);
    	System.out.println();
    	treeArray.preorder(wurzelNode);
    	System.out.println();
    	treeArray.postorder(wurzelNode);
    	System.out.println();
    	
		//Fehlerfaelle
		assertFalse(treeArray.insert(null));
		assertFalse(treeArray.exists(999999));
	}

}
