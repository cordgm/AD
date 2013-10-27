package a05;

public class PascalscheDreieck {
	//Attribute
	private int aufwandZaehlerIterativ;
	private int aufwandZaehlerRekusiv;
	private int aufwandZaehlerSchneller;
	
	/**
	 * 
	 * @param n
	 */
	public void iterativ(int n){
		
	}
	
	
	/**
	 * 
	 * @param n
	 */
    public void rekursiv(int n){
        System.out.println(n);
    }
    

	/**
	 * n ueber k-1
	 * P(n,r) = n! / (n - r)!
	 * @param n
	 */
	public void schneller(int n){
		if(n>=0){
			
		}
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	private int fakultaet(int n){
		int fakultaet = 1;
		if(n >= 0){
			while(n > 1){
		        fakultaet = fakultaet * n;
		        n = n - 1;
			}
			return fakultaet;
		}
		return -1;
	}


	public int getAufwandZaehlerIterativ() {
		return aufwandZaehlerIterativ;
	}


	public int getAufwandZaehlerRekusiv() {
		return aufwandZaehlerRekusiv;
	}


	public int getAufwandZaehlerSchneller() {
		return aufwandZaehlerSchneller;
	}
	
}
