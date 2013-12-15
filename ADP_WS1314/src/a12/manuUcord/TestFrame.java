package a12.manuUcord;

public class TestFrame {

	public static void main(String[] args) {
		Block_Chiffre blockChiffre = new Block_Chiffre();
		int[] iA = blockChiffre.convertText("Hallo");
		for(int i = 0; i<iA.length; i++){
			System.out.println(iA[i]);
		}
	}

}
