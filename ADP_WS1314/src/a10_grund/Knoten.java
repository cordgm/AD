package a10_grund;

/**
 * 
 * Team: Molière
 * Mitglieder: Kaoutare Bedda und Florian Schlosser
 * Datum: 21.06.2011
 *
 * Die Knotenklasse für unsere Graphen.
 */

import java.util.ArrayList;
import java.util.List;

public class Knoten<T> {
        
        //Attribute
        private List<Verbindung<T>> in;
        private List<Verbindung<T>> out;
        private T info;
        
        
        //Konstruktor
        public Knoten(T info){
                this.in = new ArrayList<Verbindung<T>>();
                this.out = new ArrayList<Verbindung<T>>();
                this.info = info;
        }


        //Methoden
        @Override
        public boolean equals(Object o){
                return o instanceof Knoten<?> && this.info.equals(((Knoten<?>)o).getInfo());
        }
        
        @Override
        public String toString(){
                return "Info: " + this.info;
        }
        
        public Verbindung<T> getVerbindungMit(Knoten<T> k){
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
        
        public boolean istNachbarVon(Knoten<T> k){
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
                return info;
        }
        public void setInfo(T info) {
                this.info = info;
        }
}
