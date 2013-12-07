package a11;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Diese Klasse stellt den Inhalt des Weblogs dar.
 */

import java.io.Serializable;

@SuppressWarnings("serial")
public class Webinfo implements Serializable{
        
        //Attribute
        private String info;
        
        //Konstruktor
        public Webinfo(String info){
            this.info = info;
        }

        //Methoden
        public String getInfo() {
            return info;
        }
        public void setInfo(String info) {
            this.info = info;
        }
}
