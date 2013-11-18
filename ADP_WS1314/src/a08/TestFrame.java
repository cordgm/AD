package a08;

public class TestFrame {
    
	final static int wurzel = 10;
	final static int anzahlNodes = 20;
	private final static int AUSWAHL = 3; //1=inorder or 2=preorder or 3=postorder

    public static void main(String[] args) {

    	
        /***********LINKED EINBETTUNG*****************/
    	System.out.println("************LINKED EINBETTUNG*****************");
    	Node<Element> wurzelNode = new Node<Element>(new Element(wurzel), wurzel, null, null, null);
    	ITree<Element> treeLinked = new TreeLinked<Element>(wurzelNode);
    	Node<Element> node;
    	for(int i=1; i <= anzahlNodes; i++){
    		if(i==wurzel){i++;}
    		node = new Node<Element>(new Element(i), i, null, null, null);
    		treeLinked.insert(node);
    	}
//    	treeLinked.inorder(wurzelNode);
//    	System.out.println();
//    	treeLinked.preorder(wurzelNode);
//    	System.out.println();
    	treeLinked.postorder(wurzelNode);
    	System.out.println();

        /********ARRAY EINBETTUNG*****************/
    	System.out.println("************ARRAY EINBETTUNG*****************");
	//    int datensatz = (int) (Math.random() * 100 + 1); System.out.println("Datensatz: "+ datensatz);
    	
//	    wurzelNode = new Node<Element>(new Element(wurzel), wurzel, null, null, null); //1. Datensatz
	    ITree<Element> treeArray = new TreeArray<Element>(anzahlNodes);
	    treeArray.insert(wurzelNode); 
        

	    
       Node<Element> tmpNode; //temp
       
       for(int i=1; i <= anzahlNodes; i++) {
           
         tmpNode = new Node<Element>(new Element(i), i, null, null, null);
         treeArray.insert(tmpNode);
      }
      
       switch( AUSWAHL ) {
           case (1):   treeArray.inorder  (wurzelNode ); 
               break;
               
           case (2):   treeArray.preorder ( wurzelNode );
               break; 
           
           case (3):   treeArray.postorder( wurzelNode );
               break;

          
       }
           
    }  
}
