/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 * 
 * Das Interface um die oeffentlichen Operationen unseres Hash's zu beschreiben.
 */

package a11;

public interface IMyHash<T>{
    
    /*
     * Fuegt das Element "info" mit dem Schluessel "key" ein.
     */
    public void add(int key, T info);
    
    /*
     * Liefert das Element zurueck, dass mit dem Schluessel "key" assoziiert wurde.
     */
    public T get(int key);
    
    /*
     * Entfernt das Element und den Schluessel.
     */
    public void remove(int key);
    
    /*
     * Prueft ob ein bestimmter Schluessel enthalten ist.
     */
    public boolean containsKey(int key);
    
    /*
     * Prueft ob die Hash leer ist.
     */
    public boolean isEmpty();
    
    /*
     * Gibt die Anzahl der gespeicherten Elemente zurueck.
     */
    public int size();
    
    /*
     * Entfernt alle gespeicherten Elemente und Schluessel.
     */
    public void clear();
}
