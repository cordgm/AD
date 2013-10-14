package a03;

public class Testframe {

	public static void main(String[] args) {
		
		PrimzahlAlgorithmen primzahlAlgorithmen = new PrimzahlAlgorithmen();
		
		System.out.println("****** Testframe ******\nlangsames Primzahl suchen:");
		primzahlAlgorithmen.searchPrimSlow(10);
		System.out.println("10        : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSlow(50);
		System.out.println("50        : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSlow(100);
		System.out.println("100       : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSlow(500);
		System.out.println("500       : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSlow(5000);
		System.out.println("5000      : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSlow(50000);
		System.out.println("50000     : "+primzahlAlgorithmen.getZaehler());
		
		
		System.out.println("\n****** Testframe ******\nschnelles Primzahl suchen:");
		primzahlAlgorithmen.searchPrimFast(10);
		System.out.println("10        : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimFast(50);
		System.out.println("50        : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimFast(100);
		System.out.println("100       : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimFast(500);
		System.out.println("500       : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimFast(5000);
		System.out.println("5000      : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimFast(50000);
		System.out.println("50000     : "+primzahlAlgorithmen.getZaehler());
		
		System.out.println("\n****** Testframe ******\nSieb des Eratosthenes");
		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(10);
		System.out.println("10        : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(50);
		System.out.println("50        : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(100);
		System.out.println("100       : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(500);
		System.out.println("500       : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(5000);
		System.out.println("5000      : "+primzahlAlgorithmen.getZaehler());
		primzahlAlgorithmen.searchPrimSiebDesEratosthenes(50000);
		System.out.println("50000     : "+primzahlAlgorithmen.getZaehler());
		
		primzahlAlgorithmen.showPrim(1000);
		
		
		System.out.println("\n****** Testframe ******\nPrimzahleigenschaft feststellen");
		boolean erg;
        erg = primzahlAlgorithmen.primality(301);//nur so
        
		
		
		erg = primzahlAlgorithmen.primality(7);		
		System.out.println(erg + " : "+primzahlAlgorithmen.getZaehler() );
		erg = primzahlAlgorithmen.primality(101);
		System.out.println(erg + " : "+primzahlAlgorithmen.getZaehler() );
		erg = primzahlAlgorithmen.primality(5003);
		System.out.println(erg + " : "+primzahlAlgorithmen.getZaehler() );
		erg = primzahlAlgorithmen.primality(50021);
		System.out.println(erg + " : "+primzahlAlgorithmen.getZaehler() );
		erg = primzahlAlgorithmen.primality(200003);		
		System.out.println(erg + " : "+primzahlAlgorithmen.getZaehler() );
		erg = primzahlAlgorithmen.primality(999979);		
		System.out.println(erg + " : "+primzahlAlgorithmen.getZaehler() );
		
		
		
		
//		erg = primzahlAlgorithmen.primality(77);
//      System.out.println(erg + " : "+primzahlAlgorithmen.getZaehler() );
        
//		System.out.println(primzahlAlgorithmen.primality(8) +" : "+primzahlAlgorithmen.getZaehler() );
//		long start  = System.nanoTime();
//		long ende  = System.nanoTime();
//		long dauer = (ende - start);
//		System.out.println("dauer: " +dauer);
	}

}
