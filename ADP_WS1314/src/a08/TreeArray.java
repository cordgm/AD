package a08;

/**
 * @author Manuel Meyer
 *
 * @param <T>
 */

public class TreeArray<T> implements ITree<T> {
    
    private static final boolean DEBUG = false; //Um Debug Informationen ein,-auschalten zu können. 
    
    private static  int N;                      //Maximale Größe des Arrays    
    private Node<T>[] binaryTree;               //Array von Typ Knoten(Node)

    /**
     * Konstruiert das Objekt.
     * @param N
     */
    public TreeArray(int N) {
        super();
        this.N = N; 
        this.binaryTree = new Node[N];
    }
    

    @Override
    public boolean insert(Node<T> node ) {
    	if(node==null) return false;
    	
        int n = 1; 
        Node<T> tmpNode = node; 
        
        if(binaryTree[n] == null) {
            binaryTree[n] = node;
            
        } else if( node.getKey() == binaryTree[n].getKey() ) {
            return true;           
            
        } else {
        
            
            while( binaryTree[n] != null ) {
                
                if( tmpNode.getKey() < binaryTree[n].getKey() ) { // '<' LINKS
                    
                    n = ( n*2 > N ) ? increase(n) : (n*2); //Sohn zur linken Seite
                    
                } else { // '>' RECHTS
                    
                    n = ( n*2+1 > N ) ? increase(n) : (n*2+1); //Sohn zur Rechten Seite
                    
                } 
            }//End-While

            //INSERT 
            binaryTree[n] = node; //Neuen Knoten hinzufügen
            
            if (n % 2 != 0 && n / 2 > 0) {
                binaryTree[n/2].setRechts(node ); // [n/2]
            } else if (n % 2 == 0 && n / 2 > 0) {
                binaryTree[n/2].setLinks(node ); // [n/2]
            }
        }
        
        return true;
    }

    /**
     * Vergroessert das Array, wenn das Array für die Speicherung zu klein wird.
     * Gibt schnell einen mem-Heap Java Fehler. 
     * UEbergabe der aktuellen Position n im Array. 
     * @param n
     * @return n
     */
    private int increase(int n) {
        
        int DEFAULT_ARRAY_GROESSE = N * 2;
        N = DEFAULT_ARRAY_GROESSE; 
        
        Node[] hilfsBinaryTree = (Node[]) new Node[N + 
                                                          DEFAULT_ARRAY_GROESSE];
        
        /* Zeiger auf binaryTreeeinträge kopieren */
        System.arraycopy(binaryTree, 0, hilfsBinaryTree, 0, binaryTree.length);
        
        /* Objektvariable binaryTree das neue Array zuweisen */
        binaryTree = hilfsBinaryTree;
        
        if (DEBUG) System.out.println("BinaryTree Array vergößert auf " + binaryTree.length);
        
       return ( n%2==0 ) ? ( n*2 ) : ( (n*2)+1 );
        
    }

    @Override
    public void inorder(Node<T> vater) {
        
        if(vater != null) {
            inorder( vater.getLinks() );
            printDump( vater);
            inorder( vater.getRechts() );
           
        }
        
        if(DEBUG) treePrintAll();
        
    }

    @Override
    public void preorder(Node<T> vater) {
        
        if(vater != null) {
                
            printDump( vater);
            preorder( vater.getLinks()  );
            preorder( vater.getRechts() );
        
        }
        
        if(DEBUG) treePrintAll();
    }

    @Override
    public void postorder(Node<T> vater) {
        
       if(vater != null) {
           
           postorder( vater.getLinks()  );
           postorder( vater.getRechts() );
           printDump( vater);
       }
       
       if(DEBUG) treePrintAll();
        
    }

//    @Override
//    public Node<T> getLinkerSohn(Node<T> vater) {
//        //Mit Index Rechnung die Daten bekommen n*2.
//        return vater.getLinks();
//    }
//
//    @Override
//    public  Node<T> getRechterSohn(Node<T> vater) {
//        //Mit Index Rechnung die Daten bekommen n/2.
//        return vater.getRechts();
//    }
//
//    @Override
//    public Node<T> getVater(Node<T> vater) {
//        //Mit Index Rechnung die Daten bekommen n*2+1.
//        return vater.getVater();
//    }

    @Override
    public boolean exists(int i) {
    	
        return binaryTree[1].exists(i);
    }
 
    /****************EIGENE - METHODEN****************/
    
    /**
     * Fuer die Ausgabe auf den Bildschirm/Console. 
     * @param vater
     */
    private void printDump(Node<T> vater) {
        System.out.print( vater.getDaten() );
        
    }

    /**
     * Debug flag muss eingeschaltet werden. 
     * Dann kann man sich das derzeitige Array und deren Besetzung angucken und analysieren. 
     */
    private void treePrintAll() {
        for (int i = 0; i < binaryTree.length; i++) {
            
            if(binaryTree[i] != null) {
                System.out.println("[i = " + i + "] : Daten -> " + binaryTree[i].getDaten() );
            }
        }
    }

}
