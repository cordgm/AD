package a07;

import a06.ListElement;
import a06.QuickSort;

public class TestFrame {
    
    static ListElement[] listElements;
    static int N = 1000000; 
    
    public static void main(String[] args) {
        
        /* Die Variablen zum Testen */
        
        //Für den normalen Quciksort-Algorithmus
        Sorttest<ListElement> quickSort_upCount100   = new Sorttest<ListElement> ( upCount(N)   );
        Sorttest<ListElement> quickSort_downCount100 = new Sorttest<ListElement> ( downCount(N) );
        Sorttest<ListElement> quickSort_avg100       = new Sorttest<ListElement> ( avgCase(N)   );
    
       //Für den verbesserten Quciksort-Algorithmus
        Sorttest<ListElement> quick_InsSort_upCount100   = new Sorttest<ListElement> ( upCount(N)   );
        Sorttest<ListElement> quick_InsSort_downCount100 = new Sorttest<ListElement> ( downCount(N) );
        Sorttest<ListElement> quick_InsSort_avg100       = new Sorttest<ListElement> ( avgCase(N)   );
    
    
        /************** Der Aufruf der Algorithmen **************/
        //AVG 100
        System.out.print("\nAvgCount\n---------\n");
        quickSort_avg100.quickSort3();
        quickSort_avg100.showAufwand();
        
        quick_InsSort_avg100.quick_Insertion();
        quick_InsSort_avg100.showAufwand();
        
        //UPTO 100
        System.out.print("\nUpCount\n---------\n");
        quickSort_upCount100.quickSort3();
        quickSort_upCount100.showAufwand();
        
        quick_InsSort_upCount100.quick_Insertion();
        quick_InsSort_upCount100.showAufwand();
       
        //DOWNTO 100
        System.out.print("\nDownCount\n---------\n");
        quickSort_downCount100.quickSort3();
        quickSort_downCount100.showAufwand();
        
        quick_InsSort_downCount100.quick_Insertion();
        quick_InsSort_downCount100.showAufwand();
    }

    
    
    private static ListElement[] upCount(int n) {
        //Best Case
        listElements = new ListElement[n];
        for(int i = 0; i<n; i++) {
                listElements[i] = new ListElement(i);
        }
        
        return listElements;
    }
    
    private static ListElement[] downCount(int n){
        //worst Case
        listElements = new ListElement[n];
        for(int i = 0, j = n-1; i<n; i++, j--){
            listElements[i] = new ListElement(j);
        }
        return listElements;
    }
    
    private static ListElement[] avgCase(int n){
        //worst Case
        listElements = new ListElement[n];
        for(int i = 0; i<n; i++){
            listElements[i] = new ListElement((int)(Math.random()*1000000));
        }
        return listElements;
    }
}
