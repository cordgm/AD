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
	 * @param n Problemgroesse
	 */
	public void searchPrimSlow(int n){
		zaehler = 0;
		//ToDo
	}

	/**
	 * schnelles Primzahl suchen
	 * @param n Problemgroesse
	 */
	public void searchPrimFast(int n){
		zaehler = 0;
		//ToDo
	}
	
	/**
	 * Sieb des Eratosthenes
	 * @param n Problemgroesse
	 */
	public void searchPrimSiebDesEratosthenes(int n){
		zaehler = 0;
		//ToDo
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
}
