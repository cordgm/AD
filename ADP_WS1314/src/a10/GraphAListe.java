package a10;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die Graphenklasse als Adjazenzliste.
 */

import java.util.ArrayList;
import java.util.List;

public class GraphAListe<T> implements IGraph<T>{

    //Attribute
    private Node<T> start;
    private List<Node<T>> nodes;
    
    //Konstruktor
    public GraphAListe(Node<T> start){
        this.start = start;
        this.nodes = new ArrayList<Node<T>>();
        this.nodes.add(start);
    }
    
    //Methoden
    @Override
    public void addKnoten(Node<T> k) {
        this.nodes.add(k);
    }
    
    /**
     * UEberladene addKnoten Function. 
     * @param k
     * @param ursprung
     * @param g
     */
    public void addKnoten(Node<T> k, Node<T> ursprung, int g) {
        this.nodes.add(k);
        addEinseitigeVerbindung(ursprung, k, g);
    }

    @Override
    public void removeKnoten(Node<T> k) {
            
        //Eingehende Verbindungen loeschen
        for(int i = 0; i < k.getIn().size(); i++){
            Verbindung<T> tmp = k.getIn().get(i);
            tmp.getStart().getOut().remove(tmp);
        }
        
        //Ausgehende Verbindungen loeschen
        for(int i = 0; i < k.getOut().size(); i++){
            Verbindung<T> tmp = k.getOut().get(i);
            tmp.getZiel().getIn().remove(tmp);
        }
        
        //Knoten aus der Liste loeschen
        this.nodes.remove(k);
    }

    @Override
    public List<Node<T>> getNachbarknoten(Node<T> k) {
        List<Node<T>> tmp = new ArrayList<Node<T>>();
        
        //Knoten die auf k zeigen
        int length = k.getIn().size();
        for(int i = 0; i < length; i++){
            tmp.add(k.getIn().get(i).getStart());
        }
        
        //Knoten auf die k zeigt
        length = k.getOut().size();
        for(int i = 0; i < length; i++){
            if(!(tmp.contains(k.getOut().get(i).getZiel()))){
                tmp.add(k.getOut().get(i).getZiel());
            }
        }
        
        return tmp;
    }
    
    @Override
    public List<Node<T>> getInNachbarknoten(Node<T> k) {
        List<Node<T>> tmp = new ArrayList<Node<T>>();
        
        for(Verbindung<T> v : k.getIn()){
            tmp.add(v.getStart());
        }
        
        return tmp;
    }
    
    @Override
    public List<Node<T>> getOutNachbarknoten(Node<T> k) {
        List<Node<T>> tmp = new ArrayList<Node<T>>();
        
        for(Verbindung<T> v : k.getOut()){
            tmp.add(v.getZiel());
        }
        
        return tmp;
    }
    
    public void addEinseitigeVerbindung(Node<T> start, Node<T> ziel, int kosten){
        Verbindung<T> tmp = new Verbindung<T>(start, ziel, kosten);
        start.getOut().add(tmp);
        ziel.getIn().add(tmp);
    }
    
    public void addBeidseitigeVerbindung(Node<T> start, Node<T> ziel, int kosten){
        Verbindung<T> tmp1 = new Verbindung<T>(start, ziel, kosten);
        start.getOut().add(tmp1);
        ziel.getIn().add(tmp1);
        Verbindung<T> tmp2 = new Verbindung<T>(ziel, start, kosten);
        ziel.getOut().add(tmp2);
        start.getIn().add(tmp2);
    }
    
    public void showAll(){
        for(int i = 0; i < nodes.size(); i++){
            System.out.print("Info: " + nodes.get(i).getInfo());
            
            System.out.print("\t\tIn: ");
            for(int j = 0; j < nodes.get(i).getIn().size(); j++){
                System.out.print(" " + nodes.get(i).getIn().get(j).getStart().getInfo());
            }
            
            System.out.print("\t\tOut: ");
            for(int j = 0; j < nodes.get(i).getOut().size(); j++){
                System.out.print(" " + nodes.get(i).getOut().get(j).getZiel().getInfo());
            }
            
            System.out.println();
        }
    }


    //Getter-Setter
    public Node<T> getStart() {
        return start;
    }
    public void setStart(Node<T> start) {
        this.start = start;
    }

    public List<Node<T>> getKnoten() {
        return nodes;
    }
    public void setKnoten(List<Node<T>> knoten) {
        this.nodes = knoten;
    }
}
