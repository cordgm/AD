package a08;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 * @param <T>
 *
 */
public interface IBinaerer_Suchbaum<T> {
	
	/**
	 * Knoten einfuegen
	 * @param k
	 * @return
	 */
	Node<T> insertNode(int k);
	
	/**
	 * Knoten in Haupt- und Nebenreihenfolge und symmetrisch auszugeben
	 */
	void baumAusgeben();
}
