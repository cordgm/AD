package a05;

public class PascalscheDreieck {
	//Attribute
	private int aufwandZaehlerIterativ;
	private int aufwandZaehlerRekusiv;
	private int aufwandZaehlerSchneller;
	
	private void printZeile(int[] zeile){
		System.out.println("Die " + zeile.length + "te Zeile:");
		for(int i = 0; i < zeile.length; i++){
			System.out.print(zeile[i] + " ");
		}
	}
	
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
		if(n<0){
			System.err.println("Ungültige Zeilenangabe!");
			return;			
		}
		int[] zeile = new int[n];
		for(int i = 0; i < n; i++){
			zeile[i] = fakultaet(n) / (fakultaet(i) * fakultaet(n-i));
		}

	}
	
	/**
	 * Wird fuer die Berechnung des schnelleren Algorithmusses verwendet
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
