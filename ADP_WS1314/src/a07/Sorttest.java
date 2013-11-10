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
    private void quickSort3_rec(int links, int rechts) {
        aufwandZaehler++;
        
        int pivot = daten[(((int)(Math.random()*(rechts - links))) + links)].hashCode();
        
        int i = partition(pivot, links, rechts);
        
        if (links < i - 1)
            quickSort3_rec(links, i - 1);
        if (i < rechts)
            quickSort3_rec(i, rechts);
    }
    
    public void quickSort3() {
        quickSort3_rec(0, daten.length-1);
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
        int konstanterSchwellwert = 25;
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
            while( daten[++i].hashCode() < daten[r].hashCode() ){  aufwandZaehler++; };
            while( daten[--j].hashCode() > daten[r].hashCode() ){  aufwandZaehler++; };
            
            if(i >= j) break;
            tmp = daten[i]; daten[i]=daten[j]; daten[j]=tmp;
          }
          tmp=daten[i]; daten[i]=daten[r]; daten[r]=tmp;

          quick_Insertion_rec( l, i-1);
          quick_Insertion_rec( i+1, r);
          
        } else { //insertion sort
          for(i=l+1; i<=r; ++i){
            tmp=daten[i];
            for(j=i-1; j>=l && tmp.hashCode() < daten[j].hashCode(); --j)
              daten[j+1]=daten[j];
            daten[j+1]=tmp;
          }
        }
       }
    }
    
    public void quick_Insertion() {
        quick_Insertion_rec(0, daten.length-1);
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
