package a12.a2_symmetrisches_Verfahren;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class TestFrame {

	public static void main(String[] args) {
		Block_Chiffre blockChiffre = new Block_Chiffre();
		String string1 = "Hallo";
		blockChiffre.encrypt(string1);
		System.out.println("zu verschluesseln: " + string1);
		System.out.println("entschluesselt:    " + blockChiffre.decrypt());
		
		//fuer Jannik und Rutkay, diese Zeile kopieren.
		System.out.println("\nDie verschluesselten Daten:");
		int[] intKryptArray = blockChiffre.getIntKryptArray();
		for(int i = 0; i < blockChiffre.getIntKryptArray().length; i++){
			System.out.print(intKryptArray[i]);
		}
	}

}
