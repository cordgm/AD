package a09;

public class Node<T> {
    
    private T daten; //Die eigentliche Daten
    private int key; 
    private Node<T> links;    //Linker Sohn
    private Node<T> rechts;  //Rechter Sohn
    private Node<T> vater;   //Vater (Knoten)

    /**
     * @param daten
     * @param key
     * @param links
     * @param rechts
     * @param vater
     */
    public Node(T daten, int key, Node<T> links, Node<T> rechts, Node<T> vater) {
        super();
        this.daten = daten;
        this.key = key;
        this.links = links;
        this.rechts = rechts;
        this.vater = vater;
    }

    public T getDaten() {
        return daten;
    }

    public int getKey() {
        return key;
    }

    public Node<T> getLinks() {
        return links;
    }

    public Node<T> getRechts() {
        return rechts;
    }

    public Node<T> getVater() {
        return vater;
    }

    public void setDaten(T daten) {
        this.daten = daten;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setLinks(Node<T> links) {
        this.links = links;
    }

    public void setRechts(Node<T> rechts) {
        this.rechts = rechts;
    }

    public void setVater(Node<T> vater) {
        this.vater = vater;
    }

    /**
     * Ueberprueft, ob das Element mit dem uebergebenen Key existiert.
     * @param k Key
     * @return boolean true, wenn das Element existiert, ansonsten false.
     */
    public boolean exists(int k) {
    	if(k == key) return true;
    	else
    	{
	    	if(k < key)
		    	if(links == null) return false;
		    	else return links.exists(k);
	    	else
		    	if(rechts == null) return false;
		    	else return rechts.exists(k);
    	}
    }

    /**
     * Fuegt die Daten d mit dem Key k in den Binaeren Suchbaum ein.
     * @param d Daten
     * @param k Key
     * @return Node
     */
    Node<T> insert(T d, int k) {
	    if(k == key) return this;
	    else
	    {
		    if(k < key)
		    {
			    if(links == null)
			    {
				    links = new Node<T>(d,k, null, null, vater);
				    return links;
			    }
			    else return links.insert(d, k);
		    }
		    else
		    {
		    if(rechts == null)
		    {
			    rechts = new Node<T>(d,k, null, null, vater);
			    return rechts;
		    }
		    else return rechts.insert(d,k);
		    }
	    }
    }
}


