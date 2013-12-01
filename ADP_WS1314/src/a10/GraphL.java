package a10;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die Graphenklasse als Adjazenzliste.
 */

import java.util.ArrayList;
import java.util.List;

public class GraphL<T> implements IGraph<T>{

        //Attribute
        private Knoten<T> start;
        private List<Knoten<T>> knoten;
        
        
        //Konstruktor
        public GraphL(Knoten<T> start){
                this.start = start;
                this.knoten = new ArrayList<Knoten<T>>();
                this.knoten.add(start);
        }
        
        
        //Methoden
        @Override
        public void addKnoten(Knoten<T> k) {
                this.knoten.add(k);
        }
        
        public void addKnoten(Knoten<T> k, Knoten<T> ursprung, int g) {
                this.knoten.add(k);
                addEinseitigeVerbindung(ursprung, k, g);
        }

        @Override
        public void removeKnoten(Knoten<T> k) {
                
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
                this.knoten.remove(k);
                
        }

        @Override
        public List<Knoten<T>> getNachbarknoten(Knoten<T> k) {
                List<Knoten<T>> tmp = new ArrayList<Knoten<T>>();
                
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
        public List<Knoten<T>> getInNachbarknoten(Knoten<T> k) {
                List<Knoten<T>> tmp = new ArrayList<Knoten<T>>();
                
                for(Verbindung<T> v : k.getIn()){
                        tmp.add(v.getStart());
                }
                
                return tmp;
        }
        
        @Override
        public List<Knoten<T>> getOutNachbarknoten(Knoten<T> k) {
                List<Knoten<T>> tmp = new ArrayList<Knoten<T>>();
                
                for(Verbindung<T> v : k.getOut()){
                        tmp.add(v.getZiel());
                }
                
                return tmp;
        }
        
        public void addEinseitigeVerbindung(Knoten<T> start, Knoten<T> ziel, int kosten){
                Verbindung<T> tmp = new Verbindung<T>(start, ziel, kosten);
                start.getOut().add(tmp);
                ziel.getIn().add(tmp);
        }
        
        public void addBeidseitigeVerbindung(Knoten<T> start, Knoten<T> ziel, int kosten){
                Verbindung<T> tmp1 = new Verbindung<T>(start, ziel, kosten);
                start.getOut().add(tmp1);
                ziel.getIn().add(tmp1);
                Verbindung<T> tmp2 = new Verbindung<T>(ziel, start, kosten);
                ziel.getOut().add(tmp2);
                start.getIn().add(tmp2);
        }
        
        public void showAll(){
                for(int i = 0; i < knoten.size(); i++){
                        System.out.print("Info: " + knoten.get(i).getInfo());
                        
                        System.out.print("\t\tIn: ");
                        for(int j = 0; j < knoten.get(i).getIn().size(); j++){
                                System.out.print(" " + knoten.get(i).getIn().get(j).getStart().getInfo());
                        }
                        
                        System.out.print("\t\tOut: ");
                        for(int j = 0; j < knoten.get(i).getOut().size(); j++){
                                System.out.print(" " + knoten.get(i).getOut().get(j).getZiel().getInfo());
                        }
                        
                        System.out.println();
                }
        }


        //Getter-Setter
        public Knoten<T> getStart() {
                return start;
        }
        public void setStart(Knoten<T> start) {
                this.start = start;
        }

        public List<Knoten<T>> getKnoten() {
                return knoten;
        }
        public void setKnoten(List<Knoten<T>> knoten) {
                this.knoten = knoten;
        }
}
