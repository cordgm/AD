package a08;

public class TreeArray<T> implements ITree<T> {
    
    private  int N; //Maximale Größe des Arrays
    private  int DEFAULT_ARRAY_GROESSE = N * 2;
    
    private Node[] binaryTree;
   // Tree<T> tree;
   
    

    /**
     * 
     */
//    public TreeArray() {
//        this(DEFAULT_ARRAY_GROESSE);
//    }
    
    /**
     * @param N
     */
    public TreeArray(int N) {
        super();
        this.N = N; 
        this.binaryTree = (Node[]) new Object[N];
    }
    

    @Override
    public boolean insert(Node<T> node ) {
        int n = 1; 
        Node<T> tmpNode = node; 
        
        if( node.getKey() == binaryTree[n].getKey() ) return true;
        
        else {
            
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
                binaryTree[n/2].setRechts(node); // [n/2]
            } else if (n % 2 == 0 && n / 2 > 0) {
                binaryTree[n/2].setLinks(node); // [n/2]
            }
        }
        
        return true;
    }

    /**
     * @param n2
     * @return
     */
    private int increase(int n2) {
     
        
        Node[] hilfsBinaryTree = (Node[]) new Object[N + 
                                                          DEFAULT_ARRAY_GROESSE];
        
        /* Zeiger auf binaryTreeeinträge kopieren */
        System.arraycopy(binaryTree, 0, hilfsBinaryTree, 0, binaryTree.length);
        
        /* Objektvariable binaryTree das neue Array zuweisen */
        binaryTree = hilfsBinaryTree;
        System.out.println("binaryTree vergößert auf " +
                                                       binaryTree.length);
        
       return (n2%2==0) ? (n2*2) : ((n2*2)+1);
        
    }

    @Override
    public void inorder(Node<T> vater) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void preorder(Node<T> vater) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void postorder(Node<T> vater) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getLinkerSohn(int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getRechterSohn(int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Node<T> getVater(int n) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean exists(int i) {
        // TODO Auto-generated method stub
        return false;
    }
 
        
    

}
