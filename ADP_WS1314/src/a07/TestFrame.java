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
        
        //Für den verbesserten- Quicksort-Algorithmus 3-Median
        Sorttest<ListElement> quickSort_QI_upCount100   = new Sorttest<ListElement> ( upCount(N)   );
        Sorttest<ListElement> quickSort_QI_downCount100 = new Sorttest<ListElement> ( downCount(N) );
        Sorttest<ListElement> quickSort_QI_avg100       = new Sorttest<ListElement> ( avgCase(N)   );
    
        //Für den verbesserten- Quicksort-Algorithmus Rechts-Pivot //15,
        Sorttest<ListElement> quickSort_QI_R_upCount100   = new Sorttest<ListElement> ( upCount(N)   );
        Sorttest<ListElement> quickSort_QI_R_downCount100 = new Sorttest<ListElement> ( downCount(N) );
        Sorttest<ListElement> quickSort_QI_R_avg100       = new Sorttest<ListElement> ( avgCase(N)   );
        
        //Für den verbesserten- Quicksort-Algorithmus Rechts-Pivot //15,
        Sorttest<ListElement> quickSort_QI_Random_upCount100   = new Sorttest<ListElement> ( upCount(N)   );
        Sorttest<ListElement> quickSort_QI_Random_downCount100 = new Sorttest<ListElement> ( downCount(N) );
        Sorttest<ListElement> quickSort_QI_Random_avg100       = new Sorttest<ListElement> ( avgCase(N)   );
        
        

        /************** Der Aufruf der Algorithmen **************/
        //AVG 100
        System.out.print("\nAvgCount\n---------\n");
        quickSort_R_avg100.quickSort_R(); //Zufall
        quickSort_R_avg100.showAufwand();
        
        quickSort_3M_avg100.quickSort_3M(); //3-Median
        quickSort_3M_avg100.showAufwand();
        
        quickSort_QI_avg100.quick_Insertion();//Quick_Insertion
        quickSort_QI_avg100.showAufwand();
        
//        quickSort_QI_R_avg100.quick_Insertsort_Rechts();//Quick_Insertion Rechts-Pivot
//        quickSort_QI_R_avg100.showAufwand();
        
        quickSort_QI_Random_avg100.quick_Insertion_R();//Quick_Insertion Random
        quickSort_QI_Random_avg100.showAufwand();
        
        //UPTO 100
        System.out.print("\nUpCount\n---------\n");
        quickSort_R_upCount100.quickSort_R(); //Zufall
        quickSort_R_upCount100.showAufwand();
        
        quickSort_3M_upCount100.quickSort_3M(); //3-Median
        quickSort_3M_upCount100.showAufwand();
        
        quickSort_QI_upCount100.quick_Insertion();//Quick_Insertion
        quickSort_QI_upCount100.showAufwand();
       
//        quickSort_QI_R_upCount100.quick_Insertsort_Rechts();//Quick_Insertion Rechts-Pivot
//        quickSort_QI_R_upCount100.showAufwand();
        
        quickSort_QI_Random_upCount100.quick_Insertion_R();//Quick_Insertion Random
        quickSort_QI_Random_upCount100.showAufwand();
        
        //DOWNTO 100
        System.out.print("\nDownCount\n---------\n");
        quickSort_R_downCount100.quickSort_R(); //Zufall
        quickSort_R_downCount100.showAufwand();
        
        quickSort_3M_downCount100.quickSort_3M(); //3-Median
        quickSort_3M_downCount100.showAufwand();
        
        quickSort_QI_downCount100.quick_Insertion(); //Quick_Insertion
        quickSort_QI_downCount100.showAufwand();
        
//        quickSort_QI_R_downCount100.quick_Insertsort_Rechts(); //Quick_Insertion Rechts-Pivot
//        quickSort_QI_R_downCount100.showAufwand();
        
        quickSort_QI_Random_downCount100.quick_Insertion_R();//Quick_Insertion Random
        quickSort_QI_Random_downCount100.showAufwand();
        
    }

    
    
    private static ListElement[] upCount(int n) {
    	long min = 700*n;
        //Best Case
        listElements = new ListElement[n];
        for(int i = 0; i<n; i++) {
                listElements[i] = new ListElement(i+min);
        }
        
        return listElements;
    }
    
    private static ListElement[] downCount(int n){
    	long min = 700*n;
        //worst Case
        listElements = new ListElement[n];
        for(int i = 0, j = n-1; i<n; i++, j--){
            listElements[i] = new ListElement(j+min);
        }
        return listElements;
    }
    
    private static ListElement[] avgCase(int n){
    	long min = 700*n;
    	long max = 800*n;
        //worst Case
        listElements = new ListElement[n];
        for(int i = 0; i<n; i++){
            listElements[i] = new ListElement(min+(int)(Math.random()*max));
        }
        return listElements;
    }
}
