package a09;

/**
 * 
 * @author Cord Godehus- Meyer
 *
 * @param <T>
 */
public class TreeLinked<T> implements ITree<T> {
	
	//Attribute
	Tree<T> tree;
	Node<T> wurzel;
	public Node<T> amNachstenDran;

//    public TreeLinked() {
//		super();
//		this.tree = new Tree<T>();
//		this.wurzel = tree.wurzel;
//	}
//    
//    public TreeLinked(int wurzel) {
//		super();
//		this.tree = new Tree<T>(wurzel);
//		this.wurzel = tree.wurzel;
//	}
    
	/**
	 * Der Konstruktor erwartet ein Wurzel-Node, auf den er den Baum aufsetzen kann.
	 * @param wurzel Der Wurzel-Node.
	 */
    public TreeLinked(Node<T> wurzel) {
		super();
		this.tree = new Tree<T>(wurzel);
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
	
	public int summe_Aller_Kleineren(Node<T> node, int wert) {
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

	public void SAKaktualisieren(Node<T> node) {
		node.setSummeAllerKleineren(summe_Aller_Kleineren(wurzel, node.getKey()));
		if (node.getLinks() != null) {
			SAKaktualisieren(node.getLinks());
		}
		if (node.getRechts() != null) {
			SAKaktualisieren(node.getRechts());
		}

	}

	@SuppressWarnings("unused")
	public int summeZwischen(int m, int M) {
		Node<T> amNachstenDran = null;
		sucheKleinM(wurzel, m);
		int kleinM = 0;
		//weil nur summe aller kleineren vorhanden ist muss elem.key noch mit einberechnet werden
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
		// alleKleinerGrossM -(alleKleinerKleinM -kleinM)
	}

	public void sucheGrossM(Node<T> node, int M) {
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

	public void sucheKleinM(Node<T> node, int m) {
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

//    @Override
//    public Node<T> getLinkerSohn(Node<T> vater) {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    @Override
//    public Node<T> getRechterSohn(Node<T> vater) {
//        // TODO Auto-generated method stub
//        return vater.getRechts() ;
//    }
//
//    @Override
//    public Node<T> getVater(Node<T> vater) {
//        // TODO Auto-generated method stub
//        return null;
//    }
    
}
