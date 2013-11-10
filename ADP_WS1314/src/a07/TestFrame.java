package a07;

import a06.ListElement;
import a06.QuickSort;

public class TestFrame {
    
    static ListElement[] listElements;
    static int N = 1000000; 
    
    public static void main(String[] args) {
        
        /* Die Variablen zum Testen */
        
        //Für den Zufalls- Quicksort-Algorithmus
        Sorttest<ListElement> quickSort_R_upCount100   = new Sorttest<ListElement> ( upCount(N)   );
        Sorttest<ListElement> quickSort_R_downCount100 = new Sorttest<ListElement> ( downCount(N) );
        Sorttest<ListElement> quickSort_R_avg100       = new Sorttest<ListElement> ( avgCase(N)   );
    
        //Für den 3-Median- Quicksort-Algorithmus
        Sorttest<ListElement> quickSort_3M_upCount100   = new Sorttest<ListElement> ( upCount(N)   );
        Sorttest<ListElement> quickSort_3M_downCount100 = new Sorttest<ListElement> ( downCount(N) );
        Sorttest<ListElement> quickSort_3M_avg100       = new Sorttest<ListElement> ( avgCase(N)   );
        
        //Für den verbesserten- Quicksort-Algorithmus
        Sorttest<ListElement> quickSort_QI_upCount100   = new Sorttest<ListElement> ( upCount(N)   );
        Sorttest<ListElement> quickSort_QI_downCount100 = new Sorttest<ListElement> ( downCount(N) );
        Sorttest<ListElement> quickSort_QI_avg100       = new Sorttest<ListElement> ( avgCase(N)   );
    
    
        /************** Der Aufruf der Algorithmen **************/
        //AVG 100
        System.out.print("\nAvgCount\n---------\n");
        quickSort_R_avg100.quickSort3(); //Zufall
        quickSort_R_avg100.showAufwand();
        
        quickSort_3M_avg100.quickSort2(); //3-Median
        quickSort_3M_avg100.showAufwand();
        
        quickSort_QI_avg100.quick_Insertion();//Quick_Insertion
        quickSort_QI_avg100.showAufwand();
        
        //UPTO 100
        System.out.print("\nUpCount\n---------\n");
        quickSort_R_upCount100.quickSort3(); //Zufall
        quickSort_R_upCount100.showAufwand();
        
        quickSort_3M_upCount100.quickSort2(); //3-Median
        quickSort_3M_upCount100.showAufwand();
        
        quickSort_QI_upCount100.quick_Insertion();//Quick_Insertion
        quickSort_QI_upCount100.showAufwand();
       
        //DOWNTO 100
        System.out.print("\nDownCount\n---------\n");
        quickSort_R_downCount100.quickSort3(); //Zufall
        quickSort_R_downCount100.showAufwand();
        
        quickSort_3M_downCount100.quickSort2(); //3-Median
        quickSort_3M_downCount100.showAufwand();
        
        quickSort_QI_downCount100.quick_Insertion(); //Quick_Insertion
        quickSort_QI_downCount100.showAufwand();
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
