package a03;

public class Testframe {

	public static void main(String[] args) {
		
		PrimzahlAlgorithmen primzahlAlgorithmen = new PrimzahlAlgorithmen();
		
		System.out.println("****** Testframe ******\nlangsames Primzahl suchen:");
		primzahlAlgorithmen.searchPrimSlow(10);
		System.out.println("10          : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSlow(100);
		System.out.println("100         : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSlow(1000);
		System.out.println("1000        : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSlow(10000);
		System.out.println("10000       : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSlow(100000);
		System.out.println("100000      : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSlow(1000000);
		System.out.println("1000000     : "+primzahlAlgorithmen.getZaehler());
	}

}
