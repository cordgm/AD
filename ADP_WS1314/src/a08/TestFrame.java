package a08;

public class TestFrame {
    
	final static int wurzel = 10;
	final static int anzahlNodes = 20;
	private final static int N = 10;
	private final static int AUSWAHL = 2; //1=inorder or 2=preorder or 3=postorder

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

    	
	 //  int datensatz = (int) (Math.random() * 100 + 1); System.out.println("Datensatz: "+ datensatz);
     //  Node<Element> n1 = new Node<Element>(new Element(datensatz), datensatz, null, null, null); //1. Datensatz
        // treeArray.insert(n1); 
        
       ITree<Element> treeArray = new TreeArray<Element>(N);
       Node<Element> node;
       
       for(int i=1; i <= N; i++) {
           
         node = new Node<Element>(new Element(i), i, null, null, null);
         treeArray.insert(node);
      }
      
       switch( AUSWAHL ) {
           case (1):   treeArray.inorder  ( new Node<Element>( new Element(1), 1, null, null, null) ); 
               break;
               
           case (2):   treeArray.preorder ( new Node<Element>( new Element(1), 1, null, null, null) );
               break; 
           
           case (3):   treeArray.postorder( new Node<Element>( new Element(1), 1, null, null, null) );
               break;

          
       }
           
    }  
}
