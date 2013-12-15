/**
 * 
 */
package a12.manuUcord;

/**
 * @author Colonel_Sheppard
 *
 */
public interface IBlock_Chiffre {
    
    public int createSessionKeyS0();
    
    public int createSessionKeyS1();
    
    public void encrypt(String text);
    
    public String decrypt();
}
