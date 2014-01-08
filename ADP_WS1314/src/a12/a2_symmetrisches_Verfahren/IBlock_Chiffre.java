package a12.a2_symmetrisches_Verfahren;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public interface IBlock_Chiffre {
    
    public int createSessionKeyS0();
    
    public int createSessionKeyS1();
    
    /**
     * Verschluesseln
     * @param text
     */
    public void encrypt(String text);
    
    /**
     * Entschluesseln
     * @return
     */
    public String decrypt();
    
    /**
     * an Stelle [0] befindet sich SessionKey S0 und an Stelle [1] der SessionKey S1.
     * @return Das verschluesselte int[] (verschluesselte Daten)
     */
    public int[] getIntKryptArray();
}
