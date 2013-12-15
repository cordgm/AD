package a12.manuUcord;

public class Block_Chiffre implements IBlock_Chiffre {
	
	//Attribute
	private int[] intKryptArray;
	private int[] intClearArray;

	@Override
	public int[] convertText(String text) {
		char[] charClearArray = text.toCharArray();//a newly allocated character array whose length is the length of this string
		for(int i = 0; i<charClearArray.length; i++){
			intClearArray[i] = ((int) charClearArray[i]) - 32;
		}
		return intClearArray;
	}

	@Override
	public int createSessionKeyS0() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int createSessionKeyS1() {
		// TODO Auto-generated method stub
		return 0;
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
