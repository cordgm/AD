/**
 * 
 */
package a10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manuel Meyer und Cord Godehus-Meyer
 * @param <T>
 *
 */
public class GraphAMatrix<T> implements IGraph<T> {

    //Attribute
    private int[][] matrix;
    private List<Node<T>> nodes;
    
	public GraphAMatrix(Node<T> node) {
        this.matrix = new int[1][1];
        this.nodes = new ArrayList<Node<T>>();
        this.nodes.add(node);
	}

	@Override
	public void addKnoten(Node<T> node) {
		//Zweidimensionales Array um 1 vergroessern
        int[][] tmp = new int[this.matrix.length+1][this.matrix.length+1];
        for(int i = 0; i < this.matrix.length; i++){
                for(int j = 0; j < this.matrix[i].length; j++){
                        tmp[i][j] = this.matrix[i][j];
                }
        }
        this.matrix = tmp;
        
        this.nodes.add(node);
	}

	@Override
	public void removeKnoten(Node<T> node) {
		int index = this.nodes.indexOf(node);
        this.nodes.remove(node);
        for(int i = 0; i < this.matrix[index].length; i++){
                this.matrix[index][i] = 0;
        }
        for(int i = 0; i < this.matrix[index].length; i++){
                this.matrix[i][index] = 0;
        }
	}

	@Override
	public List<Node<T>> getNachbarknoten(Node<T> node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Node<T>> getInNachbarknoten(Node<T> node) {
		List<Node<T>> nachbarn = getInNachbarknoten(node);
        nachbarn.addAll(getOutNachbarknoten(node));
        return nachbarn;
	}

	@Override
	public List<Node<T>> getOutNachbarknoten(Node<T> node) {
		List<Node<T>> nachbarn = new ArrayList<Node<T>>();
        int index = this.nodes.indexOf(node);
        for(int i = 0; i < this.matrix[index].length; i++){
                if(this.matrix[index][i] > 0){
                        nachbarn.add(this.nodes.get(i));
                }
        }
        return nachbarn;
	}

	@Override
	public List<Node<T>> getKnoten() {
		return this.nodes;
	}

	public void addBeidseitigeVerbindung(Node<T> start, Node<T> ziel, int gewicht) {
		addEinseitigeVerbindung(start, ziel, gewicht);
        addEinseitigeVerbindung(ziel, start, gewicht);
	}

	private void addEinseitigeVerbindung(Node<T> start, Node<T> ziel, int gewicht) {
		if(start == ziel){
            System.err.println("Ungueltige Kante!");
	    }
	    int s = this.nodes.indexOf(start);
	    int z = this.nodes.indexOf(ziel);
	    
	    this.matrix[s][z] = gewicht;
			
	}
	
	/**
	 * fuer Dysktra
	 * @param k
	 * @param zielKnoten
	 * @return
	 */
	public boolean istNachbarVon(Node<T> k, Node<T> zielKnoten){
        return getNachbarknoten(k).contains(zielKnoten);
	}
	
	/**
	 * fuer Dykstra
	 * @param startKnoten
	 * @param zielKnoten
	 * @return
	 */
	public int getKosten(Node<T> startKnoten, Node<T> zielKnoten){
        return this.matrix[this.nodes.indexOf(zielKnoten)][this.nodes.indexOf(startKnoten)];
	}
	
	public void showAll(){
        System.out.print("\t");
        for(Node<T> k : this.nodes){
            System.out.print(k.getInfo() + "\t");
        }
        System.out.println("\n\n");
        for(int i = 0; i < this.matrix.length; i++){
            System.out.print(this.nodes.get(i).getInfo() + "\t");
            for(int j = 0; j < this.matrix[i].length; j++){
                    System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
	}

}
