package a09;

/**
 * 
 * @author Cord Godehus- Meyer
 *
 * @param <T>
 */
public class TreeLinked<T> implements ITree<T> {
	
	//Attribute
	Node<T> wurzel;
	Node<T> amNachstenDran;
    private long aufwandZaehler;
    public static final boolean AUFWAND = true;
    
	/**
	 * Der Konstruktor erwartet ein Wurzel-Node, auf den er den Baum aufsetzen kann.
	 * @param wurzel Der Wurzel-Node.
	 */
    public TreeLinked(Node<T> wurzel) {
		super();
		this.wurzel = wurzel;
		this.aufwandZaehler = 0;
	}

	@Override
    public boolean insert(Node<T> node) {
		if(node != null){
			wurzel.insert(node.getDaten(), node.getKey());
	    	return true;
		}else{
			return false;
		}
    	
    }
	
	/**
	 * Rekursive Methode zur Berechnung der Summer aller Kleineren.
	 * @param node Anfangs der Wurzel-Node, damit von Ihm aus alle kleineren vom uebergebenen Wert gefunden werden koennen.
	 * @param wert Wert, von alle Kleineren addiert werden.
	 * @return die Summe alles Kleineren
	 */
	private int summeAllerKleinerenRe(Node<T> node, int wert) {
		if(AUFWAND) {aufwandZaehler++;};
		int returnWert = 0;
		if (node == null) {
			return 0;
		} else if (node.getKey() > wert) {
			returnWert += summeAllerKleinerenRe(node.getLinks(), wert);
		} else {
			returnWert += summeAllerKleinerenRe(node.getLinks(), wert);
			returnWert += summeAllerKleinerenRe(node.getRechts(), wert);
			returnWert += node.getKey();
		}
		return returnWert;

	}

	/**
	 * Rekursive Methode zur Berechnung der Summer aller Kleineren vom Knoten selber und aller Kinder.
	 * @param node Node von dem alle Kleineren addiert werden sollen.
	 */
	public void summeAllerKleinerenAktualisierenRe(Node<T> node) {
		if(AUFWAND) {aufwandZaehler++;};
		node.setSummeAllerKleineren(summeAllerKleinerenRe(wurzel, node.getKey()));
		if (node.getLinks() != null) {
			summeAllerKleinerenAktualisierenRe(node.getLinks());
		}
		if (node.getRechts() != null) {
			summeAllerKleinerenAktualisierenRe(node.getRechts());
		}

	}

	/**
	 * Berechnung der Summer aller Werte aus einer gegebenen Folge, die zwische m und M liegen.
	 * @param m m
	 * @param M M
	 * @return Die Summe aller vorhandenen Werte zwischen m und M.
	 */
	public int summeZwischen(int m, int M) {
		amNachstenDran = null;
		sucheKleinM(wurzel, m);
		int kleinM = 0;
		//weil m in der SummeAllerKleineren mit einberechnet ist, muss m hier abgezogen werden -> damit m selber in der neuen Berechnung mit drin ist (m + ... + M)
		if(amNachstenDran != null){
			kleinM = amNachstenDran.getSummeAllerKleineren() - amNachstenDran.getKey();
		}
		
		amNachstenDran = null;
		sucheGrossM(wurzel, M);
		int grossM = 0;
		if(amNachstenDran != null){
			grossM = amNachstenDran.getSummeAllerKleineren();
		}
		return grossM - kleinM;
	}

	/**
	 * Sucht den Knoten mit dem groeﬂten Wert, der noch kleiner gleich M ist
	 * @param node Am Anfang Wuzel-Node
	 * @param M M
	 */
	private void sucheGrossM(Node<T> node, int M) {
		if(AUFWAND) {aufwandZaehler++;};
		if (node != null) {
			if (node.getKey() > M) {
				sucheGrossM(node.getLinks(), M);
			} else if (node.getKey() == M) {
				amNachstenDran = node;
			} else {
				amNachstenDran = node;
				sucheGrossM(node.getRechts(), M);
			}
		}
	}

	/**
	 * Sucht den Knoten mit dem kleinsten Wert der noch groeﬂer gleich m ist
	 * @param node Am Anfang Wuzel-Node
	 * @param m m
	 */
	private void sucheKleinM(Node<T> node, int m) {
		if(AUFWAND) {aufwandZaehler++;};
		if (node != null) {
			if (node.getKey() < m) {
				sucheKleinM(node.getRechts(), m);
			} else if (node.getKey() == m) {
				amNachstenDran = node;
			} else {
				amNachstenDran = node;
				sucheKleinM(node.getLinks(), m);
			}
		}

	}
	
	@Override
	public boolean exists(int k) {
		return wurzel.exists(k);
	}

    @Override
    public void inorder(Node<T> vater) {
    	if(vater != null){
    		inorder(vater.getLinks());
    		System.out.print(vater.getDaten());
    		inorder(vater.getRechts());
    	}
    }

    @Override
    public void preorder(Node<T> vater) {
    	if(vater != null){
    		System.out.print(vater.getDaten());
    		preorder(vater.getLinks());
    		preorder(vater.getRechts());
    	}
    }

    @Override
    public void postorder(Node<T> vater) {
    	if(vater != null){
    		postorder(vater.getLinks());
    		postorder(vater.getRechts());
    		System.out.print(vater.getDaten());
    	}
    }
    
	public long getAufwandZaehler() {
		return aufwandZaehler;
	}

	public void setAufwandZaehlerAuf0() {
		this.aufwandZaehler = 0;
	}
    
}
