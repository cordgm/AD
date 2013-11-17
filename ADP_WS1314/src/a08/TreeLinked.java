package a08;

/**
 * 
 * @author Cord
 *
 * @param <T>
 */
public class TreeLinked<T> implements ITree<T> {
	
	//Attribute
	Tree<T> tree;
	Node<T> wurzel;
	
    public TreeLinked() {
		super();
		tree = new Tree<T>();
		wurzel = tree.wurzel;
	}

	@Override
    public boolean insert(Node<T> node) {
		if(node != null){
			wurzel.insert(node.getDaten(), node.getKey());
	    	return true;
		}else{
			return false;
		}
    	
    }
	
	public boolean exists(int k) {
		return wurzel.exists(k);
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
