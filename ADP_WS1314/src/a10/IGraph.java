/**
 * 
 */
package a10;

import java.util.List;

/**
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public interface IGraph<T> {
	/**
     * Knoten einfuegen.
     */
    public void addKnoten(Node<T> node);
    
    /**
     * Knoten entfernen.
     */
    public void removeKnoten(Node<T> node);
    
    /**
     * Alle ein- und ausgehenden Nachbarknoten.
     */
    public List<Node<T>> getNachbarknoten(Node<T> node);
    
    /**
     * Alle eingehenden Nachbarknoten.
     */
    public List<Node<T>> getInNachbarknoten(Node<T> node);
    
    /**
     * Alle ausgehenden Nachbarnknoten.
     */
    public List<Node<T>> getOutNachbarknoten(Node<T> node);
    
    /**
     * Liefert eine Liste über alle Knoten im Graphen zurück.
     */
    public List<Node<T>> getKnoten();
}
