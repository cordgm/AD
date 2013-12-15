package a12.manuUcord;

public class TestFrame {

	public static void main(String[] args) {
		Block_Chiffre blockChiffre = new Block_Chiffre();
		blockChiffre.encrypt("Hallo");
		System.out.println(blockChiffre.decrypt());
//		for(int i = 0; i<10; i++){
//			System.out.print(" " + blockChiffre.createSessionKeyS0());
//		}
		
//		blockChiffre.ausgeben();
		
	}

}
