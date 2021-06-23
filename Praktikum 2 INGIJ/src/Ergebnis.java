/**
 * Class representing the result of a game
 * @author jan.reuter
 *
 */
public interface Ergebnis extends Comparable{
	/*
	 * @param String name
	 * @param int zeit
	 * @param int ziffernanzahl
	 */
	/**
	 * Method to compare one Ergebnis Object to another
	 * @param e
	 * @return
	 */
	public int CompareTo(Ergebnis e);
}
