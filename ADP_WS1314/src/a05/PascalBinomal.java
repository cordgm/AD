package a05;

public class PascalBinomal {
	
	/**
	 * n ueber k-1
	 * P(n,r) = n! / (n - r)!
	 * @param n
	 */
	public void pascalscheDreieckSchneller(int n){
		if(n>=0){
			
		}
	}
	
	private int fakultaet(int n){
		int fakultaet = 1;
		if(n >= 0){
			while(n > 1){
		        fakultaet = fakultaet * n;
		        n = n - 1;
			}
			return fakultaet;
		}
		return -1;
	}

}
