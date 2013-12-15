/**
 * 
 */
package a12.manuUcord;

/**
 * @author Colonel_Sheppard
 *
 */
public interface IBlock_Chiffre {


    /**
     * Umwandlung Text in Int-Array. 
     * @return int[].
     */
    public int[] convertText(String text);
    
    public int createSessionKeyS0();
    
    public int createSessionKeyS1();
    
    public int[] getIntKryptArray();
}
