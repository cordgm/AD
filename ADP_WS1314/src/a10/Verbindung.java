package a10;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die Verbindungsklasse um die Kanten zwischen den Knoten darzustellen.
 */

public class Verbindung<T> {
        
    //Attribute
    private Node<T> start;
    private Node<T> ziel;
    private int kosten;
    
    
    //Konstruktor
    public Verbindung(Node<T> start, Node<T> ziel, int kosten){
        this.start = start;
        this.ziel = ziel;
        this.kosten = kosten;
    }

    
    //Methoden
    public Node<T> getStart() {
        return start;
    }
    public void setStart(Node<T> start) {
        this.start = start;
    }
    
    public Node<T> getZiel() {
        return ziel;
    }
    public void setZiel(Node<T> ziel) {
        this.ziel = ziel;
    }
    
    public int getKosten() {
        return kosten;
    }
    public void setKosten(int kosten) {
        this.kosten = kosten;
    }
}
