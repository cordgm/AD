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
public class GraphAListe<T> implements IGraph<T> {

    //Attribute
    private Node<T> start;
    private List<Node<T>> nodes;
    
    
    
    
	public GraphAListe(Node<T> start) {
		this.start = start;
        this.nodes = new ArrayList<Node<T>>();
        this.nodes.add(start);
	}

	@Override
	public void addKnoten(Node<T> node) {
        this.nodes.add(node);
	}

	@Override
	public void removeKnoten(Node<T> node) {
        
        //Eingehende Verbindungen loeschen
        for(int i = 0; i < node.getIn().size(); i++){
                Verbindung<T> tmp = node.getIn().get(i);
                tmp.getStart().getOut().remove(tmp);
        }
        
        //Ausgehende Verbindungen loeschen
        for(int i = 0; i < node.getOut().size(); i++){
                Verbindung<T> tmp = node.getOut().get(i);
                tmp.getZiel().getIn().remove(tmp);
        }
        
        //Knoten aus der Liste loeschen
        this.nodes.remove(node);
	}

	@Override
	public List<Node<T>> getNachbarknoten(Node<T> node) {
        List<Node<T>> tmp = new ArrayList<Node<T>>();
        
        //Knoten die auf k zeigen
        int length = node.getIn().size();
        for(int i = 0; i < length; i++){
                tmp.add(node.getIn().get(i).getStart());
        }
        
        //Knoten auf die k zeigt
        length = node.getOut().size();
        for(int i = 0; i < length; i++){
                if(!(tmp.contains(node.getOut().get(i).getZiel()))){
                        tmp.add(node.getOut().get(i).getZiel());
                }
        }
        
        return tmp;
	}

	@Override
	public List<Node<T>> getInNachbarknoten(Node<T> node) {
        List<Node<T>> tmp = new ArrayList<Node<T>>();
        
        for(Verbindung<T> v : node.getIn()){
                tmp.add(v.getStart());
        }
        
        return tmp;
	}

	@Override
	public List<Node<T>> getOutNachbarknoten(Node<T> node) {
        List<Node<T>> tmp = new ArrayList<Node<T>>();
        
        for(Verbindung<T> v : node.getOut()){
                tmp.add(v.getZiel());
        }
        
        return tmp;
	}

	@Override
	public List<Node<T>> getKnoten() {
        return nodes;
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
}
