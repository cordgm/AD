package a08;

public class TestFrame {
	final static int wurzel = 10;
	final static int anzahlNodes = 20;
	private final static int N = 10;

    public static void main(String[] args) {

//    	Node<Element> wurzelNode = new Node<Element>(new Element(wurzel), wurzel, null, null, null);
//    	ITree<Element> treeLinked = new TreeLinked<Element>(wurzelNode);
//    	Node<Element> node;
//    	for(int i=0; i < anzahlNodes; i++){
//    		if(i==wurzel){i++;}
//    		node = new Node<Element>(new Element(i), i, null, null, null);
//    		treeLinked.insert(node);
//    	}
//    	treeLinked.inorder(wurzelNode);
//    	System.out.println();
//    	treeLinked.preorder(wurzelNode);
//    	System.out.println();
//    	treeLinked.postorder(wurzelNode);
//    	System.out.println();

    	
	   int datensatz = (int) (Math.random() * 100 + 1);
       
       Node<Element> data_one = new Node<Element>(new Element(datensatz), datensatz, null, null, null); //1. Datensatz
       
      ITree<Element> treeArray = new TreeArray<Element>(N);
    }

}
