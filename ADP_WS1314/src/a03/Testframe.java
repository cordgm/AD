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
//		primzahlAlgorithmen.searchPrimSlow(100000);
//		System.out.println("100000      : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSlow(1000000);
//		System.out.println("1000000     : "+primzahlAlgorithmen.getZaehler());
		
		
		System.out.println("\n****** Testframe ******\nschnelles Primzahl suchen:");
		primzahlAlgorithmen.searchPrimFast(10);
		System.out.println("10          : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimFast(100);
		System.out.println("100         : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimFast(1000);
		System.out.println("1000        : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimFast(10000);
		System.out.println("10000       : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimFast(100000);
//		System.out.println("100000      : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimFast(1000000);
//		System.out.println("1000000     : "+primzahlAlgorithmen.getZaehler());
		
		
		System.out.println("\n****** Testframe ******\nSieb des Eratosthenes");
		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(10);
		System.out.println("10          : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(100);
		System.out.println("100         : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(1000);
		System.out.println("1000        : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(10000);
		System.out.println("10000       : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSlow(100000);
//		System.out.println("100000      : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSlow(1000000);
//		System.out.println("1000000     : "+primzahlAlgorithmen.getZaehler());
	}

}
