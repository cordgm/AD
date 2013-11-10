package a07;

import a06.ListElement;
import a06.QuickSort;

public class TestFrame {
    
    static ListElement[] listElements;
    
    public static void main(String[] args) {
        
        /* Die Variablen zum Testen */
        
        //Für den normalen Quciksort-Algorithmus
        Sorttest<ListElement> quickSort_upCount10   = new Sorttest<ListElement> ( upCount(10)   );
        Sorttest<ListElement> quickSort_downCount10 = new Sorttest<ListElement> ( downCount(10) );
        Sorttest<ListElement> quickSort_avg10       = new Sorttest<ListElement> ( avgCase(10)   );
    
       //Für den verbesserten Quciksort-Algorithmus
        Sorttest<ListElement> quick_InsSort_upCount10   = new Sorttest<ListElement> ( upCount(10)   );
        Sorttest<ListElement> quick_InsSort_downCount10 = new Sorttest<ListElement> ( downCount(10) );
        Sorttest<ListElement> quick_InsSort_avg10       = new Sorttest<ListElement> ( avgCase(10)   );
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
