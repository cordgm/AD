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
        
        Node<T> tmpNode; 
        tmpNode.setDaten(daten);
        tmpNode.setKey(key);
        
        
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
