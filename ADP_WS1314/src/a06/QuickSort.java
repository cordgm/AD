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
	
	/**
	 * QuickSort mit dem am weitest rechts stehenden Element als Pivot
	 * @param links
	 * @param rechts
	 */
	public void quickSort1(int links, int rechts) {
	    int pivot, i;
	    
	    if(rechts > links) {
	        
	        //Das am weitesten rechts stehende Element wird als Pivot gewählt
	        pivot = daten[rechts].hashCode(); 

	        //beginne Partitionierung
	        i = partition1(pivot, links-1, rechts);
	        
	        //Pivotelement in die Mitte tauschen
	        swap(i, rechts);
	        aufwandZaehler++;
        
	        /* i ist der Index des Pivot */
	        quickSort1( links, i-1 );
	        quickSort1( i+1, rechts );
	    
	    }//if
	}
	
	/**
	 * QuickSort nach der 3-Median-Strategie
	 * @param links
	 * @param rechts
	 */
	public void quickSort2(int links, int rechts){
		if(rechts-links+1 <= 3){
			manualSort(links, rechts);
		}else {
            //sortiere links, mitte, rechts
            int mitte = (links + rechts)/2;
            if(daten[mitte].hashCode() < (daten[links].hashCode()) )
                swap(links, mitte);
            if(daten[rechts].hashCode() < (daten[links].hashCode()))
                swap(links, rechts);
            if(daten[rechts].hashCode() < (daten[mitte].hashCode()))
                swap(mitte, rechts);
            
            //platziere pivot nach rechts-1
            swap(mitte, rechts-1);
            int pivot = daten[rechts-1].hashCode();
            
            //beginne Partitionierung
            int i = partition1(pivot, links, rechts-1);
            
            //pivot wiederherstellen
            swap(i, rechts-1);
            
            quickSort2(links, i-1);    //sortiere kleinere Elemente
            quickSort2(i+1, rechts);   //sortiere groessere Elemente
        }
	}
	
	public void manualSort(int links, int rechts) {
		int size = rechts-links+1;
		if (size <= 1) //bei 1 Element nicht sortieren
			return;
		if (size == 2) { //bei 2 Elemten link und rechts sortieren
			if (daten[links].hashCode() > daten[rechts].hashCode())
				swap(links, rechts);
			return;
		}else{ //bei 3 Elementen links, mitte und rechts sortieren
			if(daten[links].hashCode() > daten[rechts - 1].hashCode())
				swap(links, rechts-1);  // links, mitte
			if(daten[links].hashCode() > daten[rechts].hashCode())
				swap(links, rechts);    // links, rechts
			if(daten[rechts-1].hashCode() > daten[rechts].hashCode())
				swap(rechts-1, rechts); // mitte, rechts
	    }
	}
	
//	private void insertionSort(int low, int high ) {
//        for(int p = low + 1; p <= high; p++) {
//            T tmp = daten[p];
//            int j;
//            
//            for(j = p; j > low && tmp.hashCode() < (daten[j - 1].hashCode()); j--)
//                daten[j] = daten[j-1];
//            daten[j] = tmp;
//        }
//    }
	
	/**
	 * QuickSort nach der Zufalls-Strategie
	 * @param links
	 * @param rechts
	 */
	public void quickSort3(int links, int rechts){
		
        int pivot = daten[(((int)(Math.random()*(rechts - links))) + links)].hashCode();
        
        int i = partition(pivot, links, rechts);
        
        if (links < i - 1)
        	quickSort3(links, i - 1);
        if (i < rechts)
            quickSort3(i, rechts);
	}
	

	public int partition1(int pivot, int links, int rechts){
		//Initialiserung der Indices im Array
		int i = links, j = rechts;
		while(true) {
			//Hier wird solange von links nach rechts marschiert, bis man auf ein Element stoesst, das groesser als das Pivot ist.
            while(daten[++i].hashCode() < pivot)
            	aufwandZaehler++;
            //Hier wird solange von rechts nach links marschiert, bis man auf ein Element stoesst, das kleiner ist als das Pivot.
            while((j>i) && (daten[--j].hashCode() > pivot))
            	aufwandZaehler++;
            //Wenn die While übereinander hinweggelaufen sind -> Schleife beeenden
            if(i >= j)
                break;
            //Die blockierenden Elemente werden vertauscht, und die Wanderungen wird fortgesetzt
            swap(i, j);
        }
		return i;
	}

	public int partition(int pivot, int links, int rechts){
		//Initialiserung der Indices im Array
        int i = links, j = rechts;
        while (true) {
        	//Hier wird solange von links nach rechts marschiert, bis man auf ein Element stoesst, das groesser als das Pivot ist.
            while (daten[i].hashCode() < pivot){
                i++;
            	aufwandZaehler++;
            }
            //Hier wird solange von rechts nach links marschiert, bis man auf ein Element stoesst, das kleiner ist als das Pivot.
            while (daten[j].hashCode() > pivot){
                j--;
            	aufwandZaehler++;
            }
            if(i <= j){
            	//Die blockierenden Elemente werden vertauscht, und die Wanderungen wird fortgesetzt
                swap(i, j);
                i++;
                j--;
            }
            //Wenn die While übereinander hinweggelaufen sind -> Schleife beeenden
            if(i > j)
                break;
       }
       return i;
    }
	
	private void swap(int i, int j){
       T tmp = this.daten[i];
       daten[i] = daten[j];
       daten[j] = tmp;
       aufwandZaehler += 3;
   }

	public T[] getArray() {
		return daten;
	}
	
	public void showDaten(){
		for(int i = 0; i < daten.length; i++){
            System.out.print(daten[i]);
	    }
	    System.out.println();
	}

}
