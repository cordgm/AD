package a07;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class ListElement {
	
	//Attribute
	private long schluessel;

	//Konstruktor
	public ListElement(long l) {
		this.schluessel = l;
	}

	@Override
	public String toString() {
		return schluessel + ", ";
	}

	@Override
	public int hashCode() {
		return (int)schluessel;
	}
	
}
