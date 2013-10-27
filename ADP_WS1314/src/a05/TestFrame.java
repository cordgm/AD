/**
 * 
 */
package a05;

/**
 * @author Colonel_Sheppard
 *
 */
public class TestFrame {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	
        PascalscheDreieck pascalscheDreieck = new PascalscheDreieck();
        
        //************* Pascalsschen Dreiecks ********************
        System.out.println("************* Start Pascalsschen Dreiecks: *************\n");
        
        
        System.out.println("************* rekursives Pascalssches Dreiecks: *************\n");
        pascalscheDreieck.rekursiv(1);

        System.out.println("************* iteratives Pascalssches Dreiecks: *************\n");
        

        System.out.println("************* Binomialkoeffizienten Pascalssches Dreiecks: *************\n");
        pascalscheDreieck.schneller(7);
    }

}
