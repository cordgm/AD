package a06;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 * @version 0
 * @param <T>
 */
public class QuickSort<T> {
	
	//Attribute
	private T[] daten;
	private int aufwandZaehler;

	//Konstruktor
	public QuickSort(T[] array) {
		this.daten = array;
		this.aufwandZaehler = 0;
	}
	
	public void quickSort1(int links, int rechts) {
	    int pivot, i, j;
        T t; 
	    
	    if(rechts > links) {
	        
	        //Das am weitesten rechts stehende Element wird als Pivot gewählt
	        pivot = daten[rechts].hashCode(); 
	        //Initialiserung der Indicies im Array
	        i = links-1;
	        j = rechts;
	        for( ; ; ) {
	            //Hier wird solange von links nach rechts marschiert, bis man auf ein Element stößt, das größer als das Pivot ist.
	            while( daten[++i].hashCode() < pivot ) 
	                ;
	               //Hier wird solange von rechts nach linbks marschiert, bis man auf ein Element stößt, das kleiner ist als das Pivot ist.
	            while( (j>i) && ( daten[--j].hashCode() > pivot ) )
	                ;
	            //Wenn die While überienander hinweggelaufen sind-> Schleife beeenden
	            if(i >= j)
	                break;
	            
	         //Die blockierende Elemente werden vertauscht, und die wanderungen wird fortgesetzt
	         swap(i ,j);
	        }//for
	        swap(i, rechts);
        
        /* i ist der Index des Pivot */
        quickSort1( links, i-1 );
        quickSort1( i+1, rechts );
	    
	    }//if
	}
	
	public void quickSort2(){
		
	}
	
	public void quickSort3(){
		
	}
	
	private void swap(int i, int j){
       T tmp = this.daten[i];
       daten[i] = daten[j];
       daten[j] = tmp;
   }

	public T[] getArray() {
		return daten;
	}

}
