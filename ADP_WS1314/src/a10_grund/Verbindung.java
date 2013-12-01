package a10_grund;

/**
 * 
 * Team: Molière
 * Mitglieder: Kaoutare Bedda und Florian Schlosser
 * Datum: 21.06.2011
 *
 * Die Verbindungsklasse um die Kanten zwischen den Knoten darzustellen.
 */

public class Verbindung<T> {
        
        //Attribute
        private Knoten<T> start;
        private Knoten<T> ziel;
        private int kosten;
        
        
        //Konstruktor
        public Verbindung(Knoten<T> start, Knoten<T> ziel, int kosten){
                this.start = start;
                this.ziel = ziel;
                this.kosten = kosten;
        }

        
        //Methoden
        public Knoten<T> getStart() {
                return start;
        }
        public void setStart(Knoten<T> start) {
                this.start = start;
        }
        
        public Knoten<T> getZiel() {
                return ziel;
        }
        public void setZiel(Knoten<T> ziel) {
                this.ziel = ziel;
        }
        
        public int getKosten() {
                return kosten;
        }
        public void setKosten(int kosten) {
                this.kosten = kosten;
        }
}
