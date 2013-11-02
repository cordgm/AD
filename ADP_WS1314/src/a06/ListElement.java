package a06;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class ListElement {
	
	//Attribute
	private int schluessel;

	//Konstruktor
	public ListElement(int schluessel) {
		this.schluessel = schluessel;
	}

	@Override
	public String toString() {
		return schluessel + ", ";
	}

	public int getSchluessel() {
		return schluessel;
	}
	
}
