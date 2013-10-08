/*
 *####################################
 * ADP_WS1314_v0
 *
 * iQueue.java
 *
 *  Created on: 03.10.2013
 *      Author: Sheppard
 * 03.10.2013
 * 
 *####################################
 */
package a02;

/**
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public interface IQueue<T> {

    
    /**
     * Liefert das Element head zurück ohne es aus der Queue zu löschen.
     * Komplexitaet: o(1) unabhaengig der Anzahl der Elemente.
     * @return data
     */
    public T front();
    
    /**
     * Fügt das übergebene Element hinten in die Queue ein. 
     * Gibt true oder false zurück, je nachdem ob es Erfolgreich war. 
     * Komplexitaet: o(1) unabhaengig der Anzahl der Elemente.
     * @return boolean
     */
    public boolean enqueu(T data);
    
    /**
     * Löscht das Element Head.
     * Gibt true oder false zurück, ob es erfolgreich war oder nicht. 
     * Komplexitaet: o(1) unabhaengig der Anzahl der Elemente.
     * @return boolean
     */
    public boolean dequeue();
    
    /**
     * Überprüft ob die Queue leer ist oder nicht.
     * @return boolean
     */
    public boolean  isEmpty();
    
}
