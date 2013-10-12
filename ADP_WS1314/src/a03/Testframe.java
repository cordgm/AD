package a03;

public class Testframe {

	public static void main(String[] args) {
		
		PrimzahlAlgorithmen primzahlAlgorithmen = new PrimzahlAlgorithmen();
		
//		System.out.println("****** Testframe ******\nlangsames Primzahl suchen:");
//		primzahlAlgorithmen.searchPrimSlow(10);
//		System.out.println("10          : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSlow(100);
//		System.out.println("100         : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSlow(1000);
//		System.out.println("1000        : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSlow(10000);
//		System.out.println("10000       : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSlow(100000);
//		System.out.println("100000      : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSlow(1000000);
//		System.out.println("1000000     : "+primzahlAlgorithmen.getZaehler());
		
		
//		System.out.println("\n****** Testframe ******\nschnelles Primzahl suchen:");
//		primzahlAlgorithmen.searchPrimFast(10);
//		System.out.println("10          : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimFast(100);
//		System.out.println("100         : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimFast(1000);
//		System.out.println("1000        : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimFast(10000);
//		System.out.println("10000       : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimFast(100000);
//		System.out.println("100000      : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimFast(1000000);
//		System.out.println("1000000     : "+primzahlAlgorithmen.getZaehler());
		
		
//		System.out.println("\n****** Testframe ******\nSieb des Eratosthenes");
//		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(10);
//		System.out.println("10          : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(100);
//		System.out.println("100         : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(1000);
//		System.out.println("1000        : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(10000);
//		System.out.println("10000       : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSlow(100000);
//		System.out.println("100000      : "+primzahlAlgorithmen.getZaehler());
//		primzahlAlgorithmen.searchPrimSlow(1000000);
//		System.out.println("1000000     : "+primzahlAlgorithmen.getZaehler());
		
		
		System.out.println("\n****** Testframe ******\nPrimzahleigenschaft feststellen");
		boolean erg;
        long start1  = System.nanoTime();
        erg= primzahlAlgorithmen.primality(17);
        long ende1  = System.nanoTime();
        System.out.println(erg + " : "+primzahlAlgorithmen.getZaehler() );
        long dauer1 = (ende1 - start1);
        System.out.println("dauer1: " +dauer1);
        
		
		long start  = System.nanoTime();
		erg= primzahlAlgorithmen.primality(17);
		long ende  = System.nanoTime();
		System.out.println(erg + " : "+primzahlAlgorithmen.getZaehler() );
		long dauer = (ende - start);
		System.out.println("dauer: " +dauer);
		
		
		
//		erg = primzahlAlgorithmen.primality(77);
//      System.out.println(erg + " : "+primzahlAlgorithmen.getZaehler() );
        
		//System.out.println(primzahlAlgorithmen.primality(8) +" : "+primzahlAlgorithmen.getZaehler() );
	}

}
