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
        System.out.println("************* Start Pascalsschen Dreiecks: *************");
        
        
        System.out.println("************* rekursives Pascalssches Dreiecks: *************");
        pascalscheDreieck.rekursiv(1);

        System.out.println("************* iteratives Pascalssches Dreiecks: *************");
        

        System.out.println("************* Binomialkoeffizienten Pascalssches Dreiecks: *************");
        pascalscheDreieck.schneller(1);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
        pascalscheDreieck.schneller(7);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
    }

}
