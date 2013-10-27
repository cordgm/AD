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
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.rekursiv(2);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.rekursiv(3);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.rekursiv(4);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.rekursiv(5);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.rekursiv(6);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.rekursiv(7);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.rekursiv(8);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.rekursiv(9);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );

        System.out.println("************* iteratives Pascalssches Dreiecks: *************");
        pascalscheDreieck.iterativ(1);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.iterativ(2);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.iterativ(3);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.iterativ(4);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.iterativ(5);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.iterativ(6);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.iterativ(7);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.iterativ(8);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );
        pascalscheDreieck.iterativ(9);
        System.out.println( "\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler() );

        System.out.println("************* Binomialkoeffizienten Pascalssches Dreiecks: *************");
        pascalscheDreieck.schneller(1);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
        pascalscheDreieck.schneller(2);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
        pascalscheDreieck.schneller(3);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
        pascalscheDreieck.schneller(4);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
        pascalscheDreieck.schneller(5);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
        pascalscheDreieck.schneller(6);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
        pascalscheDreieck.schneller(7);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
        pascalscheDreieck.schneller(8);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
        pascalscheDreieck.schneller(9);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
        pascalscheDreieck.schneller(7);
        System.out.println("\nDer asymptotische Aufwand: " + pascalscheDreieck.getAufwandZaehler());
    }

}
