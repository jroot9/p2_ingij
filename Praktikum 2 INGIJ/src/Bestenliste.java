import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * 
 * @author daniel.bierbrauer
 *
 */
public interface Bestenliste // extends JPanel
{
	public void Name_eingegeben(MouseListener mouseListener);

	public void neues_Spiel(MouseListener mouseListener);

	public void neues_Erbebnis(int folgenlaenge, int spielzeit);

	public void aktiviere_Namenseingabe();

	public void zeige_Liste_an();

	public void sichtbar(boolean wert);
}
