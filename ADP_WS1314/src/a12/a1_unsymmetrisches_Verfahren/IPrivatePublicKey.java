
package a12.a1_unsymmetrisches_Verfahren;

import java.util.ArrayList;

/**
 * Entschlusselung: (K % H)^E % H = I Verschlusselung: K = (I^V % H) + Z * H
 * 
 * @author Steffen Bredemeier
 * @param <T>
 * 
 */

public interface IPrivatePublicKey<T> {
	/**
	 * 
	 * @return zufällige dreistellige Primzahl
	 */
	long getThreeDigitPrim();

	/**
	 * Hauptmodul bestimmen
	 * 
	 * @return
	 */
	long getMainmodul();

	/**
	 * Nebenmodul bestimmen
	 * 
	 * @return
	 */
	public long getBesidemodul();

	/**
	 * Entschlusselungsexponent - E - Es wird eine Zahl errechnet, die mit dem
	 * Verschlusselungsexponenten multipliziert und den Nebenmodul dividiert den
	 * Divisionsrest 1 ergibt
	 * 
	 * @return
	 */
	public void determineE();

	/**
	 * Entschlusselungsexponenten bestimmen
	 * 
	 * @return
	 */
	public long getD();

	/**
	 * einzelne Buchstaben eines Klartextes clear werden in Zahlen kodiert
	 * 
	 * @param clear
	 * @return
	 */
	public ArrayList<Long> encode(String clear);

	/**
	 * Ein verschlusselter Text wird als String entschlusselt zuruck gegeben
	 * 
	 * @param crypt
	 * @return
	 */
	public String decode(ArrayList<Long> crypt);

}
