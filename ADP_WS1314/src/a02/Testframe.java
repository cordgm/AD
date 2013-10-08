package a02;



/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class Testframe {

	public static void main(String[] args) {
		
		//************* Stack Test ********************
		System.out.println("************* Start Test Stack: *************");
		int stackLength = 10;
		Stack<Integer> stack = new Stack<Integer>(stackLength);
		
		for(int i = 0; i < stackLength; i++){
			stack.pushtail(i);
		}
		
		for(int i = 0; i < stackLength; i++){
			System.out.print(stack.top() + " ");
			stack.poptail();
		}
		System.out.println("\n************* End Test Stack: *************\n");
		//************* End Stack Test ****************

		//************* Start 2 Algo Stack Test ****************
		ZweiStackAlgo zweiStackAlgo = new ZweiStackAlgo("(1+1)");
		int result = zweiStackAlgo.auswertung();
		System.out.println("************* Start 2 Algo Stack: *************");
		zweiStackAlgo = new ZweiStackAlgo("(1+1)");
		result = zweiStackAlgo.auswertung();
		System.out.println("(1+1) = " + result);
		System.out.println("benötigte Zeit " + zweiStackAlgo.getCalcTime() + " ns\n");
		
		zweiStackAlgo = new ZweiStackAlgo("(6*(4*28))");
		result = zweiStackAlgo.auswertung();
		System.out.println("(6*(4*28)) = " + result);
		System.out.println("benötigte Zeit " + zweiStackAlgo.getCalcTime() + " ns\n");
		
		zweiStackAlgo = new ZweiStackAlgo("((6*(4*98))+(9-7))");
		result = zweiStackAlgo.auswertung();
		System.out.println("((6*(4*98))+(9-7)) = " + result);
		System.out.println("benötigte Zeit " + zweiStackAlgo.getCalcTime() + " ns\n");
		
		zweiStackAlgo = new ZweiStackAlgo("((6*(4*28))+(9-((12/4)*2)))");
		result = zweiStackAlgo.auswertung();
		System.out.println("((6*(4*28))+(9-((12/4)*2))) = " + result);
		System.out.println("benötigte Zeit " + zweiStackAlgo.getCalcTime() + " ns\n");
		
		zweiStackAlgo = new ZweiStackAlgo("(((6*(4*28))+(9-(((((12/4)+4)/99)*99999)*2)))/104)");
		result = zweiStackAlgo.auswertung();
		System.out.println("(((6*(4*28))+(9-(((((12/4)+4)/99)*99999)*2)))/104) = " + result);
		System.out.println("benötigte Zeit " + zweiStackAlgo.getCalcTime() + " ns");
		System.out.println("************* End 2 Algo Stack *************");
		//************* End 2 Algo Stack Test ****************
		

		//************* Start 2 Algo Stack Test ****************
		System.out.println("************* Start 2 Algo Stack: *************");
	    zweiStackAlgo = new ZweiStackAlgo("(1+1)");
		result = zweiStackAlgo.auswertung();
		System.out.println("(1+1) = " + result);
		System.out.println("benötigte Zeit " + zweiStackAlgo.getCalcTime() + " ns\n");
		
		zweiStackAlgo = new ZweiStackAlgo("1+(1+1))");
		result = zweiStackAlgo.auswertung();
		System.out.println("1+(1+1)) = " + result);
		System.out.println("benötigte Zeit " + zweiStackAlgo.getCalcTime() + " ns\n");
		
		zweiStackAlgo = new ZweiStackAlgo("((1+(1+1))+(1+1))");
		result = zweiStackAlgo.auswertung();
		System.out.println("((1+(1+1))+(1+1)) = " + result);
		System.out.println("benötigte Zeit " + zweiStackAlgo.getCalcTime() + " ns\n");
		
		zweiStackAlgo = new ZweiStackAlgo("((1+(1+1))+(1+((1+1)+1)))");
		result = zweiStackAlgo.auswertung();
		System.out.println("((1+(1+1))+(1-((1+1)+1))) = " + result);
		System.out.println("benötigte Zeit " + zweiStackAlgo.getCalcTime() + " ns\n");
		
		zweiStackAlgo = new ZweiStackAlgo("(((1+(1+1))+(1+(((((1+1)+1)+1)+1)+1)))+1)");
		result = zweiStackAlgo.auswertung();
		System.out.println("(((1+(1+1))+(1+(((((1+1)+1)+1)+1)+1)))+1) = " + result);
		System.out.println("benötigte Zeit " + zweiStackAlgo.getCalcTime() + " ns");
		System.out.println("************* End 2 Algo Stack *************");
		//************* End 2 Algo Stack Test ****************
		
		

		
		//************* QueueListen Test ********************
        
//		 List<ListenQueue<Integer>> list = new List<ListenQueue<Integer>>();
//	     int N = 20;
//	        
//	        //EINFÜGEN
//	     for(int i = 0; i < N; i++) {
//             int q = (int)((Math.random()*20)+1);
//             int p = (int) (Math.random()*Integer.MAX_VALUE);
//             
//             if(list.retrieve(list.get(q)) == null){
//                     ListenQueue<Integer> tmpQ = new ListenQueue<Integer>();
//                     tmpQ.enqueu(p);
//                     list.insert(list.getTail(), tmpQ);
//             }else{
//                     list.retrieve(list.get(q)).enqueu(p);
//             }  
//	     }
//	        
//	       // list.showAll();
//	        
//	        //LÖSCHEN
//	        for(int i = 0; i < N; i++){
//	                int delete = (int)((Math.random()*20)+1);
//	                ListenQueue<Integer> tmpQ = list.retrieve(list.get(delete));
//	                if(tmpQ != null){
//	                        if(tmpQ.getSize() > 0) {
//	                                list.retrieve(list.get(delete)).dequeue();
//	                                if(tmpQ.getSize() == 0) {   
//	                                        /*
//	                                         * Falls in der äußeren Schleife gerade das letzte Elem gelöscht wurde,
//	                                         * damit keine leeren Queues übrig bleiben!
//	                                         */
//	                                       list.delete(list.get(delete)); 
//	                                }
//	                        }
//	                }
//	        }
//	        
//	        //AUSGEBEN
//	        for(int i = 0; i < list.getSize(); i++){
//	                System.out.println("\n\nQueue No.: " + i);
//	                list.retrieve(list.get(i)).showAll();
//	        }
	        
        //************* End QueueListen Test ********************
		
	}

}
