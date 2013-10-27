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
        
        //************* Pascalsschen Dreiecks ********************
        System.out.println("************* Start Pascalsschen Dreiecks: *************\n");
        
        
        System.out.println("************* rekursives Pascalssches Dreiecks: *************\n");
        PascalRekursiv pr1 = new PascalRekursiv();
        pr1.rekursiv(1);

        System.out.println("************* iteratives Pascalssches Dreiecks: *************\n");
        

        System.out.println("************* Binomialkoeffizienten Pascalssches Dreiecks: *************\n");
    }

}
