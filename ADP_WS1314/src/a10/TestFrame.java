/**
 * 
 */
package a10;

/**
 * @author cordgm
 *
 */
public class TestFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        System.out.println("----------------------------------------------------------");
        System.out.println("           G r a p h e n   a l s   M a t r i x");
        System.out.println("----------------------------------------------------------");
        
        //Knoten erstellen
        Node<String> a = new Node<String>("A"), b = new Node<String>("B"), c = new Node<String>("C"), d = new Node<String>("D");
        Node<String> e = new Node<String>("E"), f = new Node<String>("F"), g = new Node<String>("G");
        
        //Graphen erstellen
        GraphAMatrix<String> dm = new GraphAMatrix<String>(a);
        
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
        GraphAListe<String> dl = new GraphAListe<String>(a);
        
        //Konten hinzufuegen
        dl.addKnoten(b); dl.addKnoten(c); dl.addKnoten(d); dl.addKnoten(e); dl.addKnoten(f); dl.addKnoten(g);
        
        dl.addBeidseitigeVerbindung(a, b, 4);
        dl.addBeidseitigeVerbindung(a, g, 5);
        dl.addBeidseitigeVerbindung(a, f, 10);
        dl.addBeidseitigeVerbindung(b, g, 2);
        dl.addBeidseitigeVerbindung(b, c, 7);
        dl.addBeidseitigeVerbindung(c, g, 1);
        dl.addBeidseitigeVerbindung(c, d, 12);
        dl.addBeidseitigeVerbindung(d, e, 4);
        dl.addBeidseitigeVerbindung(e, g, 8);
        dl.addBeidseitigeVerbindung(e, f, 3);
        dl.addBeidseitigeVerbindung(f, g, 4);
        
        dl.showAll();
        System.out.println("----------------------------------------------------------\n");
        

        System.out.println("----------------------------------------------------------");
        System.out.println("               D y k s t r a   M a t r i x");
        System.out.println("----------------------------------------------------------");
        
        //Graphen erstellen
        DykstraMatrix<String> dkm = new DykstraMatrix<String>(a);
      
      
        //Konten hinzufuegen
        dkm.addKnoten(b);
        dkm.addKnoten(c);
        dkm.addKnoten(d);
        dkm.addKnoten(e);
        dkm.addKnoten(f);
        dkm.addKnoten(g);
	      
      
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
        System.out.println("----------------------------------------------------------");
      
        dkm.berechneWeg();
	}

}
