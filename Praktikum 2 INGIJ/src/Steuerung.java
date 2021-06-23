/**
 * 
 * @author jules.kornas
 *
 */
public interface Steuerung {
	public void Spiel_gestartet();

	public void Praesentation_Ziffernfolge_beendet();

	public void Ziffer_ausgewaehlt(Ziffer ziffer);

	public void neues_Spiel();

	public void Name_eingegeben();

}
