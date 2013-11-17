package a08;

public class TreeArray<T> implements ITree<T> {

    private Node[] binaryTree;
    private int N; //Maximale Größe des Arrays
    
    /**
     * 
     */
    public TreeArray(int N) {
        super();
        this.binaryTree = (Node[]) new Object[N];
    }

    @Override
    public boolean insert(Node<T> node ) {
        int n = 0; 
        Node<T> tmpNode = node; 
        
        if( node.getKey() == binaryTree[n].getKey() ) return true;
        else {
            
        }
        
        return true;
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
 
        
    

}
