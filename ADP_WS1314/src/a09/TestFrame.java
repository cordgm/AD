package a09;

/**
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class TestFrame {
    
	final static int wurzel = 10;
	final static int anzahlNodes = 20;
//	private final static int AUSWAHL = 3; //1=inorder or 2=preorder or 3=postorder

    public static void main(String[] args) {

    	
        /***********LINKED EINBETTUNG*****************/
    	System.out.println("************LINKED EINBETTUNG*****************");
    	Node<Element> wurzelNode = new Node<Element>(new Element(wurzel), wurzel, null, null, null);
    	TreeLinked<Element> treeLinked = new TreeLinked<Element>(wurzelNode);
    	Node<Element> node;
    	for(int i=1; i <= anzahlNodes; i++){
    		if(i==wurzel){i++;}
    		node = new Node<Element>(new Element(i), i, null, null, null);
    		treeLinked.insert(node);
    	}
    	
    	/* a09 */
    	treeLinked.summeAllerKleinerenAktualisierenRe(wurzelNode);
    	int zahl = treeLinked.summeZwischen(7, 10);
    	System.out.println("Summe zwischen 7 und 10: " + zahl);
    	zahl = treeLinked.summeZwischen(5, 15);
    	System.out.println("Summe zwischen 5 und 15: " + zahl);
    	zahl = treeLinked.summeZwischen(3, 13);
    	System.out.println("Summe zwischen 3 und 13: " + zahl);
    	zahl = treeLinked.summeZwischen(10, 10);
    	System.out.println("Summe zwischen 10 und 10: " + zahl);
//
//        /****************************ARRAY EINBETTUNG****************************/
//    	
//    	
////	    wurzelNode = new Node<Element>(new Element(wurzel), wurzel, null, null, null); //1. Datensatz
//	    ITree<Element> treeArray = new TreeArray<Element>(anzahlNodes);
//	    treeArray.insert(wurzelNode); 
//        
//
//	    
//       Node<Element> tmpNode; //temp
//       
//       for(int i=1; i <= anzahlNodes; i++) {
//           
//         tmpNode = new Node<Element>(new Element(i), i, null, null, null);
//         treeArray.insert(tmpNode);
//      }
//      
//       switch( AUSWAHL ) {
//           case (1):
//      			treeLinked.inorder(wurzelNode);
//       			System.out.println("\n************ARRAY EINBETTUNG*****************");
//        	   	treeArray.inorder(wurzelNode); 
//       			break;
//               
//           case (2):
//          		treeLinked.preorder(wurzelNode);
//       			System.out.println("\n************ARRAY EINBETTUNG*****************");
//        	   	treeArray.preorder (wurzelNode);
//           		break; 
//           
//           case (3):
//     			treeLinked.postorder(wurzelNode);
//       			System.out.println("\n************ARRAY EINBETTUNG*****************");
//        	   	treeArray.postorder(wurzelNode);
//      			break;
//
//          
//       }
//           
    }  
}
