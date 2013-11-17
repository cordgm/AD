/**
 * 
 */
package a08;

/**
 * @author Colonel_Sheppard
 * Das Interface soll folgenedes ermöglichen. 
 * Knoten hinzufügen. 
 * Ausgabe von Haupt- Nebenreihenfolge und symmetrisch. 
 * Ausgabe der Söhne und dessen Vater. 
 * @param <T>
 *
 */
public interface ITree<T> {
    
    /**
     * @param key
     */
    void insert(T daten, int key);
    
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
    
    /**
     * @param n
     * @return
     */
    public int getLinkerSohn(int n);

    /**
     * @param n
     * @return
     */
    public int getRechterSohn(int n);

    /**
     * @param n
     * @return
     */
    public Node<T> getVater(int n);

}
