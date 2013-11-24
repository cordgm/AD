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
    
	/**
	 * Der Konstruktor erwartet ein Wurzel-Node, auf den er den Baum aufsetzen kann.
	 * @param wurzel Der Wurzel-Node.
	 */
    public TreeLinked(Node<T> wurzel) {
		super();
		this.wurzel = wurzel;
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
	 * 
	 * @param node
	 * @param wert
	 * @return
	 */
	private int summe_Aller_Kleineren(Node<T> node, int wert) {
		int returnWert = 0;
		if (node == null) {
			return 0;
		} else if (node.getKey() > wert) {
			returnWert += summe_Aller_Kleineren(node.getLinks(), wert);
		} else {
			returnWert += summe_Aller_Kleineren(node.getLinks(), wert);
			returnWert += summe_Aller_Kleineren(node.getRechts(), wert);
			returnWert += node.getKey();
		}
		return returnWert;

	}

	/**
	 * 
	 * @param node
	 */
	public void summeAllerKleinerenAktualisieren(Node<T> node) {
		node.setSummeAllerKleineren(summe_Aller_Kleineren(wurzel, node.getKey()));
		if (node.getLinks() != null) {
			summeAllerKleinerenAktualisieren(node.getLinks());
		}
		if (node.getRechts() != null) {
			summeAllerKleinerenAktualisieren(node.getRechts());
		}

	}

	/**
	 * 
	 * @param m
	 * @param M
	 * @return
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
	 * 
	 * @param node
	 * @param M
	 */
	private void sucheGrossM(Node<T> node, int M) {
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
	 * 
	 * @param node
	 * @param m
	 */
	private void sucheKleinM(Node<T> node, int m) {
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
    
}
