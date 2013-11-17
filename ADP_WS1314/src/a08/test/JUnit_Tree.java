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
		ITree<Element> bsBaumA = new TreeArray<Element>();
//		ITree<Element> bsBaumV = new Binaerer_Suchbaum_Verlinkung<Element>();
		for(int i = 0; i < 3; i++){
			Node<Element> node = new Node<Element>(new Element(i), i, null, null, null);
			
		}
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
