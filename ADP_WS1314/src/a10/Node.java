package a10;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die Knotenklasse für unsere Graphen.
 */

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
        
    //Attribute
    private List<Verbindung<T>> in;
    private List<Verbindung<T>> out;
    private T daten;
    
    
    //Konstruktor
    public Node(T info){
        this.in = new ArrayList<Verbindung<T>>();
        this.out = new ArrayList<Verbindung<T>>();
        this.daten = info;
    }


    //Methoden
    @Override
    public boolean equals(Object o){
        return o instanceof Node<?> && this.daten.equals(((Node<?>)o).getInfo());
    }
    
    @Override
    public String toString(){
        return "Info: " + this.daten;
    }
    
    /**
     * for-ech-Schleife, suchen eines Knoten k.
     * Beide Listen-Verbindungen in, sowie out. 
     * @param k
     * @return
     */
    public Verbindung<T> getVerbindungMit(Node<T> k){
        for(Verbindung<T> v : in){
            if(v.getStart() == k || v.getZiel() == k){
                return v;
            }
        }
        for(Verbindung<T> v : out){
            if(v.getStart() == k || v.getZiel() == k){
                return v;
            }
        }
        
        return null;
    }
    
    /**
     * UEberpruefen ob der uebergebene ein Nachbar ist vom eigenen.
     * Rueckgabe ist ein Boolean, true = Ja ; false = Nein. 
     * @param k
     * @return 
     */
    public boolean istNachbarVon(Node<T> k){
        boolean tmp = false;
        for(Verbindung<T> v : in){
            if(v.getStart().equals(k)){
                tmp = true;
                break;
            }
        }
        if(!tmp){
            for(Verbindung<T> v : out){
                if(v.getZiel().equals(k)){
                    tmp = true;
                    break;
                }
            }
        }
        return tmp;
    }
    
    
    //Getter-Setter
    public List<Verbindung<T>> getIn() {
        return in;
    }
    public void setIn(List<Verbindung<T>> in) {
        this.in = in;
    }
    
    public List<Verbindung<T>> getOut() {
        return out;
    }
    public void setOut(List<Verbindung<T>> out) {
        this.out = out;
    }
    
    public T getInfo() {
        return daten;
    }
    public void setInfo(T info) {
        this.daten = info;
    }
}
