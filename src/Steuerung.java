import java.awt.event.MouseListener;

public class Steuerung
{     
  public static final MouseListener MouseEvent = null;
private Spielkonsole spielkonsole;
  // Zustaende
  private Start start=new Start();
  private Praesentation_Ziffernfolge praesentation_ziffernfolge=new Praesentation_Ziffernfolge();
  private Memorieren_Ziffernfolge memorieren_ziffernfolge=new Memorieren_Ziffernfolge();
  private Eingabe_Name eingabe_name=new Eingabe_Name();
  private Anzeige_Bestenliste anzeige_bestenliste=new Anzeige_Bestenliste();
  private Spiel_beendet spiel_beendet=new Spiel_beendet();
  
  // aktueller Zustand der Spielkonsole.
  private Zustand zustand=start; 
  
  /** Erzeugt eine Steuerung fuer eine Spielkonsole.
      @param spielkonsole Spielkonsole, welche gesteuert
             werden soll. */
  public Steuerung(Spielkonsole spielkonsole)
  { this.spielkonsole=spielkonsole;
  }
  
  /** Ereignis. Teilt der Steuerung mit, dass das Spiel gestartet worden ist.*/
  public void spiel_gestartet()
  { zustand.spiel_gestartet();
  }

  /** Ereignis. Teilt der Steuerung mit, dass die Praesentation der Ziffernfolge
      beendet worden ist.*/
  public void praesentation_Ziffernfolge_beendet()
  { zustand.praesentation_Ziffernfolge_beendet();
  }

  /** Ereignis. Teilt der Steuerung mit, dass der Spieler eine
      Ziffer ausgewaehlt hat*/
  public void ziffer_ausgewaehlt(Ziffer ziffer)
  { zustand.ziffer_ausgewaehlt(ziffer); 
  }
  
  /** Ereignis. Teilt der Steuerung mit, dass ein neues Spiel gestartet wird.*/
  public void neues_Spiel()
  { zustand.neues_Spiel(); 
  }
  
  /** Ereignis. Teilt der Steuerung mit, dass ein Name eingegeben worden ist.*/
  public void Name_eingegeben()
  { zustand.Name_eingegeben(); 
  }

  // abstrakte Zustandsklasse mit Standardverhalten
  private abstract class Zustand
  {
    public void spiel_gestartet(){};
    public void praesentation_Ziffernfolge_beendet(){};
    public void ziffer_ausgewaehlt(Ziffer ziffer){};
    public void neues_Spiel(){};
    public void Name_eingegeben(){};
    public void entry(){};
    public void exit(){};   
    
    // Umschalten auf neuen Zustand
    public void naechster_Zustand(Zustand neuer_zustand)
    { exit(); 
      zustand=neuer_zustand;
      neuer_zustand.entry();
    }
  }

  // Zustand Start
  private class Start extends Zustand
  {  
    @Override
	public void spiel_gestartet()
    { naechster_Zustand(praesentation_ziffernfolge);
    }
  }  
   
  // Zustand Praesentation_Ziffernfolge
  private class Praesentation_Ziffernfolge extends Zustand
  { 
    @Override
	public void entry() 
    { spielkonsole.starte_Praesentation_Ziffernfolge();
    }
    
    @Override
	public void praesentation_Ziffernfolge_beendet()
    { naechster_Zustand(memorieren_ziffernfolge);
    }
  }
  
  // Zustand Memorieren_Ziffernfolge
  private class Memorieren_Ziffernfolge extends Zustand
  { 
    @Override
	public void ziffer_ausgewaehlt(Ziffer ziffer)
    { if(spielkonsole.ausgewaehlte_Ziffer_korrekt(ziffer)
         && !spielkonsole.alle_Ziffern_memoriert())
      { ziffer.leuchte_gruen_auf();
        spielkonsole.naechste_Sollziffer();
        naechster_Zustand(memorieren_ziffernfolge);
        return;
      }
      if(spielkonsole.ausgewaehlte_Ziffer_korrekt(ziffer)
         && spielkonsole.alle_Ziffern_memoriert())
      { ziffer.leuchte_gruen_auf();      
        naechster_Zustand(praesentation_ziffernfolge);
        return;
      }
      if(!spielkonsole.ausgewaehlte_Ziffer_korrekt(ziffer))
      { // Fehler
    	  ziffer.leuchte_rot_auf();
        naechster_Zustand(spiel_beendet);
        return;
      }
    }
  }
  
  // Zustand Anzeige_Bestenliste
  private class Anzeige_Bestenliste extends Zustand
  { 
    @Override
	public void neues_Spiel()
    { //Bestenliste.neues_Spiel(MouseEvent e);
    }
    
    @Override
	public void exit()
    { Bestenliste.sichtbar(false);
    }
  }
  
  // Zustand Eingabe_Name
  private class Eingabe_Name extends Zustand
  { 
    @Override
	public void Name_eingegeben()
    { naechster_Zustand(anzeige_bestenliste);
    }
    
    @Override
	public void entry() 
    { Bestenliste.sichtbar(true);
      Bestenliste.aktiviere_Namenseingabe();
      
    }
  }
  
  // Zustand Spiel_beendet
  private class Spiel_beendet extends Zustand
  { 
    @Override
	public void ziffer_ausgewaehlt(Ziffer ziffer)
    { naechster_Zustand(praesentation_ziffernfolge);
    }

    @Override
	public void exit() 
    { spielkonsole.beginne_neue_Ziffernfolge();
    }
  }
}