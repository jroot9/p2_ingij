package ziffernfolge;

import java.awt.Color;
import java.awt.SystemColor;


import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class Spielkonsole extends JPanel {

static final int hoehe=100;
static final int breite=100;

/** Erzeugt eine neue Spielkonsole.
    Die Abmessungen werden automatisch so eingestellt, dass
    die neun Ziffernfelder genug Platz haben. Die Spielkonsole erzeugt
    eine Steuerung, die erlaubt, das Spiel zu kontrollieren. 
    Ist die Spielkonsole erzeugt, wird der Steuerung der Eintritt des 
    Ereignisses "Spiel gestartet" übermittelt.*/
public Spielkonsole()
{ this.setBorder(new LineBorder(new Color(0, 0, 0)));
  this.setBackground(SystemColor.controlHighlight);
  this.setSize(breite,hoehe); 
  this.setLayout(null);
  
}

public void melde_an(Steuerung steuerung) {
	
	
}
	
	
	

}
