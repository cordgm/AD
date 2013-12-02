package a10;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die Graphenklasse als Adjazenzmatrix.
 */

import java.util.ArrayList;
import java.util.List;

public class GraphAMatrix<T> implements IGraph<T>{


        //Attribute
        private int[][] matrix;
        private List< Node<T> > knoten;
        
        
        //Konstruktor
        public GraphAMatrix(Node<T> k){
                this.matrix = new int[1][1];
                this.knoten = new ArrayList<Node<T>>();
                this.knoten.add(k);
        }
        
        
        //Methoden
        @Override
        public void addKnoten(Node<T> k) {
                resize();
                this.knoten.add(k);
        }
        
        /**
         * Manuelles vergroessern des Arrays um [1][1]. 
         */
        private void resize(){
                int[][] tmp = new int[this.matrix.length+1][this.matrix.length+1];
                for(int i = 0; i < this.matrix.length; i++){
                        for(int j = 0; j < this.matrix[i].length; j++){
                                tmp[i][j] = this.matrix[i][j];
                        }
                }
                this.matrix = tmp;
        }
        
        @Override
        public void removeKnoten(Node<T> k) {
                int index = getIndex(k);
                this.knoten.remove(k);
                for(int i = 0; i < this.matrix[index].length; i++){
                        this.matrix[index][i] = 0;
                }
                for(int i = 0; i < this.matrix[index].length; i++){
                        this.matrix[i][index] = 0;
                }
        }
        
        /**
         * @param start
         * @param ziel
         * @param gewicht
         */
        public void addEinseitigeVerbindung(Node<T> start, Node<T> ziel, int gewicht){
                if(start == ziel){
                        System.err.println("Ungueltige Kante!");
                }
                int s = getIndex(start);
                int z = getIndex(ziel);
                
                this.matrix[s][z] = gewicht;
        }
        
        /**
         * @param start
         * @param ziel
         * @param gewicht
         */
        public void addBeidseitigeVerbindung(Node<T> start, Node<T> ziel, int gewicht){
                addEinseitigeVerbindung(start, ziel, gewicht);
                addEinseitigeVerbindung(ziel, start, gewicht);
        }
        
        @Override
        public List<Node<T>> getNachbarknoten(Node<T> k) {
                List<Node<T>> nachbarn = getInNachbarknoten(k);
                nachbarn.addAll(getOutNachbarknoten(k));
                return nachbarn;
        }
        
        @Override
        public List<Node<T>> getInNachbarknoten(Node<T> k) {
                List<Node<T>> nachbarn = new ArrayList<Node<T>>();
                int index = getIndex(k);
                for(int i = 0; i < this.matrix[index].length; i++){
                        if(this.matrix[i][index] > 0){
                                nachbarn.add(this.knoten.get(i));
                        }
                }
                return nachbarn;
        }
        
        @Override
        public List<Node<T>> getOutNachbarknoten(Node<T> k) {
                List<Node<T>> nachbarn = new ArrayList<Node<T>>();
                int index = getIndex(k);
                for(int i = 0; i < this.matrix[index].length; i++){
                        if(this.matrix[index][i] > 0){
                                nachbarn.add(this.knoten.get(i));
                        }
                }
                return nachbarn;
        }

        public boolean istNachbarVon(Node<T> k, Node<T> zielKnoten){
                return getNachbarknoten(k).contains(zielKnoten);
        }
        
        public int getKosten(Node<T> startKnoten, Node<T> zielKnoten){
                return this.matrix[getIndex(zielKnoten)][getIndex(startKnoten)];
        }
        
        @Override
        public List<Node<T>> getKnoten() {
                return this.knoten;
        }
        
        /**
         * Gint den Index des ersten Vorkommenes Element in der Liste zurück, sonst -1. 
         * @param k
         * @return
         */
        private int getIndex(Node<T> k){
                return this.knoten.indexOf(k);
        }
        
        public void showAll(){
                System.out.print("\t");
                for(Node<T> k : this.knoten){
                        System.out.print(k.getInfo() + "\t");
                }
                System.out.println("\n\n");
                for(int i = 0; i < this.matrix.length; i++){
                        System.out.print(this.knoten.get(i).getInfo() + "\t");
                        for(int j = 0; j < this.matrix[i].length; j++){
                                System.out.print(this.matrix[i][j] + "\t");
                        }
                        System.out.println("\n");
                }
        }


        //Getter-Setter
        public int getAnzKnoten() {
                return this.knoten.size();
        }


}
