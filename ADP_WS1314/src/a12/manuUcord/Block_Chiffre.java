package a12.manuUcord;

public class Block_Chiffre implements IBlock_Chiffre {
	
	//Attribute
	private int[] intKryptArray;
	private int[] intClearArray;
	private int s0;
	private int s1;

	@Override
	public int[] convertText(String text) {
		char[] charClearArray = text.toCharArray();//a newly allocated character array whose length is the length of this string
		intClearArray = new int[charClearArray.length];
		for(int i = 0; i<charClearArray.length; i++){
			intClearArray[i] = (int)charClearArray[i] - 32;
		}
		return intClearArray;
	}

	@Override
	public int createSessionKeyS0() {
		return (int)(1+(Math.random()*(94)));
	}

	@Override
	public int createSessionKeyS1() {
		return (int)(1+(Math.random()*(94)));
	}

	@Override
	public void createIntKryptArray() {
	    
        int[] tmp = new int[this.intClearArray.length+8];
        
        for(int i = 0; i < this.intClearArray.length; i++){
            tmp[i] = this.intClearArray[i];
        }
        
        this.intKryptArray = tmp;
    }
	   
	public void ausgeben() {
	    
	    for(int i=0; i < intClearArray.length; i++) {
	        
	    }
	    
	    for(int i=0; i < intKryptArray.length; i++) {
            
        }
	}
	

}
