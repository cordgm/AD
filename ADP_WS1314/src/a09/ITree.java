/**
 * 
 */
package a09;

/**
 * @author Colonel_Sheppard
 * Das Interface soll folgenedes erm�glichen. 
 * Knoten hinzuf�gen. 
 * Ausgabe von Haupt- Nebenreihenfolge und symmetrisch. 
 * Ausgabe der S�hne und dessen Vater. 
 * @param <T>
 *
 */
public interface ITree<T> {
    

    /**
     * F�gt einen Knoten ein (Einbettung Array or. Linked).
     * Gibt true oder false zur�ck bei erfolreicher oder nicht erfolgreicher Eeinbettung.
     * @param node
     * @return boolean. 
     */
    boolean insert(Node<T> node);
    
    /**
     * Ausgabe der Knoten in Symmetrischer Folge. 
     * @param vater
     */
    void inorder( Node<T> vater);
    
    /**
     * Ausgabe der Knoten in der Hauptreihenfolge. 
     * @param vater
     */
    void preorder( Node<T> vater);
    
    /**
     * Ausgabe der Knoten in der Hauptreihenfolge. 
     * @param vater
     */
    void postorder( Node<T> vater);
    
//    /**
//     * @param n
//     * @return
//     */
//    public Node<T> getLinkerSohn( Node<T> vater);
//
//    /**
//     * @param n
//     * @return
//     */
//    public Node<T> getRechterSohn( Node<T> vater);
//
//    /**
//     * @param n
//     * @return
//     */
//    public Node<T> getVater( Node<T> vater);

    /**
     * �berpr�ft ob ein Knoten schon vorhanden ist bzw. existiert.
     * @param i
     * @return boolean. 
     */
	public boolean exists(int i);

}
