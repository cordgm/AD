package a12.a2_symmetrisches_Verfahren;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class Block_Chiffre implements IBlock_Chiffre {
	
	//Attribute
	private int[] intKryptArray;
	private int[] intClearArray;

	/**
	 * Umwandlung Text in Int-Array.
	 */
	private int[] convertText(String text) {
		char[] charClearArray = text.toCharArray();//a newly allocated character array whose length is the length of this string
		intClearArray = new int[charClearArray.length];
		for(int i = 0; i<charClearArray.length; i++){
			intClearArray[i] = (int)charClearArray[i] - 32;
		}
		return intClearArray;
	}

	private String deConvertText(int[] intText) {
		char[] charClearArray = new char[intText.length];
		for(int i = 0; i<intText.length; i++){
			charClearArray[i] = (char) (intText[i] + 32);
		}
		return String.valueOf(charClearArray);
	}

	@Override
	public int createSessionKeyS0() {
		return (int)(1+(Math.random()*(94)));
	}

	@Override
	public int createSessionKeyS1() {
		return (int)(1+(Math.random()*(94)));
	}

	/**
     * Erzeugt ein um 8 Stellen groesseres Integer Array und
     * fuegt an Stelle [0] den SessionKey S0 und an Stelle [1] den SessionKey S1 ein.
     * Vorher muss convertText ausgefuehrt werden.
     */
	private void createIntKryptArray() {
		this.intKryptArray = new int[this.intClearArray.length+8];
		intKryptArray[0] = createSessionKeyS0();
		intKryptArray[1] = createSessionKeyS1();
    }

	@Override
	public void encrypt(String text) {
		convertText(text);
		createIntKryptArray();
		for(int i = 0; i<intClearArray.length; i+=2){
			intKryptArray[i + 8] = intClearArray[i] + intKryptArray[0] % 95;
			if(i<intClearArray.length-1){//Schutz vor Speicherueberlauf
				intKryptArray[i+1 + 8] = intClearArray[i+1] + intKryptArray[1] % 95;
			}
		}
	}

	@Override
	public String decrypt() {
		for(int i = 0; i<intClearArray.length; i+=2){
			intClearArray[i] = intKryptArray[i + 8] - intKryptArray[0] % 95;
			if(i<intClearArray.length-1){//Schutz vor Speicherueberlauf
				intClearArray[i+1] = intKryptArray[i+1 + 8] - intKryptArray[1] % 95;
			}
		}
		return deConvertText(intClearArray);
	}

	@Override  
	public int[] getIntKryptArray() {
		return intKryptArray;
	}

	public void ausgeben() {
	    
	    System.out.println("intClearArray groesse: " + intClearArray.length);
	    for(int i=0; i < intClearArray.length; i++) {
	        System.out.print(intClearArray[i] +": ");
	    }
	    
	    System.out.println();
        System.out.println("intKryptArray groesse: " + intKryptArray.length);
	    for(int i=0; i < intKryptArray.length; i++) {
	        System.out.print(intKryptArray[i] +": ");
        }
	}

	public void setIntKryptArray(int[] intKryptArray) {
		this.intKryptArray = intKryptArray;
	}

}
