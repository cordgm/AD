package a10;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die Graphenklasse als Adjazenzmatrix.
 */

import java.util.ArrayList;
import java.util.List;

public class GraphM<T> implements IGraph<T>{


        //Attribute
        private int[][] matrix;
        private List<Knoten<T>> knoten;
        
        
        //Konstruktor
        public GraphM(Knoten<T> k){
                this.matrix = new int[1][1];
                this.knoten = new ArrayList<Knoten<T>>();
                this.knoten.add(k);
        }
        
        
        //Methoden
        @Override
        public void addKnoten(Knoten<T> k) {
                resize();
                this.knoten.add(k);
        }
        
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
        public void removeKnoten(Knoten<T> k) {
                int index = getIndex(k);
                this.knoten.remove(k);
                for(int i = 0; i < this.matrix[index].length; i++){
                        this.matrix[index][i] = 0;
                }
                for(int i = 0; i < this.matrix[index].length; i++){
                        this.matrix[i][index] = 0;
                }
        }
        
        public void addEinseitigeVerbindung(Knoten<T> start, Knoten<T> ziel, int gewicht){
                if(start == ziel){
                        System.err.println("Ungueltige Kante!");
                }
                int s = getIndex(start);
                int z = getIndex(ziel);
                
                this.matrix[s][z] = gewicht;
        }
        
        public void addBeidseitigeVerbindung(Knoten<T> start, Knoten<T> ziel, int gewicht){
                addEinseitigeVerbindung(start, ziel, gewicht);
                addEinseitigeVerbindung(ziel, start, gewicht);
        }
        
        @Override
        public List<Knoten<T>> getNachbarknoten(Knoten<T> k) {
                List<Knoten<T>> nachbarn = getInNachbarknoten(k);
                nachbarn.addAll(getOutNachbarknoten(k));
                return nachbarn;
        }
        
        @Override
        public List<Knoten<T>> getInNachbarknoten(Knoten<T> k) {
                List<Knoten<T>> nachbarn = new ArrayList<Knoten<T>>();
                int index = getIndex(k);
                for(int i = 0; i < this.matrix[index].length; i++){
                        if(this.matrix[i][index] > 0){
                                nachbarn.add(this.knoten.get(i));
                        }
                }
                return nachbarn;
        }
        
        @Override
        public List<Knoten<T>> getOutNachbarknoten(Knoten<T> k) {
                List<Knoten<T>> nachbarn = new ArrayList<Knoten<T>>();
                int index = getIndex(k);
                for(int i = 0; i < this.matrix[index].length; i++){
                        if(this.matrix[index][i] > 0){
                                nachbarn.add(this.knoten.get(i));
                        }
                }
                return nachbarn;
        }

        public boolean istNachbarVon(Knoten<T> k, Knoten<T> zielKnoten){
                return getNachbarknoten(k).contains(zielKnoten);
        }
        
        public int getKosten(Knoten<T> startKnoten, Knoten<T> zielKnoten){
                return this.matrix[getIndex(zielKnoten)][getIndex(startKnoten)];
        }
        
        @Override
        public List<Knoten<T>> getKnoten() {
                return this.knoten;
        }
        
        private int getIndex(Knoten<T> k){
                return this.knoten.indexOf(k);
        }
        
        public void showAll(){
                System.out.print("\t");
                for(Knoten<T> k : this.knoten){
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
