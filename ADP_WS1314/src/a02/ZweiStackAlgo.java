package a02;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class ZweiStackAlgo {
	
	//Attribute
	private Stack<Integer> operandenStack;
	private Stack<Character> operatorenStack;
	private char[] geklammerterAlgebraischerAusdruck;
	private long time;
	
	//Konstruktor
	public ZweiStackAlgo(String geklammerterAlgebraischerAusdruck) {
		super();
		this.operandenStack = new Stack<Integer>(geklammerterAlgebraischerAusdruck.length()/2);	//.length(), weil der Stack ausreichend Speichern können muss
		this.operatorenStack = new Stack<Character>(geklammerterAlgebraischerAusdruck.length()/2);
		this.geklammerterAlgebraischerAusdruck = geklammerterAlgebraischerAusdruck.toCharArray();
	}
	
	/**
	 * Es wird der im Konstruktor Übergebene vollständig geklammerte Ausdruck berechnet. Die Komplexität ist O(N)
	 * @return Das Ergebnis der Berechnung
	 */
	public int auswertung(){
		int result = 0;
		char c;
		String zahl = "";
		
		long time1 = System.nanoTime();
		for(int i=0; i<geklammerterAlgebraischerAusdruck.length; i++){
			c = geklammerterAlgebraischerAusdruck[i];
			if(c=='('){
				//nix
			}else if(c>=0x30 && c<=0x39){	//Zeichen >= 0 && Zeichen <= 9
				zahl = c + "";
				//solange das naechste Zeichen ein Zahl ist, lese die einzelnen Zahlen
				while(geklammerterAlgebraischerAusdruck[i+1] >= 0x30 && geklammerterAlgebraischerAusdruck[i+1] <= 0x39){
					zahl += geklammerterAlgebraischerAusdruck[i+1];
					i++;
				}
				operandenStack.pushtail(Integer.parseInt(zahl));
			}else if(c=='+' || c=='-' || c=='*' || c=='/'){
				operatorenStack.pushtail(c);
			}else if(c==')'){
				switch(operatorenStack.top()){
					case '+':
						//das + ausm Operatoren Stack entfernen
						operatorenStack.poptail();
						
						//Ergebnis berechnen
						result = operandenStack.top();
						operandenStack.poptail();
						result = operandenStack.top() + result;
						operandenStack.poptail();
						
						//Ergebnis in Operanden Stack einfügen
						operandenStack.pushtail(result);
						break;
					case '-':
						//das - ausm Operatoren Stack entfernen
						operatorenStack.poptail();
						
						//Ergebnis berechnen
						result = operandenStack.top();
						operandenStack.poptail();
						result = operandenStack.top() - result;
						operandenStack.poptail();
						
						//Ergebnis in Operanden Stack einfügen
						operandenStack.pushtail(result);
						break;
					case '*':
						//das * ausm Operatoren Stack entfernen
						operatorenStack.poptail();
						
						//Ergebnis berechnen
						result = operandenStack.top();
						operandenStack.poptail();
						result = operandenStack.top() * result;
						operandenStack.poptail();
						
						//Ergebnis in Operanden Stack einfügen
						operandenStack.pushtail(result);
						break;
					case '/':
						//das / ausm Operatoren Stack entfernen
						operatorenStack.poptail();
						
						//Ergebnis berechnen
						result = operandenStack.top();
						operandenStack.poptail();
						result = operandenStack.top() / result;
						operandenStack.poptail();
						
						//Ergebnis in Operanden Stack einfügen
						operandenStack.pushtail(result);
						break;
				}
			}
		}
		long time2 = System.nanoTime();
		time = time2-time1;
		
		return result;
	}
	
	public long getCalcTime(){
		return time;
	}
}
