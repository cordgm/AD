/**
 * 
 */
package a10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cordgm
 * @param <T>
 *
 */
public class DykstraListe<T> implements IGraph<T> {

    //Attribute
    private GraphAListe<T> graph;
    private Wegpunkt<T> start;
    private List<Wegpunkt<T>> alleWegpunkte;
    
    
	public DykstraListe(Node<T> node) {
        this.graph = new GraphAListe<T>(node);
        this.start = new Wegpunkt<T>(node, this.start, 0, true);
        this.start.setPrev(this.start);
        this.alleWegpunkte = new ArrayList<Wegpunkt<T>>();
        this.alleWegpunkte.add(start);
	}

	@Override
	public void addKnoten(Node<T> node) {
        this.graph.addKnoten(node);
        this.alleWegpunkte.add(new Wegpunkt<T>(node, null, 1000000000));
	}

	@Override
	public void removeKnoten(Node<T> node) {
        this.graph.removeKnoten(node);
	}

	@Override
	public List<Node<T>> getNachbarknoten(Node<T> node) {
        return this.graph.getNachbarknoten(node);
	}

	@Override
	public List<Node<T>> getInNachbarknoten(Node<T> node) {
        return this.graph.getInNachbarknoten(node);
	}

	@Override
	public List<Node<T>> getOutNachbarknoten(Node<T> node) {
        return this.getOutNachbarknoten(node);
	}

	@Override
	public List<Node<T>> getKnoten() {
        return this.graph.getKnoten();
	}

    //Innere Klassen
    @SuppressWarnings("hiding")
    protected class Wegpunkt<T> {
        
        //Attribute
        private Node<T> nodes;
        private Wegpunkt<T> prev;
        private int kosten;
        private boolean isMarkiert;
        
        
        //Konstruktoren
        public Wegpunkt(Node<T> k, Wegpunkt<T> w, int c){
                this(k, w, c, false);
        }
        
        public Wegpunkt(Node<T> k, Wegpunkt<T> w, int c, boolean isMarkiert){
                this.nodes = k;
                this.prev = w;
                this.kosten = c;
                this.isMarkiert = isMarkiert;
        }
        
        
        //Methoden
        @SuppressWarnings("unchecked")
        @Override
        public boolean equals(Object o){
                return o instanceof Wegpunkt && this.nodes.equals(((Wegpunkt<T>)o).getKnoten());
        }
        
        @Override
        public String toString(){
                return "Knoten: " + this.nodes + "\tPrev: " + ((this.prev != null) ? this.prev.getKnoten() : "null") +
                       "\tKosten: " + this.kosten + "\tIst Markiert: " + this.isMarkiert;
        }


        //Getter-Setter
        public Node<T> getKnoten() {
                return nodes;
        }
        public void setKnoten(Node<T> knoten) {
                this.nodes = knoten;
        }

        public Wegpunkt<T> getPrev() {
                return prev;
        }
        public void setPrev(Wegpunkt<T> prev) {
                this.prev = prev;
        }

        public int getKosten() {
                return kosten;
        }
        public void setKosten(int kosten) {
                this.kosten = kosten;
        }

        public boolean isMarkiert() {
                return isMarkiert;
        }
        public void setMarkiert(boolean isMarkiert) {
                this.isMarkiert = isMarkiert;
        }
    }
}
