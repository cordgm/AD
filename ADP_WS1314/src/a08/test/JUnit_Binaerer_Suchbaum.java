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
public class JUnit_Binaerer_Suchbaum {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		IBinaerer_Suchbaum<Element> bsBaumA = new Binaerer_Suchbaum_Array<Element>();
		IBinaerer_Suchbaum<Element> bsBaumV = new Binaerer_Suchbaum_Verlinkung<Element>();
		for(int i = 0; i < 3; i++){
			Node<Element> node = new Node<Element>(new Element(i), i, null, null, null);
			
		}
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
