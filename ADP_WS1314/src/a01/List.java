package a01;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 * @param <T>
 *
 */
public class List<T> implements IList<T> {

    //Attribute
    private Node<T> tail;
    private Node<T> head;
    private int size;
    private int zaehler;
    
    //Constructor
	public List() {
		super();
		this.tail = new Node<T>(head, null);
		this.head = new Node<T>(tail, null);	//head zeigt auf tail
		this.size = 0;
		
		//tail.setNext(head);						//tail zeigt auf head
		zaehler = 0;
	}

    @Override
    public boolean insert(Node<T> node, T data) {
    	
    	if(node == null){
    		return false;
    	}
        
        if(node != tail && node.getNext() != null) { //Ist nicht tail, hat einen nächsten.
            Node<T> tmp = new Node<T>(node.getNext(), data); //
            node.setNext(tmp); //Vom Vorgänger, "next" ändern. Das Element a(p) wird indiziert durch den next-Zeiger des Elements a(p-1)
            size++;
            zaehler += 8;
            return true;
            
        } else if(node == tail) { //Wenn data an der Position tail eingefügt werden soll. 
            Node<T> tmp = new Node<T>(null, null); //Neuer (tail) wird erzeugt
            this.tail.setData(data);
            this.tail.setNext(tmp);
            this.tail = tmp; //Der neue dummynode ist jetzt tail.
            this.tail.setNext(node);
            size++;
            zaehler += 10;
            return true;
            
        }
        
        return false;
    }

    @Override
    public boolean delete(Node<T> node) {
        if(size == 0){
        	return false;
        }
        if(size == 1 && node == head){	//wenn ein Element drin ist und nicht head und nicht tail
        	this.head.setNext(this.tail);
        	this.tail.setNext(this.head);
        	size--;
        	return true;
        }
        if((node != tail) || (node.getNext() != tail)) {
            node.setNext(node.getNext().getNext()); //Der Vorgänger wurde übergeben!!!
            size--;
            zaehler += 6;
            return true;
        }
        
        return false;
    }

    @Override
    public Node<T> find(T data) { //Suche durch Stopper Technik.
        Node<T> tmp;
        this.tail.setData(data); //Die Daten als Stopper
        for(tmp = this.head; tmp.getData() != data; tmp = tmp.getNext() ) {
//        	zaehler += 4;
        }
        
//        zaehler += 4;
        
        if(tmp == this.tail) { //Wenn tail erreicht ist, wurde nichts gefunden
            this.tail.setData(null); //Wieder zurückändern.
            return null; 
        } else {
            this.tail.setData(null);
            return tmp;
        }
        
    }

    @Override
    public T retrieve(Node<T> node) {
        
        if(node != tail) {
        	zaehler += 3;
            return (node.getNext().getData()); 
        }
        
        return null; 
    }

    @Override
    public IList<T> concat(List<T> list) {
        
        this.size = size + list.getSize();

        this.tail.setData(list.getHead().getNext().getData());	//bei tail muss hier Data und Next geaendert werden, in anderen Worten: tail bekommt hier die Eigenschaften vom Nachfolger von head der 2. Liste
        this.tail.setNext(list.getHead().getNext().getNext());
        this.tail = list.getTail();								//hier wird als neues tail, das tail von der 2. Liste genommen
        this.tail.setNext(this.head);							//das neue tail zeigt auf head
        
        zaehler += 14;
        return this;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public Node<T> getHead() {
        return head;
    }

    public int getSize() {
        return this.size;
    }


    public int getZaehler() {
		return zaehler;
	}

	public void setZaehlerNull() {
		this.zaehler = 0;
	}

	@Override
    public String toString() {
        return "List [tail=" + tail + ", head=" + head + ", size=" + size + "]";
    }

    public void showAll() {
        Node<T> tmp = head;
        System.out.println("*******Anfang der List*******");
        do{
            System.out.println("Node: " + tmp + "\nDATA: " + tmp.getData() + "\nNext:  " + tmp.getNext() + "\n");
            tmp = tmp.getNext();
        }while(tmp.getData() != null);
        
        System.out.println("Node: " + tmp + "\nDATA: " + tmp.getData() + "\nNext:  " + tmp.getNext() + "\n");
        tmp = tmp.getNext();
        
        System.out.println("Size: " + size);
    
        System.out.println("*******Ende der List*******\n\n");
    }

}
