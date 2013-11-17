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

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ITree<Element> treeArray = new TreeArray<Element>();
		ITree<Element> treeLinked = new TreeLinked<Element>();
		Node<Element> nodePapa = new Node<Element>(new Element(0), 0, null, null, null);
		Node<Element> nodeSohnLinks = new Node<Element>(new Element(0), 0, null, null, null);
		Node<Element> nodeSohnRechts = new Node<Element>(new Element(0), 0, null, null, null);
		nodePapa.setLinks(nodeSohnLinks);
		nodePapa.setRechts(nodeSohnRechts);
		nodeSohnLinks.setVater(nodePapa);
		nodeSohnRechts.setVater(nodePapa);
//		for(int i = 0; i < 3; i++){
//			Node<Element> node = new Node<Element>(new Element(i), i, null, null, null);
//			
//		}
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
