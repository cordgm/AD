package a10_grund;

/**
 * 
 * Team: Molière
 * Mitglieder: Kaoutare Bedda und Florian Schlosser
 * Datum: 21.06.2011
 *
 * Das Interface zur Beschreibung der öffentlichen Operationen eines Graphen.
 */

import java.util.List;

public interface IGraph<T> {

        /**
         * Hinzufügen eines Knotens.
         */
        public void addKnoten(Knoten<T> k);
        
        /**
         * Entfernen eines Knotens.
         */
        public void removeKnoten(Knoten<T> k);
        
        /**
         * Alle ein- und ausgehenden Nachbarknoten.
         */
        public List<Knoten<T>> getNachbarknoten(Knoten<T> k);
        
        /**
         * Alle eingehenden Nachbarknoten.
         */
        public List<Knoten<T>> getInNachbarknoten(Knoten<T> k);
        
        /**
         * Alle ausgehenden Nachbarnknoten.
         */
        public List<Knoten<T>> getOutNachbarknoten(Knoten<T> k);
        
        /**
         * Liefert eine Liste über alle Knoten im Graphen zurück.
         */
        public List<Knoten<T>> getKnoten();
}
