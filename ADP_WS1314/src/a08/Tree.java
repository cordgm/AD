package a08;

public class Tree<T> {

    Node<T> wurzel;

	public Tree() {
		super();
		wurzel = new Node<T>(null, 0, null, null, null);
	}
}
