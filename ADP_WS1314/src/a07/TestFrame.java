package a07;


public class TestFrame {
    
    static ListElement[] listElements;
//    static int N = 1000000; 
    
    public static void main(String[] args) {
        int N = 10;
        for(; N<=1000000; N*=10){
        	System.out.println("----------------------------------------------------------------------------");
        	System.out.println(N + " zu sortierenden Objekte");

         
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
	//        long time1 = System.nanoTime();
	        long time1 = System.currentTimeMillis();
	        quickSort_R_avg100.quickSort_R(); //Zufall
	        long time2 = System.currentTimeMillis();
	        System.out.print("Quick-Random:    ");
	        quickSort_R_avg100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	        
	        time1 = System.currentTimeMillis();
	        quickSort_3M_avg100.quickSort_3M(); //3-Median
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-3-Median:  ");
	        quickSort_3M_avg100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	
	        time1 = System.currentTimeMillis();
	        quickSort_QI_avg100.quick_Insertion();//Quick_Insertion
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-Insertion: ");
	        quickSort_QI_avg100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	        
	//        quickSort_QI_R_avg100.quick_Insertsort_Rechts();//Quick_Insertion Rechts-Pivot
	//        quickSort_QI_R_avg100.showAufwand();
	
	        time1 = System.currentTimeMillis();
	        quickSort_QI_Random_avg100.quick_Insertion_R();//Quick_Insertion Random
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-Ins.-Ran.: ");
	        quickSort_QI_Random_avg100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	        
	        //UPTO 100
	        System.out.print("\nUpCount\n---------\n");
	        time1 = System.currentTimeMillis();
	        quickSort_R_upCount100.quickSort_R(); //Zufall
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-Random:    ");
	        quickSort_R_upCount100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	
	        time1 = System.currentTimeMillis();
	        quickSort_3M_upCount100.quickSort_3M(); //3-Median
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-3-Median:  ");
	        quickSort_3M_upCount100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	
	        time1 = System.currentTimeMillis();
	        quickSort_QI_upCount100.quick_Insertion();//Quick_Insertion
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-Insertion: ");
	        quickSort_QI_upCount100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	       
	//        quickSort_QI_R_upCount100.quick_Insertsort_Rechts();//Quick_Insertion Rechts-Pivot
	//        quickSort_QI_R_upCount100.showAufwand();
	
	        time1 = System.currentTimeMillis();
	        quickSort_QI_Random_upCount100.quick_Insertion_R();//Quick_Insertion Random
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-Ins.-Ran.: ");
	        quickSort_QI_Random_upCount100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	        
	        //DOWNTO 100
	        System.out.print("\nDownCount\n---------\n");
	        time1 = System.currentTimeMillis();
	        quickSort_R_downCount100.quickSort_R(); //Zufall
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-Random:    ");
	        quickSort_R_downCount100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	
	        time1 = System.currentTimeMillis();
	        quickSort_3M_downCount100.quickSort_3M(); //3-Median
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-3-Median:  ");
	        quickSort_3M_downCount100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	
	        time1 = System.currentTimeMillis();
	        quickSort_QI_downCount100.quick_Insertion(); //Quick_Insertion
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-Insertion: ");
	        quickSort_QI_downCount100.showAufwand();
	        System.out.print(" , Zeit: " + (time2-time1) + "ms\n");
	        
	//        quickSort_QI_R_downCount100.quick_Insertsort_Rechts(); //Quick_Insertion Rechts-Pivot
	//        quickSort_QI_R_downCount100.showAufwand();
	
	        time1 = System.currentTimeMillis();
	        quickSort_QI_Random_downCount100.quick_Insertion_R();//Quick_Insertion Random
	        time2 = System.currentTimeMillis();
	        System.out.print("Quick-Ins.-Ran.: ");
	        quickSort_QI_Random_downCount100.showAufwand();
	        System.out.println(" , Zeit: " + (time2-time1) + "ms\n");
	        
        }
        
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
