/**
 * 
 */
package a08.test;

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
	Node<Element> node;
	Node<Element> wurzelNode;
	final static int wurzel = 25;
	final static int anzahlNodes = 50;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		wurzelNode = new Node<Element>(new Element(wurzel), wurzel, null, null, null);
		treeLinked = new TreeLinked<Element>(wurzelNode);
		treeLinked.insert(wurzelNode);
	}

	@Test
	public void testTreeLinked() {
		for(int i = 0; i<anzahlNodes; i++){
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

}
