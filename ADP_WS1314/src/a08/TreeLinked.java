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
    public void insert(Node<T> node) {
    	if(k == key) return this;
    	else
    	{
    	if(k < key)
    	{
    	if(links == null)
    	{
    	links = new Knoten<T>(d,k);
    	return links;
    	}
    	else return links.insert(d, k);
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
