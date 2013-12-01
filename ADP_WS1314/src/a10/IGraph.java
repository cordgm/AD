package a10;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Das Interface zur Beschreibung der öffentlichen Operationen eines Graphen.
 */

import java.util.List;

public interface IGraph<T> {

        /**
         * Knoten einfuegen.
         */
        public void addKnoten(Node<T> k);
        
        /**
         * Knoten entfernen.
         */
        public void removeKnoten(Node<T> k);
        
        /**
         * Alle ein- und ausgehenden Nachbarknoten.
         */
        public List<Node<T>> getNachbarknoten(Node<T> k);
        
        /**
         * Alle eingehenden Nachbarknoten.
         */
        public List<Node<T>> getInNachbarknoten(Node<T> k);
        
        /**
         * Alle ausgehenden Nachbarnknoten.
         */
        public List<Node<T>> getOutNachbarknoten(Node<T> k);
        
        /**
         * Liefert eine Liste ueber alle Knoten im Graphen zurueck.
         */
        public List<Node<T>> getKnoten();
}
