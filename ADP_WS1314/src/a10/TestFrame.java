package a10;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * Die TestKlasse fuer unsere Implementierungen.
 */

public class TestFrame {

	public static void main(String[] args) {//Knoten erstellen
        Node<String> a = new Node<String>("A");
        Node<String> b = new Node<String>("B");
        Node<String> c = new Node<String>("C");
        Node<String> d = new Node<String>("D");
        Node<String> e = new Node<String>("E");
        Node<String> f = new Node<String>("F");
        Node<String> g = new Node<String>("G");
                
//        System.out.println("----------------------------------------------------------");
//        System.out.println("           G r a p h e n   a l s   M a t r i x");
//        System.out.println("----------------------------------------------------------");
//        //Graphen erstellen
//        GraphAMatrix<String> gm = new GraphAMatrix<String>(a);
//        
//        //Konten hinzufuegen
//        gm.addKnoten(b); gm.addKnoten(c); gm.addKnoten(d); gm.addKnoten(e); gm.addKnoten(f); gm.addKnoten(g);
//        
//        
//        gm.addBeidseitigeVerbindung(a, b, 4);
//        gm.addBeidseitigeVerbindung(a, g, 5);
//        gm.addBeidseitigeVerbindung(a, f, 10);
//        gm.addBeidseitigeVerbindung(b, g, 2);
//        gm.addBeidseitigeVerbindung(b, c, 7);
//        gm.addBeidseitigeVerbindung(c, g, 1);
//        gm.addBeidseitigeVerbindung(c, d, 12);
//        gm.addBeidseitigeVerbindung(d, e, 4);
//        gm.addBeidseitigeVerbindung(e, g, 8);
//        gm.addBeidseitigeVerbindung(e, f, 3);
//        gm.addBeidseitigeVerbindung(f, g, 4);
//        
//        gm.showAll();
//        System.out.println("----------------------------------------------------------\n");
//        
//        System.out.println("----------------------------------------------------------");
//        System.out.println("           G r a p h e n   a l s   L i s t e");
//        System.out.println("----------------------------------------------------------");
//        //Graphen erstellen
//        GraphAListe<String> gl = new GraphAListe<String>(a);
//        
//        //Konten hinzufuegen
//        gl.addKnoten(b); gl.addKnoten(c); gl.addKnoten(d); gl.addKnoten(e); gl.addKnoten(f); gl.addKnoten(g);
//        
//        gl.addBeidseitigeVerbindung(a, b, 4);
//        gl.addBeidseitigeVerbindung(a, g, 5);
//        gl.addBeidseitigeVerbindung(a, f, 10);
//        gl.addBeidseitigeVerbindung(b, g, 2);
//        gl.addBeidseitigeVerbindung(b, c, 7);
//        gl.addBeidseitigeVerbindung(c, g, 1);
//        gl.addBeidseitigeVerbindung(c, d, 12);
//        gl.addBeidseitigeVerbindung(d, e, 4);
//        gl.addBeidseitigeVerbindung(e, g, 8);
//        gl.addBeidseitigeVerbindung(e, f, 3);
//        gl.addBeidseitigeVerbindung(f, g, 4);
//        
//        gl.showAll();
//        System.out.println("----------------------------------------------------------\n");
//        
//
//        System.out.println("----------------------------------------------------------");
//        System.out.println("               D y k s t r a   M a t r i x");
//        System.out.println("----------------------------------------------------------");
//        //Graphen erstellen
//        DykstraMatrix<String> dkm = new DykstraMatrix<String>(a);
//      
//        //Konten hinzufuegen
//        dkm.addKnoten(b); dkm.addKnoten(c); dkm.addKnoten(d); dkm.addKnoten(e); dkm.addKnoten(f); dkm.addKnoten(g);
//      
//        dkm.addBeidseitigeVerbindung(a, b, 4);
//        dkm.addBeidseitigeVerbindung(a, g, 5);
//        dkm.addBeidseitigeVerbindung(a, f, 10);
//        dkm.addBeidseitigeVerbindung(b, g, 2);
//        dkm.addBeidseitigeVerbindung(b, c, 7);
//        dkm.addBeidseitigeVerbindung(c, g, 1);
//        dkm.addBeidseitigeVerbindung(c, d, 12);
//        dkm.addBeidseitigeVerbindung(d, e, 4);
//        dkm.addBeidseitigeVerbindung(e, g, 8);
//        dkm.addBeidseitigeVerbindung(e, f, 3);
//      	dkm.addBeidseitigeVerbindung(f, g, 4);
//      
//      	dkm.showAll();
//      	System.out.println("----------------------------------------------------------\n");
//      
//      	dkm.berechneWeg();
//      	 
//        System.out.println("\n----------------------------------------------------------");
//        System.out.println("               D y k s t r a   L i s t e");
//        System.out.println("----------------------------------------------------------");
//        //Graphen erstellen
//        DykstraListe<String> dl = new DykstraListe<String>(a);
//        
//        //Konten hinzufuegen
//        dl.addKnoten(b); dl.addKnoten(c); dl.addKnoten(d); dl.addKnoten(e); dl.addKnoten(f); dl.addKnoten(g);
//        
//        //Kanten hinzufuegen
//        dl.addBeidseitigeVerbindung(a, g, 5);
//        dl.addBeidseitigeVerbindung(a, b, 4);
//        dl.addBeidseitigeVerbindung(a, f, 10);
//        dl.addBeidseitigeVerbindung(b, g, 2);
//        dl.addBeidseitigeVerbindung(b, c, 7);
//        dl.addBeidseitigeVerbindung(f, g, 4);
//        dl.addBeidseitigeVerbindung(f, e, 3);
//        dl.addBeidseitigeVerbindung(g, c, 1);
//        dl.addBeidseitigeVerbindung(g, e, 8);
//        dl.addBeidseitigeVerbindung(d, c, 12);
//        dl.addBeidseitigeVerbindung(d, e, 4);
//        
//        dl.showAll();
//        System.out.println("----------------------------------------------------------\n");
//        
//        dl.berechneWeg();
//        
//        System.out.println("\n----------------------------------------------------------");
//        System.out.println("            D y k s t r a   M a t r i x   A O P");
//        System.out.println("----------------------------------------------------------"); 
//        //Graphen erstellen
//        AopM<String> dkmAOP = new AopM<String>(a);
//        
//        //Konten hinzufuegen
//        dkmAOP.addKnoten(b); dkmAOP.addKnoten(c); dkmAOP.addKnoten(d); dkmAOP.addKnoten(e); dkmAOP.addKnoten(f); dkmAOP.addKnoten(g);
//        
//        dkmAOP.addBeidseitigeVerbindung(a, b, 4);
//        dkmAOP.addBeidseitigeVerbindung(a, g, 5);
//        dkmAOP.addBeidseitigeVerbindung(a, f, 10);
//        dkmAOP.addBeidseitigeVerbindung(b, g, 2);
//        dkmAOP.addBeidseitigeVerbindung(b, c, 7);
//        dkmAOP.addBeidseitigeVerbindung(c, g, 1);
//        dkmAOP.addBeidseitigeVerbindung(c, d, 12);
//        dkmAOP.addBeidseitigeVerbindung(d, e, 4);
//        dkmAOP.addBeidseitigeVerbindung(e, g, 8);
//        dkmAOP.addBeidseitigeVerbindung(e, f, 3);
//        dkmAOP.addBeidseitigeVerbindung(f, g, 4);
//        
//        dkmAOP.showAll();
//        System.out.println("----------------------------------------------------------\n");
//        
//        dkmAOP.berechneWeg();
//        
//        dkmAOP.removeKnoten(c);    
//            
//        System.out.println("\nAuswertung:");
//        System.out.println("AddZeit:\t\t\t" + dkmAOP.getAddZeit());
//        System.out.println("RemoveZeit:\t\t\t" + dkmAOP.getRemoveZeit());
//        System.out.println("BeidseitigeVerbindungZeit:\t" + dkmAOP.getBeidseitigeVerbindungZeit());
//        System.out.println("EinseitigeVerbindungZeit:\t" + dkmAOP.getEinseitigeVerbindungZeit());
//        System.out.println("InNachbarnZeit:\t\t\t" + dkmAOP.getGetInNachbarnZeit());
//        System.out.println("OutNachbarnZeit:\t\t" + dkmAOP.getGetOutNachbarnZeit());
//        System.out.println("NachbarnZeit:\t\t\t" + dkmAOP.getGetNachbarnZeit());
//        System.out.println("BerechneWegZeit:\t\t" + dkmAOP.getBerechneWegZeit());
//                
//                
//        System.out.println("\n----------------------------------------------------------");
//        System.out.println("            D y k s t r a   L i s t e   A O P");
//        System.out.println("----------------------------------------------------------");
//	  
//        //Graphen erstellen
//        AopL<String> dkl = new AopL<String>(a);
//	  
//        //Konten hinzufuegen
//        dkl.addKnoten(b); dkl.addKnoten(c); dkl.addKnoten(d); dkl.addKnoten(e); dkl.addKnoten(f); dkl.addKnoten(g);
//	  
//        dkl.addBeidseitigeVerbindung(a, b, 4);
//        dkl.addBeidseitigeVerbindung(a, g, 5);
//        dkl.addBeidseitigeVerbindung(a, f, 10);
//        dkl.addBeidseitigeVerbindung(b, g, 2);
//        dkl.addBeidseitigeVerbindung(b, c, 7);
//        dkl.addBeidseitigeVerbindung(c, g, 1);
//        dkl.addBeidseitigeVerbindung(c, d, 12);
//        dkl.addBeidseitigeVerbindung(d, e, 4);
//        dkl.addBeidseitigeVerbindung(e, g, 8);
//        dkl.addBeidseitigeVerbindung(e, f, 3);
//        dkl.addBeidseitigeVerbindung(f, g, 4);
//	  
//        dkl.showAll();
//        System.out.println("----------------------------------------------------------\n");
//	  
//        dkl.berechneWeg();
//	  
//        dkl.removeKnoten(c);
//	  
//        System.out.println("\nAuswertung:");
//        System.out.println("AddZeit:\t\t\t" + dkl.getAddZeit());
//        System.out.println("RemoveZeit:\t\t\t" + dkl.getRemoveZeit());
//        System.out.println("BeidseitigeVerbindungZeit:\t" + dkl.getBeidseitigeVerbindungZeit());
//        System.out.println("EinseitigeVerbindungZeit:\t" + dkl.getEinseitigeVerbindungZeit());
//        System.out.println("InNachbarnZeit:\t\t\t" + dkl.getGetInNachbarnZeit());
//        System.out.println("OutNachbarnZeit:\t\t" + dkl.getGetOutNachbarnZeit());
//        System.out.println("NachbarnZeit:\t\t\t" + dkl.getGetNachbarnZeit());
//	  	System.out.println("BerechneWegZeit:\t\t" + dkl.getBerechneWegZeit());
        
        
        
        System.out.println("\n----------------------------------------------------------");
        System.out.println("                   R   A   N   D   O   M");
        System.out.println("         D y k s t r a   M a t r i x   W R A P P E R");
        System.out.println("----------------------------------------------------------"); 
        
        //Graphen erstellen
        for(int i = 10; i<=1000; i*=10){
            System.out.println("\n----------------------------------------------------------"); 
        	System.out.println("                  Anzahl der Knoten: " + i + "\n");
	        Node<Integer> z = new Node<Integer>(i-1);
	        WrapperDijkstraMatrix<Integer> dkmWrapper = new WrapperDijkstraMatrix<Integer>(z);
	        for(int j = 1; j<=i; j++){
	        	dkmWrapper.addKnoten(new Node<Integer>(j));
	        }
        	for(int j = 0; j<i; j++){//alle Verbindungen legen
        		dkmWrapper.addBeidseitigeVerbindung(dkmWrapper.getKnoten().get((int)(Math.random()*(i))),	//start
        										dkmWrapper.getKnoten().get((int)(Math.random()*(i))),	//ziel
        										(int)(Math.random()*(i)));		     				//kosten
        	}
	        
//	        dkmAOP.showAll();
//	        System.out.println("----------------------------------------------------------\n");
	        
	        dkmWrapper.berechneWeg();
	        
	        dkmWrapper.removeKnoten(z);
	        
	        dkmWrapper.addEinseitigeVerbindung( dkmWrapper.getKnoten().get((int)(Math.random()*(i))),	//start
	        								dkmWrapper.getKnoten().get((int)(Math.random()*(i))),	//ziel
	        								(int)(Math.random()*(i)));						    //kosten
	            
	        System.out.println("\nAuswertung:");
	        System.out.println("AddZeit:\t\t\t" + dkmWrapper.getAddZeit());
	        System.out.println("RemoveZeit:\t\t\t" + dkmWrapper.getRemoveZeit());
	        System.out.println("BeidseitigeVerbindungZeit:\t" + dkmWrapper.getBeidseitigeVerbindungZeit());
	        System.out.println("EinseitigeVerbindungZeit:\t" + dkmWrapper.getEinseitigeVerbindungZeit());
	        System.out.println("NachbarnZeit:\t\t\t" + dkmWrapper.getGetNachbarnZeit());
	        System.out.println("BerechneWegZeit:\t\t" + dkmWrapper.getBerechneWegZeit());
        }
                
                
        System.out.println("\n----------------------------------------------------------");
        System.out.println("                   R   A   N   D   O   M");
        System.out.println("         D y k s t r a   L i s t e   W R A P P E R");
        System.out.println("----------------------------------------------------------");
	  
        //Graphen erstellen
        for(int i = 10; i<=1000; i*=10){
            System.out.println("\n----------------------------------------------------------"); 
        	System.out.println("                  Anzahl der Knoten: " + i + "\n");
	        Node<Integer> z = new Node<Integer>(i-1);
	        WrapperDijkstraMatrix<Integer> dklWrapper = new WrapperDijkstraMatrix<Integer>(z);
	        for(int j = 1; j<=i; j++){
	        	dklWrapper.addKnoten(new Node<Integer>(j));
	        }
        	for(int j = 0; j<(i-1); j++){//alle Verbindungen legen
        		dklWrapper.addBeidseitigeVerbindung(dklWrapper.getKnoten().get((int)(Math.random()*(i))),	//start
        										dklWrapper.getKnoten().get((int)(Math.random()*(i))),	//ziel
        										(int)(Math.random()*(i)));						    //kosten
        	}
	  
//	        dklAOP.showAll();
//	        System.out.println("----------------------------------------------------------\n");
		  
	        dklWrapper.berechneWeg();
	        
	        dklWrapper.removeKnoten(z);
	        
	        dklWrapper.addEinseitigeVerbindung(	dklWrapper.getKnoten().get((int)(Math.random()*(i))),	//start
									       	dklWrapper.getKnoten().get((int)(Math.random()*(i))),	//ziel
									       	(int)(Math.random()*(i)));						    //kosten
		  
	        System.out.println("\nAuswertung:");
	        System.out.println("AddZeit:\t\t\t" + dklWrapper.getAddZeit());
	        System.out.println("RemoveZeit:\t\t\t" + dklWrapper.getRemoveZeit());
	        System.out.println("BeidseitigeVerbindungZeit:\t" + dklWrapper.getBeidseitigeVerbindungZeit());
	        System.out.println("EinseitigeVerbindungZeit:\t" + dklWrapper.getEinseitigeVerbindungZeit());
	        System.out.println("NachbarnZeit:\t\t\t" + dklWrapper.getGetNachbarnZeit());
		  	System.out.println("BerechneWegZeit:\t\t" + dklWrapper.getBerechneWegZeit());
        }
    }
}
