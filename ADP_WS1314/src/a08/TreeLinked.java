package a08;

/**
 * 
 * @author Cord
 *
 * @param <T>
 */
public class TreeLinked<T> implements ITree<T> {
	
	//Attribute
	Tree tree = new Tree();
	Node wurzel = tree.wurzel;

    @Override
    public boolean insert(Node<T> node) {
    	if(key == wurzel.key) return false;
    	else
    	{
	    	if(node.key < wurzel.key)
	    	{
		    	if(wurzel.links == null)
		    	{
			    	node.setLinks(node);
			    	return true;
		    	}
		    	else return links.insert(daten, key);
	    	}
	    	else
	    	{
	    	if(rechts == null)
	    	{
	    	rechts = new Knoten<T>(d,k);
	    	return rechts;
	    	}
	    	else return rechts.insert(d,k);
	    	}
    	}
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
