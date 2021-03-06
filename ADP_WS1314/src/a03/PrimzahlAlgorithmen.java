package a03;

public class PrimzahlAlgorithmen {

	//Attribute
	private boolean[] zahlen;
	private int zaehler;	//fuer die Aufwandsbestimmung
	
	//Kontruktor
	public PrimzahlAlgorithmen() {
		super();
	}
	
	//Methoden
	/**
	 * langsames Primzahl suchen
	 * Alle Elemte im Array zahlen auf die true steht sind Primzahlen
	 * @param n Problemgroesse
	 */
	public void searchPrimSlow(int n){
		zaehler = 0;
		zahlen = new boolean[n];
		for(int i = 0; i < n ; i++)
			zahlen[i] = true;
		for(int i = 2; i < n; i++){
			for(int j = 2; j < n; j++){
				if((i%j == 0) && (j!=i)){
					zahlen[i] = false;
					zaehler++;
				}
			}
		}
	}

	/**
	 * schnelles Primzahl suchen
	 * @param n Problemgroesse
	 */
	public void searchPrimFast(int n){
		zaehler = 0;
		zahlen = new boolean[n];
		for(int i = 0; i < n ; i++)
			zahlen[i] = true;
		for(int i = 2; i < n; i++){
			for(int j = 2; j < Math.sqrt(i); j++){
				if((i%j == 0) && (j!=i)){
					zahlen[i] = false;
					zaehler++;
				}
			}
		}
	}
	
	/**
	 * Sieb des Eratosthenes
	 * @param n Problemgroesse
	 */
	public void searchPrimSiebDesEratosthenes(int n){
		zaehler = 0;
		for(int i = 0 ; i < n ; i++)
			zahlen[i] = true;
		for(int i = 2 ; i < Math.sqrt(n) ; i++){
			if (zahlen[i] == true){
				for (int j = 2 ; i*j < n ; j++){
					zahlen[i*j] = false;
					zaehler++;
				}
			}	
		}
	}
	
	/**
	 * Primzahleigenschaft feststellen
	 * false = keine Primzahl,
	 * true = eine Primzahl,
	 * @param n Problemgroesse
	 * @return boolean 
	 */
	public boolean primality(int n) {
		zaehler = 0;
		
		if(n > 1) {
		    for(int moeglicheTeiler=2; (moeglicheTeiler < Math.sqrt(n)); moeglicheTeiler++) {
		        
		      if (n % moeglicheTeiler == 0) return false; //keine Primzahl
		              
		      zaehler++;
		    } 
		}
		return true;		
	}
	  
	   
	public int getZaehler() {
		return zaehler;
	}
	
	public void showPrim(int n){
		System.out.println("Primzahlen von 2 bis "+n);
		int primCount = 0;
		for(int i = 0; i < n; i++){
			if(zahlen[i] == true){
				if(primCount%10 == 0){
					System.out.println("");
				}
				primCount++;
				System.out.print(i+" ,");
			}
		}
	}
}
