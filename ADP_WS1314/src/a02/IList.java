package a02;

/**
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public interface IList<T> {
    
    /**
     * Mit antizipative Indizierung, also "Das Element a(p) wird indiziert durch den next-Zeiger des Elements a(p-1)"
     * @param pos Position in einer Liste
     * @param data Elemente einer Liste vom Grundtyp G
     * @return boolean
     */
    public boolean insert(Node<T> pos, T data);
    
    
    /**
     * Entfernen eines Elements p € pos aus der Liste L.
     * @param node
     * return boolean
     */
    public boolean delete(Node<T> node);
    
    
    /**
     * Suchen der Position p € pos eines Elements x € G in Liste L.
     * @param data
     * @return node
     */
    public Node<T> find(T data);
    
    
    /**
     * Zugriff auf Element an der Position p € pos in Liste L.
     * @param node
     * @return T
     */
    public T retrieve(Node<T> node);
    
    
    /**
     * Konkatenation (Zusammenfuegen) zweier Listen L1 und L2.
     * @param list
     * @return iList
     */
    public IList<T> concat(List<T> list);
    
    /**
     * Gibt die Groesse der Liste zurück.
     * @return size
     */
    public int getSize();

}
