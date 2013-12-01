package a10;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die TestKlasse für unsere Implementierungen.
 */

public class TestFrame {

	public static void main(String[] args) {//Knoten erstellen
        Knoten<String> a = new Knoten<String>("A");
        Knoten<String> b = new Knoten<String>("B");
        Knoten<String> c = new Knoten<String>("C");
        Knoten<String> d = new Knoten<String>("D");
        Knoten<String> e = new Knoten<String>("E");
        Knoten<String> f = new Knoten<String>("F");
        Knoten<String> g = new Knoten<String>("G");
                
        System.out.println("----------------------------------------------------------");
        System.out.println("           G r a p h e n   a l s   M a t r i x");
        System.out.println("----------------------------------------------------------");
        //Graphen erstellen
        GraphM<String> dm = new GraphM<String>(a);
        
        //Konten hinzufuegen
        dm.addKnoten(b); dm.addKnoten(c); dm.addKnoten(d); dm.addKnoten(e); dm.addKnoten(f); dm.addKnoten(g);
        
        
        dm.addBeidseitigeVerbindung(a, b, 4);
        dm.addBeidseitigeVerbindung(a, g, 5);
        dm.addBeidseitigeVerbindung(a, f, 10);
        dm.addBeidseitigeVerbindung(b, g, 2);
        dm.addBeidseitigeVerbindung(b, c, 7);
        dm.addBeidseitigeVerbindung(c, g, 1);
        dm.addBeidseitigeVerbindung(c, d, 12);
        dm.addBeidseitigeVerbindung(d, e, 4);
        dm.addBeidseitigeVerbindung(e, g, 8);
        dm.addBeidseitigeVerbindung(e, f, 3);
        dm.addBeidseitigeVerbindung(f, g, 4);
        
        dm.showAll();
        System.out.println("----------------------------------------------------------\n");
        
        System.out.println("----------------------------------------------------------");
        System.out.println("           G r a p h e n   a l s   L i s t e");
        System.out.println("----------------------------------------------------------");
        //Graphen erstellen
        GraphL<String> gl = new GraphL<String>(a);
        
        //Konten hinzufuegen
        gl.addKnoten(b); gl.addKnoten(c); gl.addKnoten(d); gl.addKnoten(e); gl.addKnoten(f); gl.addKnoten(g);
        
        gl.addBeidseitigeVerbindung(a, b, 4);
        gl.addBeidseitigeVerbindung(a, g, 5);
        gl.addBeidseitigeVerbindung(a, f, 10);
        gl.addBeidseitigeVerbindung(b, g, 2);
        gl.addBeidseitigeVerbindung(b, c, 7);
        gl.addBeidseitigeVerbindung(c, g, 1);
        gl.addBeidseitigeVerbindung(c, d, 12);
        gl.addBeidseitigeVerbindung(d, e, 4);
        gl.addBeidseitigeVerbindung(e, g, 8);
        gl.addBeidseitigeVerbindung(e, f, 3);
        gl.addBeidseitigeVerbindung(f, g, 4);
        
        gl.showAll();
        System.out.println("----------------------------------------------------------\n");
        

        System.out.println("----------------------------------------------------------");
        System.out.println("               D y k s t r a   M a t r i x");
        System.out.println("----------------------------------------------------------");
        //Graphen erstellen
        DykstraM<String> dkm = new DykstraM<String>(a);
      
        //Konten hinzufuegen
        dkm.addKnoten(b); dkm.addKnoten(c); dkm.addKnoten(d); dkm.addKnoten(e); dkm.addKnoten(f); dkm.addKnoten(g);
      
        dkm.addBeidseitigeVerbindung(a, b, 4);
        dkm.addBeidseitigeVerbindung(a, g, 5);
        dkm.addBeidseitigeVerbindung(a, f, 10);
        dkm.addBeidseitigeVerbindung(b, g, 2);
        dkm.addBeidseitigeVerbindung(b, c, 7);
        dkm.addBeidseitigeVerbindung(c, g, 1);
        dkm.addBeidseitigeVerbindung(c, d, 12);
        dkm.addBeidseitigeVerbindung(d, e, 4);
        dkm.addBeidseitigeVerbindung(e, g, 8);
        dkm.addBeidseitigeVerbindung(e, f, 3);
      	dkm.addBeidseitigeVerbindung(f, g, 4);
      
      	dkm.showAll();
      	System.out.println("----------------------------------------------------------\n");
      
      	dkm.berechneWeg();
      	 
        System.out.println("\n----------------------------------------------------------");
        System.out.println("               D y k s t r a   L i s t e");
        System.out.println("----------------------------------------------------------");
        //Graphen erstellen
        DykstraL<String> dl = new DykstraL<String>(a);
        
        //Konten hinzufuegen
        dl.addKnoten(b); dl.addKnoten(c); dl.addKnoten(d); dl.addKnoten(e); dl.addKnoten(f); dl.addKnoten(g);
        
        //Kanten hinzufuegen
        dl.addBeidseitigeVerbindung(a, g, 5);
        dl.addBeidseitigeVerbindung(a, b, 4);
        dl.addBeidseitigeVerbindung(a, f, 10);
        dl.addBeidseitigeVerbindung(b, g, 2);
        dl.addBeidseitigeVerbindung(b, c, 7);
        dl.addBeidseitigeVerbindung(f, g, 4);
        dl.addBeidseitigeVerbindung(f, e, 3);
        dl.addBeidseitigeVerbindung(g, c, 1);
        dl.addBeidseitigeVerbindung(g, e, 8);
        dl.addBeidseitigeVerbindung(d, c, 12);
        dl.addBeidseitigeVerbindung(d, e, 4);
        
        dl.showAll();
        System.out.println("----------------------------------------------------------\n");
        
        dl.berechneWeg();
        

      /**
       * ---------------------------
       *      Dykstra Matrix AOP
       * ---------------------------
       */
            
            
//            //Graphen erstellen
//            AopM<String> dkm = new AopM<String>(a);
//            
//            
//            //Konten hinzufuegen
//            dkm.addKnoten(b);
//            dkm.addKnoten(c);
//            dkm.addKnoten(d);
//            dkm.addKnoten(e);
//            dkm.addKnoten(f);
//            dkm.addKnoten(g);
//            
//            
//            dkm.addBeidseitigeVerbindung(a, b, 4);
//            dkm.addBeidseitigeVerbindung(a, g, 5);
//            dkm.addBeidseitigeVerbindung(a, f, 10);
//            dkm.addBeidseitigeVerbindung(b, g, 2);
//            dkm.addBeidseitigeVerbindung(b, c, 7);
//            dkm.addBeidseitigeVerbindung(c, g, 1);
//            dkm.addBeidseitigeVerbindung(c, d, 12);
//            dkm.addBeidseitigeVerbindung(d, e, 4);
//            dkm.addBeidseitigeVerbindung(e, g, 8);
//            dkm.addBeidseitigeVerbindung(e, f, 3);
//            dkm.addBeidseitigeVerbindung(f, g, 4);
//            
//            dkm.showAll();
//            System.out.println("-----------------------");
//            
//            dkm.berechneWeg();
//            
//            dkm.removeKnoten(c);    
//                
//            System.out.println("\n\nAuswertung:");
//            System.out.println("AddZeit:\t\t\t" + dkm.getAddZeit());
//            System.out.println("RemoveZeit:\t\t\t" + dkm.getRemoveZeit());
//            System.out.println("BeidseitigeVerbindungZeit:\t" + dkm.getBeidseitigeVerbindungZeit());
//            System.out.println("EinseitigeVerbindungZeit:\t" + dkm.getEinseitigeVerbindungZeit());
//            System.out.println("InNachbarnZeit:\t\t\t" + dkm.getGetInNachbarnZeit());
//            System.out.println("OutNachbarnZeit:\t\t" + dkm.getGetOutNachbarnZeit());
//            System.out.println("NachbarnZeit:\t\t\t" + dkm.getGetNachbarnZeit());
//            System.out.println("BerechneWegZeit:\t\t" + dkm.getBerechneWegZeit());
                
                
                /**
                 * ---------------------------
                 *      Dykstra Liste AOP
                 * ---------------------------
                 */
                
//              //Knoten erstellen
//              Knoten<String> a = new Knoten<String>("A");
//              Knoten<String> b = new Knoten<String>("B");
//              Knoten<String> c = new Knoten<String>("C");
//              Knoten<String> d = new Knoten<String>("D");
//              Knoten<String> e = new Knoten<String>("E");
//              Knoten<String> f = new Knoten<String>("F");
//              Knoten<String> g = new Knoten<String>("G");
//              
//              
//              //Graphen erstellen
//              AopL<String> dkl = new AopL<String>(a);
//              
//              
//              //Konten hinzufuegen
//              dkl.addKnoten(b);
//              dkl.addKnoten(c);
//              dkl.addKnoten(d);
//              dkl.addKnoten(e);
//              dkl.addKnoten(f);
//              dkl.addKnoten(g);
//              
//              
//              dkl.addBeidseitigeVerbindung(a, b, 4);
//              dkl.addBeidseitigeVerbindung(a, g, 5);
//              dkl.addBeidseitigeVerbindung(a, f, 10);
//              dkl.addBeidseitigeVerbindung(b, g, 2);
//              dkl.addBeidseitigeVerbindung(b, c, 7);
//              dkl.addBeidseitigeVerbindung(c, g, 1);
//              dkl.addBeidseitigeVerbindung(c, d, 12);
//              dkl.addBeidseitigeVerbindung(d, e, 4);
//              dkl.addBeidseitigeVerbindung(e, g, 8);
//              dkl.addBeidseitigeVerbindung(e, f, 3);
//              dkl.addBeidseitigeVerbindung(f, g, 4);
//              
//              dkl.showAll();
//              System.out.println("-----------------------");
//              
//              dkl.berechneWeg();
//              
//              dkl.removeKnoten(c);
//              
//              System.out.println("\n\nAuswertung:");
//              System.out.println("AddZeit:\t\t\t" + dkl.getAddZeit());
//              System.out.println("RemoveZeit:\t\t\t" + dkl.getRemoveZeit());
//              System.out.println("BeidseitigeVerbindungZeit:\t" + dkl.getBeidseitigeVerbindungZeit());
//              System.out.println("EinseitigeVerbindungZeit:\t" + dkl.getEinseitigeVerbindungZeit());
//              System.out.println("InNachbarnZeit:\t\t\t" + dkl.getGetInNachbarnZeit());
//              System.out.println("OutNachbarnZeit:\t\t" + dkl.getGetOutNachbarnZeit());
//              System.out.println("NachbarnZeit:\t\t\t" + dkl.getGetNachbarnZeit());
//              System.out.println("BerechneWegZeit:\t\t" + dkl.getBerechneWegZeit());
              
             
        }
}
