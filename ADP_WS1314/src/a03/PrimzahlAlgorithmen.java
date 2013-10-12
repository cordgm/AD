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
			for(int j = 2; j < i; j++){
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
	 * @param n Problemgroesse
	 * @return
	 */
	public boolean primality(int n){
		zaehler = 0;
		//ToDo
		return false;
		
	}

	public int getZaehler() {
		return zaehler;
	}
	
	public void showPrim(int n){
		System.out.println("Primzahlen von 2 bis "+n);
		for(int i = 0; i < n; i++){
			if(zahlen[i] == true){
				System.out.print(zahlen[i]+" ,");
			}
		}
	}
}
