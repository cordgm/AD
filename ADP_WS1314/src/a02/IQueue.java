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
     * Liefert das Element head zur�ck ohne es aus der Queue zu l�schen.
     * Komplexitaet: o(1) unabhaengig der Anzahl der Elemente.
     * @return data
     */
    public T front();
    
    /**
     * F�gt das �bergebene Element hinten in die Queue ein. 
     * Gibt true oder false zur�ck, je nachdem ob es Erfolgreich war. 
     * Komplexitaet: o(1) unabhaengig der Anzahl der Elemente.
     * @return boolean
     */
    public boolean enqueu(T data);
    
    /**
     * L�scht das Element Head.
     * Gibt true oder false zur�ck, ob es erfolgreich war oder nicht. 
     * Komplexitaet: o(1) unabhaengig der Anzahl der Elemente.
     * @return boolean
     */
    public boolean dequeue();
    
    /**
     * �berpr�ft ob die Queue leer ist oder nicht.
     * @return boolean
     */
    public boolean  isEmpty();
    
}
