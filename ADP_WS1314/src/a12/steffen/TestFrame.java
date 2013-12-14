package a12.steffen;

import java.util.ArrayList;

public class TestFrame {

	private String nachricht = "Dies ist ein TestDies ist ein TestDies ist ein TestDies ist ein TestDies ist ein TestDies ist ein TestDies ist ein TestDies ist ein Test";

	public static void main(String[] args) {
		TestFrame test01 = new TestFrame();
		test01.start();
	}

	private void start() {
		PrivatePublicKey<Character> obj = new PrivatePublicKey<>();
		System.out.println("Primzahlen: " + obj.getPrim1() + "|"
				+ obj.getPrim2());
		System.out.println("Mainmodul: "
				+ obj.getMainmodul());
		System.out.println("Nebenmodul: " + obj.getBesidemodul());
		System.out.println("e: " + obj.getE());
		System.out.println("d: " + obj.getD());
		System.out.println("Die Nachricht die ubermittelt wird: " + nachricht);
		ArrayList<Long> tmpArrayLIst = obj.encode(nachricht);
		String tmpString = obj.decode(tmpArrayLIst);
		System.out
				.println("Die Nachricht die entschlusselt wird: " + tmpString);

	}
}
