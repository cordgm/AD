package a06;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class ListElement {
	
	//Attribute
	private long schluessel;

	//Konstruktor
	public ListElement(long schluessel) {
		this.schluessel = schluessel;
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
