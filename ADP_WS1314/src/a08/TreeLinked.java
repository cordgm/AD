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

//    public TreeLinked() {
//		super();
//		this.tree = new Tree<T>();
//		this.wurzel = tree.wurzel;
//	}
//    
//    public TreeLinked(int wurzel) {
//		super();
//		this.tree = new Tree<T>(wurzel);
//		this.wurzel = tree.wurzel;
//	}
    
	/**
	 * Der Konstruktor erwartet ein Wurzel-Node, auf den er den Baum aufsetzen kann.
	 * @param wurzel Der Wurzel-Node.
	 */
    public TreeLinked(Node<T> wurzel) {
		super();
		this.tree = new Tree<T>(wurzel);
		this.wurzel = wurzel;
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
	
	@Override
	public boolean exists(int k) {
		return wurzel.exists(k);
	}

    @Override
    public void inorder(Node<T> vater) {
    	if(vater != null){
    		inorder(vater.getLinks());
    		System.out.print(vater.getDaten());
    		inorder(vater.getRechts());
    	}
    }

    @Override
    public void preorder(Node<T> vater) {
    	if(vater != null){
    		System.out.print(vater.getDaten());
    		preorder(vater.getLinks());
    		preorder(vater.getRechts());
    	}
    }

    @Override
    public void postorder(Node<T> vater) {
    	if(vater != null){
    		postorder(vater.getLinks());
    		postorder(vater.getRechts());
    		System.out.print(vater.getDaten());
    	}
    }

//    @Override
//    public Node<T> getLinkerSohn(Node<T> vater) {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    @Override
//    public Node<T> getRechterSohn(Node<T> vater) {
//        // TODO Auto-generated method stub
//        return vater.getRechts() ;
//    }
//
//    @Override
//    public Node<T> getVater(Node<T> vater) {
//        // TODO Auto-generated method stub
//        return null;
//    }
    
}
