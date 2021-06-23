/**
 * 
 * @author jules.kornas
 *
 */
public interface Spielkonsole {
	public void sichtbar(boolean wert);

	public void starte_Praesentation_Ziffernfolge();

	public void beginne_neue_Ziffernfolge();

	public void Ziffer_ausgewaehlt(Ziffer ziffer);

	public boolean ausgewaehlte_Ziffer_korrekt(Ziffer ziffer);

	public boolean alle_Ziffern_Memoriert();

	public int Spielzeit();

	public int Laenge_Ziffernfolge();

}
