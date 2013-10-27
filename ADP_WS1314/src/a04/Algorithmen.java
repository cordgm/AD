/**
 * 
 */
package a04;


/**
 * @author Colonel_Sheppard
 *
 */
public class Algorithmen {
    
//Globale Daten
static int  cnt1 = 0;
static int  cnt2 = 0;
static int  cnt3 = 0;
static int MAX_ITERATIONS = 100;

    /**
     * @param n
     * @return
     */
    public static int gausAlgoReku(int n) 
    {
        cnt1++;
        if( n<=1 ) 
        {
            return 0;
        } 
        else
        {
            return( n+gausAlgoReku(n-1) );    
        }
    }
    
    public static int gausAlgoIterativ(int n) {
        int erg=0;
        
        for (int i = 1; i <= n; i++) {
            cnt2++;
            erg += i;
            
        }
        return erg; 
    }
    
    public static int gausAlgoFormel(int n) {
        cnt3++;
        return ( (n*(n+1))/2 );   
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //Gauß als Rekursiv
        gausAlgoReku(MAX_ITERATIONS);
        System.out.println("Rekursiv: " + MAX_ITERATIONS + "\n Zaehler: " + cnt1 +"\n");

        //Gauß als Iterativ
        gausAlgoIterativ(MAX_ITERATIONS);
        System.out.println("Iterationen: " + MAX_ITERATIONS + "\n Zaehler: " + cnt2 +"\n");
        
        //Gauß als Formel
        gausAlgoFormel(MAX_ITERATIONS);
        System.out.println("Formel: " + MAX_ITERATIONS + "\n Zaehler: " + cnt3 +"\n");
    }

}//Algorithmen
