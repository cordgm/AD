package a08;

public class TestFrame {
	static int wurzel = 4;

    public static void main(String[] args) {

    	Node<Element> wurzelNode = new Node<Element>(new Element(wurzel), wurzel, null, null, null);
    	ITree<Element> treeLinked = new TreeLinked<Element>(wurzelNode);
    	Node<Element> node;
    	for(int i=0; i < 9; i++){
    		if(i==wurzel){
    			i++;
    		}
    		node = new Node<Element>(new Element(i), i, null, null, null);
    		treeLinked.insert(node);
    	}
    	treeLinked.inorder(wurzelNode);
    	System.out.println();
    	treeLinked.preorder(wurzelNode);
    	System.out.println();
    	treeLinked.postorder(wurzelNode);
    	System.out.println();

    }

}
