package a12.steffen;

import java.util.ArrayList;
import java.util.List;

/**
 * Offentlicher Schlussel Haupmodul und e
 * 
 * @author brede
 * @param <T>
 *            e - Verschlusselungsexponent; d - Entschlusselungexponent;
 *            hauptmodul - bildet mit e den offentlichen Schlussel; nebenmodul -
 *            bildet mit d den privaten Schlussel
 * 
 */

public class PrivatePublicKey<T> implements IPrivatePublicKey<T> {
	private long prim1;
	private long prim2;
	private long e;
	private long d;
	@SuppressWarnings("unused")
	private long hauptmodul = 0;

	public PrivatePublicKey() {
		this.e = 0;
		this.d = 0;
		this.prim1 = getThreeDigitPrim();
		// suche zweite Prim ungleich erste Prim
		do {
			this.prim2 = getThreeDigitPrim();
		} while (prim1 == prim2 || prim2 == -1);
		determineE();
		determineD();
	}

	// Konstruktor um public Key zu ubernehmen
	public PrivatePublicKey(long hauptmodul, long e) {
		this.hauptmodul = hauptmodul;
		this.e = e;
	}

	@Override
	public long getThreeDigitPrim() {
		int zahl = (int) ((Math.random() * (999 - 100)) + 100);

		for (int i = 2; i * i <= zahl; i++) {

			if (zahl % i == 0) {
				zahl++;
				i = 1;
			}
		}
		return zahl;
	}

	@Override
	public long getMainmodul() {
		return prim1 * prim2;
	}

	@Override
	public long getBesidemodul() {
		return (prim1 - 1) * (prim2 - 1);
	}

	@Override
	public void determineE() {
		long teiler = 0;
		this.e = 1;
		do {
			e++;
			teiler = ModernerEuklid(getBesidemodul(), this.e);
		} while (teiler != 1);
	}

	private void determineD() {
		while (((this.d * this.e) % getBesidemodul()) != 1) {
			this.d++;
		}
	}

	public long ModernerEuklid(long x, long y) {
		long r;
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		return x;
	}

	@Override
	public ArrayList<Long> encode(String clear) {
		char[] tmpArray = clear.toCharArray();
		List<Long> tmpList = new ArrayList<Long>();
		long erg;
		for (int i = 0; i < tmpArray.length; i++) {
			erg = tmpArray[i];
			// char verschlusseln
			for (int j = 1; j < this.e; j++) {
				erg = (int) ((erg * (int) tmpArray[i]) % getMainmodul());
			}
			tmpList.add(erg);
		}
		return (ArrayList<Long>) tmpList;
	}

	@Override
	public String decode(ArrayList<Long> crypt) {
		String tmpString = "";

		for (int i = 0; i < crypt.size(); i++) {
			long tmp = crypt.get(i);

			for (int j = 1; j < this.d; j++) {
				tmp = (tmp * crypt.get(i)) % getMainmodul();
			}
			tmpString += (char) tmp;
		}
		return tmpString;
	}

	@Override
	public long getD() {
		return this.d;
	}

	public long getPrim1() {
		return prim1;
	}

	public long getPrim2() {
		return prim2;
	}

	public long getE() {
		return this.e;
	}

}
