package a02;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * @param <T>
 */
public class Stack<T> implements IStack<T> {
	
	//Attribute
	private int size;
	private int top;	//zeigt auf das Element über dem Obersten
	private T a[];
	
	//Konstruktor
	@SuppressWarnings("unchecked")
	public Stack(int arrayLength) {
		super();
		this.size = arrayLength;
		this.top = 0;
		a =  (T[]) new Object[arrayLength];		//Object, weil "Cannot create a generic array of T"
	}

	@Override
	public void init() {
		this.size = 0;
	}

	@Override
	public T top() {
//		if(top > 0){	//damit kein nullpointer exception geworfen wird
			return a[top-1];
//		}
//		return null;
	}

	@Override
	public void pushtail(T elem) {
		if(top < size){
			a[top++] = elem;
		}
	}

	@Override
	public void poptail() {
		if(top > 0){
			top--;	
		}
	}

	@Override
	public boolean isempty() {
		if(size == 0){
			return true;
		}
		return false;
	}
}
