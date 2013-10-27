package a05;

public class PascalscheDreieck {
	//Attribute
	private int aufwandZaehler;
	private int aufwandZaehlerIterativ;
	private int aufwandZaehlerRekusiv;
	
	private void printZeile(int[] zeile){
		System.out.println("\nDie " + zeile.length + "te Zeile:");
		for(int i = 0; i < zeile.length; i++){
			System.out.print(zeile[i] + " ");
		}
	}
	
	/**
	 * 
	 * @param n
	 */
	public void iterativ(int n)
	{
        int[][] array = new int[n][n+1];
        array[0][1] = 1;
    
        for(int i = 1; i < n; i++)
        {
                for(int j = 1; j < i+2; j++)
                {
                        array[i][j] = array[i-1][j-1] + array[i-1][j];
                        this.aufwandZaehlerIterativ++;
                }
        }
        
        System.out.println("\n\nDie " + n + ". Zeile:");
        for(int k = 1; k < n+1; k++)
        {
                System.out.print(array[n-1][k] + " ");
        }
        
        
        /** Bei genaueren Details bitte entkommentieren.
        for(int z = 0; z < n; z++){
                for(int x = 0; x < n+1; x++){
                        System.out.print(array[z][x] + " ");
                }
                System.out.println();
        }*/
	}//iterativ
	
    private int[] pascDreieck(int n, int[] array)
    {
           if(n > 0)
           {
                  array = pascDreieck(--n, array);
           }
           int[] tmp = new int[array.length+1];
           
           for(int i = 0; i < tmp.length-1; i++)
           {
                   tmp[i] = array[i];
                   if(i > 0 && i < array.length)
                   {
                           tmp[i] += array[i-1];
                   }
                   this.aufwandZaehlerRekusiv++;
           }
           tmp[tmp.length-1] = 1;
           return tmp;
   }//pascDreieck
	
	/**
	 * 
	 * @param n
	 */
    public void rekursiv(int n)
    {
        int[] tmp = new int[0];
        
        int[] array = pascDreieck(--n, tmp);
        
        System.out.println("\n\nDie " + (n+1) + ". Zeile:");
        for(int i = 0; i < array.length; i++)
        {
                System.out.print(array[i] + " ");
        }
        
    }//rekursiv
    

	/**
	 * n ueber k-1
	 * P(n,r) = n! / (n - r)!
	 * @param n
	 */
	public void schneller(int n){
		if(n<=0){
			System.err.println("Ungültige Zeilenangabe!");
			return;			
		}
		aufwandZaehler = 0;
		n--;
		int[] zeile = new int[n+1];
		for(int i = 0; i < (n+1); i++){
			zeile[i] = fakultaet(n) / (fakultaet(i) * fakultaet(n-i));
			aufwandZaehler++;
		}
		printZeile(zeile);

	}
	
	/**
	 * Wird fuer die Berechnung des schnelleren Algorithmusses verwendet
	 * @param n
	 * @return
	 */
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


	public int getAufwandZaehler() {
		return aufwandZaehler;
	}

    public int getAufwandZaehlerIterativ() {
        return aufwandZaehlerIterativ;
    }

    public int getAufwandZaehlerRekusiv() {
        return aufwandZaehlerRekusiv;
    }
	
}
