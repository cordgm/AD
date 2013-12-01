package a10;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Der Dykstraalgorithmus mit Adjazenzliste.
 */

import java.util.ArrayList;
import java.util.List;

public class DykstraListe<T> implements IGraph<T>{

        //Attribute
        private GraphAListe<T> graph;
        private Wegpunkt<T> start;
        private List<Wegpunkt<T>> alleWegpunkte;
        
        //Konstruktoren
        public DykstraListe(Node<T> k){
                this.graph = new GraphAListe<T>(k);
                this.start = new Wegpunkt<T>(k, this.start, 0, true);
                this.start.setPrev(this.start);
                this.alleWegpunkte = new ArrayList<Wegpunkt<T>>();
                this.alleWegpunkte.add(start);
        }
        
        
        //Methoden
        @Override
        public void removeKnoten(Node<T> k) {
                this.graph.removeKnoten(k);
        }
        
        @Override
        public List<Node<T>> getNachbarknoten(Node<T> k) {
                return this.graph.getNachbarknoten(k);
        }
        
        @Override
        public List<Node<T>> getInNachbarknoten(Node<T> k) {
                return this.graph.getInNachbarknoten(k);
        }
        
        @Override
        public List<Node<T>> getOutNachbarknoten(Node<T> k) {
                return this.getOutNachbarknoten(k);
        }
        
        @Override
        public List<Node<T>> getKnoten() {
                return this.graph.getKnoten();
        }
        
        @Override
        public void addKnoten(Node<T> k) {
                this.graph.addKnoten(k);
                this.alleWegpunkte.add(new Wegpunkt<T>(k, null, 1000000000));
        }
        
        public void addEinseitigeVerbindung(Node<T> start, Node<T> ziel, int kosten){
                this.graph.addEinseitigeVerbindung(start, ziel, kosten);
        }
        
        public void addBeidseitigeVerbindung(Node<T> start, Node<T> ziel, int kosten){
                this.graph.addBeidseitigeVerbindung(start, ziel, kosten);
        }
        
        public void showAll(){
                this.graph.showAll();
        }
        
        public void berechneWeg(){
                List<Wegpunkt<T>> rand = new ArrayList<Wegpunkt<T>>();
                List<Wegpunkt<T>> fertig = new ArrayList<Wegpunkt<T>>();
                int aktuellerIndex = 0;
                fertig.add(this.start);
                
                //Berechnung
                do{
                        Wegpunkt<T> kandidat = null;
                        
                        //Nachbarn hinzufuegen
                        addNachbarnZuRand(rand, fertig.get(aktuellerIndex).getKnoten());

                        //Kosten aktualisieren
                        for(Wegpunkt<T> w : rand){
                                kostenNeuberechnen(w, fertig.get(aktuellerIndex));
                        }
                        
                        //Guenstigsten Nachbarn ermitteln
                        kandidat = schnellsterNachbar(rand);
                        
                        //Guenstigsten Nachbarn markieren
                        kandidat.setMarkiert(true);
                        
                        //Guenstigsten Nachbarn aus Rand loeschen und in Liste "fertig" aufnehmen
                        fertig.add(kandidat);
                        rand.remove(kandidat);
                        
                        aktuellerIndex++;
                }while(!(rand.isEmpty()));
                
                //Ausgabe
                for(Wegpunkt<T> w : fertig){
                        System.out.println(w);
                }
                
        }
        
        private Wegpunkt<T> schnellsterNachbar(List<Wegpunkt<T>> l){
                Wegpunkt<T> tmp = l.get(0);
                for(int i = 1; i < l.size(); i++){
                        if(l.get(i).getKosten() < tmp.getKosten()){
                                tmp = l.get(i);
                        }
                }
                return tmp;
        }

        private void addNachbarnZuRand(List<Wegpunkt<T>> zielListe, Node<T> knoten) {
                List<Node<T>> nachbarn = getNachbarknoten(knoten);
                for(Node<T> k : nachbarn){
                        Wegpunkt<T> tmp = getWegpunkt(this.alleWegpunkte, k);
                        if(!(containsKnoten(zielListe, k) || tmp.isMarkiert)){
                                zielListe.add(tmp);
                        }
                }
        }
        
        private boolean containsKnoten(List<Wegpunkt<T>> l, Node<T> k){
                boolean enthalten = false;
                for(Wegpunkt<T> w : l){
                        if(w.getKnoten() == k){
                                enthalten = true;
                        }
                }
                return enthalten;
        }
        
        private Wegpunkt<T> getWegpunkt(List<Wegpunkt<T>> l, Node<T> k){
                Wegpunkt<T> tmp = null;
                for(int i = 0; i < l.size(); i++){
                        if(l.get(i).getKnoten().equals(k)){
                                tmp = l.get(i);
                                break;
                        }
                }
                return tmp;
        }
        
        private void kostenNeuberechnen(Wegpunkt<T> wp, Wegpunkt<T> neuerWeg){
                if(wp.getKnoten().istNachbarVon(neuerWeg.getKnoten())){
                        int neueKosten = neuerWeg.getKosten() + wp.getKnoten().getVerbindungMit(neuerWeg.getKnoten()).getKosten();
                        int alteKosten = wp.getKosten();
                        if(neueKosten < alteKosten){
                                wp.setPrev(neuerWeg);
                                wp.setKosten(neueKosten);
                        }
                }
        }
        

        
        //Innere Klassen
        @SuppressWarnings("hiding")
        protected class Wegpunkt<T> {
                
                //Attribute
                private Node<T> knoten;
                private Wegpunkt<T> prev;
                private int kosten;
                private boolean isMarkiert;
                
                
                //Konstruktoren
                public Wegpunkt(Node<T> k, Wegpunkt<T> w, int c){
                        this(k, w, c, false);
                }
                
                public Wegpunkt(Node<T> k, Wegpunkt<T> w, int c, boolean isMarkiert){
                        this.knoten = k;
                        this.prev = w;
                        this.kosten = c;
                        this.isMarkiert = isMarkiert;
                }
                
                
                //Methoden
                @SuppressWarnings("unchecked")
                @Override
                public boolean equals(Object o){
                        return o instanceof Wegpunkt && this.knoten.equals(((Wegpunkt<T>)o).getKnoten());
                }
                
                @Override
                public String toString(){
                        return "Knoten: " + this.knoten + "\tPrev: " + ((this.prev != null) ? this.prev.getKnoten() : "null") +
                               "\tKosten: " + this.kosten + "\tIst Markiert: " + this.isMarkiert;
                }


                //Getter-Setter
                public Node<T> getKnoten() {
                        return knoten;
                }
                public void setKnoten(Node<T> knoten) {
                        this.knoten = knoten;
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
