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
