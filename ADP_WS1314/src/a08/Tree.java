package a08;

public class Tree<T> {

	//Attribute
    private Node<T> wurzel;

//	public Tree() {
//		super();
//		wurzel = new Node<T>(null, 0, null, null, null);
//	}
//	
//	public Tree(int w) {
//		super();
//		wurzel = new Node<T>(null, w, null, null, null);
//	}
	
    /**
     * Der Konstruktor bekommt den Wurzel-Node uebergeben.
     * @param wurzelNode Wurzel-Node
     */
	public Tree(Node<T> wurzelNode) {
		super();
		wurzel = wurzelNode;
	}
}
