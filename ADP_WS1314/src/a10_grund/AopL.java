package a10_grund;

/**
 * 
 * Team: Molière
 * Mitglieder: Kaoutare Bedda und Florian Schlosser
 * Datum: 21.06.2011
 *
 * Die Klasse zur Bestimmung der asymptotischen Komplexität der Listenimplementierung.
 */

import java.util.List;


public class AopL<T> extends DykstraL<T> {

        //Attribute
        private long addZeit;
        private long removeZeit;
        private long getNachbarnZeit;
        private long getInNachbarnZeit;
        private long getOutNachbarnZeit;
        private long einseitigeVerbindungZeit;
        private long beidseitigeVerbindungZeit;
        private long berechneWegZeit;
        
        
        //Methoden
        public AopL(Knoten<T> k) {
                super(k);
        }
        
        
        //Methoden
        public void removeKnoten(Knoten<T> k) {
                this.removeZeit = System.nanoTime();
                super.removeKnoten(k);
                this.removeZeit = System.nanoTime() - this.removeZeit;
        }
        
        @Override
        public List<Knoten<T>> getNachbarknoten(Knoten<T> k) {
                List<Knoten<T>> tmp;
                this.getNachbarnZeit = System.nanoTime();
                tmp = super.getNachbarknoten(k);
                this.getNachbarnZeit = System.nanoTime() - this.getNachbarnZeit;
                return tmp;
        }
        
        @Override
        public List<Knoten<T>> getInNachbarknoten(Knoten<T> k) {
                List<Knoten<T>> tmp;
                this.getInNachbarnZeit = System.nanoTime();
                tmp = super.getInNachbarknoten(k);
                this.getInNachbarnZeit = System.nanoTime() - this.getInNachbarnZeit;
                return tmp;
        }
        
        @Override
        public List<Knoten<T>> getOutNachbarknoten(Knoten<T> k) {
                List<Knoten<T>> tmp;
                this.getOutNachbarnZeit = System.nanoTime();
                tmp = super.getOutNachbarknoten(k);
                this.getOutNachbarnZeit = System.nanoTime() - this.getOutNachbarnZeit;
                return tmp;
        }
        
        @Override
        public List<Knoten<T>> getKnoten() {
                return super.getKnoten();
        }
        
        @Override
        public void addKnoten(Knoten<T> k) {
                this.addZeit = System.nanoTime();
                super.addKnoten(k);
                this.addZeit = System.nanoTime() - this.addZeit;
        }
        
        public void addEinseitigeVerbindung(Knoten<T> start, Knoten<T> ziel, int kosten){
                this.einseitigeVerbindungZeit = System.nanoTime();
                super.addEinseitigeVerbindung(start, ziel, kosten);
                this.einseitigeVerbindungZeit = System.nanoTime() - this.einseitigeVerbindungZeit;
        }
        
        public void addBeidseitigeVerbindung(Knoten<T> start, Knoten<T> ziel, int kosten){
                this.beidseitigeVerbindungZeit = System.nanoTime();
                super.addBeidseitigeVerbindung(start, ziel, kosten);
                this.beidseitigeVerbindungZeit = System.nanoTime() - this.beidseitigeVerbindungZeit;
        }
        
        public void showAll(){
                super.showAll();
        }
        
        public void berechneWeg(){
                this.berechneWegZeit = System.nanoTime();
                super.berechneWeg();
                this.berechneWegZeit = System.nanoTime() - this.berechneWegZeit;
        }
        
        
        //Getter-Setter

        public long getAddZeit() {
                return addZeit;
        }


        public long getRemoveZeit() {
                return removeZeit;
        }


        public long getGetNachbarnZeit() {
                return getNachbarnZeit;
        }


        public long getGetInNachbarnZeit() {
                return getInNachbarnZeit;
        }


        public long getGetOutNachbarnZeit() {
                return getOutNachbarnZeit;
        }


        public long getEinseitigeVerbindungZeit() {
                return einseitigeVerbindungZeit;
        }


        public long getBeidseitigeVerbindungZeit() {
                return beidseitigeVerbindungZeit;
        }


        public long getBerechneWegZeit() {
                return berechneWegZeit;
        }


}
