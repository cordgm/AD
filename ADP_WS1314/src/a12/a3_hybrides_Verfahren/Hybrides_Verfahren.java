package a12.a3_hybrides_Verfahren;

import java.util.ArrayList;

import a12.a1_unsymmetrisches_Verfahren.PrivatePublicKey;
import a12.a2_symmetrisches_Verfahren.Block_Chiffre;

/**
 * 
 * @author Jannik Schick/Rutkay Kuepelikilinc
 *
 */
public class Hybrides_Verfahren {

    private String nachricht;
    private PrivatePublicKey<Character> rsa;
    private Block_Chiffre block = new Block_Chiffre();
    private int[] intKryptArray;
    private int[] intClearArray;

    public Hybrides_Verfahren() {
        super();
        rsa = new PrivatePublicKey<Character>();
    }

    /**
     * Verschluesselt die nachricht mithilfe des symmetrischen Verfahrens. Die
     * dabei entstehenden Session Keys s0 und s1 werden mithilfe des public Keys
     * des RSA verfahrens verschluesselt. Der String aus verschluesselten
     * Session Keys und verschluesselter Nachricht wird zurueckgegeben
     * 
     * @param message
     *              zu verschluesselnde Nachricht
     * @return verschluesselte Nachricht
     */
    public String encrypt(String message) {
        this.nachricht = message;
        // Teil 2
        block.encrypt(nachricht);
        intKryptArray = block.getIntKryptArray();

        int s0 = intKryptArray[0];
        int s1 = intKryptArray[1];

        // Teil 3
        // System.out.println("S0 = " + s0 + " S1 = " + s1);
        // System.out.println("S0 = " + (char)s0 + " S1 = " + (char)s1);
        ArrayList<Long> s0encode = rsa.encode(String.valueOf((char) s0));
        ArrayList<Long> s1encode = rsa.encode(String.valueOf((char) s1));

        // System.out.println("S0 verschluesselt: " + s0encode.toString());
        // System.out.println("S1 verschluesselt: " + s1encode.toString());
        // System.out.println("S0 entschluesselt: " + rsa.decode(s0encode));
        // System.out.println("S1 entschluesselt: " + rsa.decode(s1encode));

        // Teil 4
        // s0
        intKryptArray[0] = (int) (s0encode.get(0) / Math.pow(95, 3));
        intKryptArray[1] = (int) ((s0encode.get(0) % Math.pow(95, 3) / Math.pow(95, 2)));
        intKryptArray[2] = (int) ((s0encode.get(0) % Math.pow(95, 2) / 95));
        intKryptArray[3] = (int) (s0encode.get(0) % 95);
        // s1
        intKryptArray[4] = (int) (s1encode.get(0) / Math.pow(95, 3));
        intKryptArray[5] = (int) ((s1encode.get(0) % Math.pow(95, 3) / Math.pow(95, 2)));
        intKryptArray[6] = (int) ((s1encode.get(0) % Math.pow(95, 2) / 95));
        intKryptArray[7] = (int) (s1encode.get(0) % 95);

        // Teil 5
        return deConvertText(intKryptArray);

    }

    /**
     * Entschluesselt die Nachricht mithilfe des symmetrischen Verfahrens. 
     * Die Session Keys werden mit hilfe des private Schluessels aus dem RSA
     * verfahren entschluesselt.
     * 
     * @param message
     *              verschluesselter text
     * @return Entschluesselte Nachricht(String)
     */
    public String decrypt(String message) {
        // Teil 1
        int[] intKryptArray = convertText(message);

        // Teil 2
        int s0;
        int s1;
        // dechiffrierung der Session Keys, in Teil 4 dividierte Werte werden
        // wieder aufmultipliziert und die Werte addiert.
        long s0dechiff = (long) ((intKryptArray[0] * Math.pow(95, 3)) + intKryptArray[1] * Math.pow(95, 2) + intKryptArray[2] * 95 + intKryptArray[3]);
        long s1dechiff = (long) ((intKryptArray[4] * Math.pow(95, 3)) + intKryptArray[5] * Math.pow(95, 2) + intKryptArray[6] * 95 + intKryptArray[7]);

        ArrayList<Long> arrLong = new ArrayList<Long>();
        arrLong.add(s0dechiff);
        arrLong.add(s1dechiff);

        String s0s1decode = rsa.decode(arrLong);
        s0 = s0s1decode.charAt(0);
        s1 = s0s1decode.charAt(1);

        // s0 und s1 neu setzen
        for (int i = 0; i < 8; i++) {
            intKryptArray[i] = 0;
        }
        intKryptArray[0] = s0;
        intKryptArray[1] = s1;

        // Teil 3/4

        block.setIntKryptArray(intKryptArray);

        return block.decrypt();

    }

    private int[] convertText(String text) {
        char[] charClearArray = text.toCharArray();// a newly allocated
                                                   // character array whose
                                                   // length is the length of
                                                   // this string
        intClearArray = new int[charClearArray.length];
        for (int i = 0; i < charClearArray.length; i++) {
            intClearArray[i] = (int) charClearArray[i] - 32;
        }
        return intClearArray;
    }

    private String deConvertText(int[] intText) {
        char[] charClearArray = new char[intText.length];
        for (int i = 0; i < intText.length; i++) {
            charClearArray[i] = (char) (intText[i] + 32);
        }
        return String.valueOf(charClearArray);
    }

    public PrivatePublicKey<Character> getRsa() {
        return rsa;
    }

    public void setRsa(PrivatePublicKey<Character> rsa) {
        this.rsa = rsa;
    }

    public Block_Chiffre getBlock() {
        return block;
    }

    public void setBlock(Block_Chiffre block) {
        this.block = block;
    }

}
