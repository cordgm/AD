package a11;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die Klasse welche das Weblog darstellt.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Weblog implements Serializable{
        
        //Attributes
        private String key;
        private List<Webinfo> infoList;
        
        
        //Constructors
        public Weblog(String key, String info){
                this.key = key;
                this.infoList = new ArrayList<Webinfo>();
                this.infoList.add(new Webinfo(info));
        }
        
        
        //Methods
        @Override
        public int hashCode(){
                return parseKeyToInteger();
        }
        
        private int parseKeyToInteger(){
                String tmp = key.replaceAll("[.]*", "");
                
                return (Integer.parseInt(tmp) % 100);
        }
        
        @Override
        public boolean equals(Object o){
                if(!(o instanceof Weblog)){
                    return false;    
                }
                
                return this.hashCode() == o.hashCode();
        }
        
        public void addWebinfo(Webinfo wi){
                if(!infoList.contains(wi)){
                        this.infoList.add(wi);
                }
        }
        
        public String getContent(){
                String content = this.key + "\n\n";
                int i = 1;
                for(Webinfo wi : infoList){
                        content += "Weblog " + i + ":\n" + wi.getInfo() + "\n\n";
                        i++;
                }
                return content;
        }
        
        public List<Webinfo> getInfoList(){
                return this.infoList;
        }
        
        public String toString(){
                return "Key: " + this.key + "\tAnzahlInhalte: " + this.infoList.size();
        }
        
        public String getKey(){
                return this.key;
        }

}
