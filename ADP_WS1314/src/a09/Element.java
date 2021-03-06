package a09;

/**
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 */
public class Element {

	//Attribute
	private long schluessel;

	public Element(long schluessel) {
		super();
		this.schluessel = schluessel;
	}

	@Override
	public boolean equals(Object obj) {
		Element other = (Element) obj;
		if (schluessel != other.schluessel)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return schluessel + " ";
	}
	
}
