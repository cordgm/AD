package a02;

/**
 * 
 * @author Manuel Meyer und Cord Godehus-Meyer
 *
 * @param <T>
 */
public interface IStack<T> {
	
	/**
	 * Stack neu initialisieren.
	 */
	public void init();
	
	/**
	 * Liefert das erste Element von Liste L ohne es zu loeschen.
	 * Das oberste Element des Stacks.
	 * @return T 
	 */
	public T top();
	
	/**
	 * Fuegt Element am Ende des Stacks ein.
	 * @param elem Das hinzuzufügene Element
	 */
	public void pushtail(T elem);
	
	/**
	 * entfernt das letztes Element.
	 */
	public void poptail();
	
	/**
	 * Prüft ob der Stack leer ist.
	 * Gibt true zurück, wenn der Stack leer ist, Ansonsten false.
	 * @return boolean
	 */
	public boolean isempty();
}
