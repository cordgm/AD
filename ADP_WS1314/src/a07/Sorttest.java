package a07;
/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 * @version 0
 * @param <T>
 */

public class Sorttest<T> {

    
    //Attribute
    private T[] daten;
    private long aufwandZaehler;
    private static final int konstanterSchwellwert = 20;

    //Konstruktor
    public Sorttest(T[] array) {
        this.daten = array;
        this.aufwandZaehler = 0;
    }
    
    /**
     * QuickSort nach der Zufalls-Strategie
     * @param links
     * @param rechts
     */
    private void quickSort_R_rec(int links, int rechts) {
        aufwandZaehler++;
        
        int pivot = daten[(((int)(Math.random()*(rechts - links))) + links)].hashCode();
        
        int i = partition(pivot, links, rechts);
        
        if (links < i - 1)
            quickSort_R_rec(links, i - 1);
        if (i < rechts)
            quickSort_R_rec(i, rechts);
    }
    
    /**
     * QuickSort nach der 3-Median-Strategie
     * @param links
     * @param rechts
     */
    private void quickSort_3M_rec(int links, int rechts){
        aufwandZaehler++;
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
            
            quickSort_3M_rec(links, i-1);    //sortiere kleinere Elemente
            quickSort_3M_rec(i+1, rechts);   //sortiere groessere Elemente
        }
    }
    
    public void manualSort(int links, int rechts) {
        aufwandZaehler++;
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
    
    public void quickSort_3M() {
        quickSort_3M_rec(0, daten.length-1);
    }
    
    public void quickSort_R() {
        quickSort_R_rec(0, daten.length-1);
    }
    
    public void quick_Insertsort_Rechts() {
        qsort_ins_Rechts(0, daten.length-1);
    }
    
    /**
     * Der verbesserte Quicksort. 
     * Durch die Behandlung kleiner Teilfelder mit Insertionsort. 
     *  
     * http://www.linux-related.de/coding/alg_quicksort.htm
     * http://www.linux-related.de/coding/sort/sort_quick.htm
     * 
     * @param links
     * @param rechts
     */
    private void quick_Insertion_rec(int l, int r) {
        
        int i=l-1, j=r; 
        T tmp;      
        aufwandZaehler++;
        //Median of three
        if(r>l) {
            if(r-l > 3) { 
              int m=l+(r-l)/2;
              
              if(daten[l].hashCode() > daten[m].hashCode()) { 
                  tmp=daten[l]; daten[l]=daten[m]; daten[m]=tmp; 
              }
              
              if( daten[l].hashCode() > daten[r].hashCode() ) { 
                  tmp=daten[l]; daten[l]=daten[r]; daten[r]=tmp; 
              } else if(daten[r].hashCode() > daten[m].hashCode()) { 
                  tmp=daten[r]; daten[r]=daten[m]; daten[m]=tmp; 
              }
         }
        //end of Median of three
            
        if(r-l > konstanterSchwellwert){ //Quicksort
		  i=l-1; j=r;
		  for(;;){
        	  aufwandZaehler++;
        	  while( daten[++i].hashCode() < daten[r].hashCode() ){  aufwandZaehler++; };
        	  while( daten[--j].hashCode() > daten[r].hashCode() ){  aufwandZaehler++; };
            
        	  if(i >= j) break;
        	  tmp = daten[i]; daten[i]=daten[j]; daten[j]=tmp;
          }
          tmp=daten[i]; daten[i]=daten[r]; daten[r]=tmp;

          quick_Insertion_rec( l, i-1);
          quick_Insertion_rec( i+1, r);
          
        } else { //insertion sort
          for(i=l+1; i<=r; ++i ){
              aufwandZaehler++;
            tmp=daten[i];
            for(j=i-1; j>=l && tmp.hashCode() < daten[j].hashCode(); --j, aufwandZaehler++)
              daten[j+1]=daten[j];
            daten[j+1]=tmp;
          }
        }
       }
    }
    
    public void quick_Insertion() {
        quick_Insertion_rec(0, daten.length-1);
    }
    
    public void quick_Insertion_R() {
        quick_Insertion_Random(0, daten.length-1);
    }

    
    /**
     * QuickSort nach der ganz Rechts Strategie.
     * @param links
     * @param rechts
     */
    private void qsort_ins_Rechts(int l, int r) {
        aufwandZaehler++;
        int i, j;
        T tmp;
        if(r-l > konstanterSchwellwert){ //Quicksort
          i=l-1; j=r;
          for(;;){
              aufwandZaehler++;
            while(daten[++i].hashCode() < daten[r].hashCode() ) { aufwandZaehler++; };
            while(daten[--j].hashCode() > daten[r].hashCode() ) { aufwandZaehler++; };
          
            
            if(i>=j) break;
            tmp=daten[i]; daten[i]=daten[j]; daten[j]=tmp;
          }
          tmp=daten[i]; daten[i]=daten[r]; daten[r]=tmp;

          qsort_ins_Rechts(l, i-1);
          qsort_ins_Rechts(i+1, r);
        }
        else{ //insertion sort
          for(i=l+1; i<=r; ++i){
            aufwandZaehler++;
            tmp=daten[i];
            for(j=i-1; j>=l && tmp.hashCode() < daten[j].hashCode(); --j, aufwandZaehler++)
              daten[j+1]=daten[j];
            daten[j+1]=tmp;
          }
        }
      }
    
    /**
     * QuickSort Insertion Sort nach der Zufalls-Strategie
     * @param links
     * @param rechts
     */
    private void quick_Insertion_Random(int l, int r){
        aufwandZaehler++;
        
        int pivot = daten[(((int)(Math.random()*(r - l))) + l)].hashCode();
        aufwandZaehler++;
        int i, j;
        T tmp;
        if(r-l > konstanterSchwellwert){ //Quicksort
          i=l-1; j=r;
          for(;;){
              aufwandZaehler++;
            while(daten[++i].hashCode() < pivot ) { aufwandZaehler++; };
            while(daten[--j].hashCode() > pivot ) { aufwandZaehler++; };
          
            
            if(i>=j) break;
            tmp=daten[i]; daten[i]=daten[j]; daten[j]=tmp;
          }
          tmp=daten[i]; daten[i]=daten[r]; daten[r]=tmp;

          quick_Insertion_Random(l, i-1);
          quick_Insertion_Random(i+1, r);
        }
        else{ //insertion sort
          for(i=l+1; i<=r; ++i){
            aufwandZaehler++;
            tmp=daten[i];
            for(j=i-1; j>=l && tmp.hashCode() < daten[j].hashCode(); --j, aufwandZaehler++)
              daten[j+1]=daten[j];
            daten[j+1]=tmp;
          }
        }
    }
    
    
    public int partition(int pivot, int links, int rechts) {
        //Initialiserung der Indices im Array
        int i = links, j = rechts;
        while (true) {
            aufwandZaehler++;
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
    
    public int partition1(int pivot, int links, int rechts){
        //Initialiserung der Indices im Array
        int i = links, j = rechts;
        while(true) {
            aufwandZaehler++;
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
    
    private void swap(int i, int j) {
        T tmp = this.daten[i];
        daten[i] = daten[j];
        daten[j] = tmp;
//        aufwandZaehler += 3;
    }
    
    public T[] getArray() {
        return daten;
    }
    
    public void showDaten(){
        for(int i = 0; i < daten.length; i++) {
            System.out.print(daten[i]);
        }
        System.out.println();
    }
    
    public void showAufwand() {
        System.out.printf("Aufwand für %5d Elemente: %8d\n", daten.length, aufwandZaehler);
    }

    
}
