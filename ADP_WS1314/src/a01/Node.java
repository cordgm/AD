package a01;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class Node<T> {
	
	//Attribute
	private Node<T> next;
	private T data;
	
	//Constructor
	public Node(Node<T> next, T data) {
		super();
		this.next = next;
		this.data = data;
	}

	//Getters und Setters
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("unchecked")
		Node<T> other = (Node<T>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		return true;
	}
	
	
}
