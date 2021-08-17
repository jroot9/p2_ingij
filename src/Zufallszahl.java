/** abstrakter Datentyp: Zufallszahlengeneratoren. Es werden pseudozufällige Zufallszahlenreihen erzeugt, die
    gleichverteilt sind. 
    @author Andreas Kurz 
    @version 22.02.2021 */
public interface Zufallszahl
{ // Konstruktor für Implementierungen:
  /** Ein Zufallszahlengenerator wird bereitgestellt. Die Startzahl der Zufallszahlenreihe
      wird automatisch  für diesen Generator individuell gewählt.*/
  //public <Zufallszahl_Implementierung>();
	
  // Konstruktor für Implementierungen:	
  /** Ein Zufallszahlengenerator wird bereitgestellt. Die Startzahl der Zufallszahlenreihe
      wird automatisch für diesen Generator individuell gewählt.      
      @param von die kleinste moegliche Zahl. Wird eine negative
      Zahl fuer diesen Parameter angegeben, ist die kleinste 
      moegliche Zahl 0. Ist "von" groesser als "bis", ist die
      die kleinste moegliche Zahl "bis"; 
      @param bis die groesste mögliche Zahl. Wird eine negative
      Zahl fuer diesen Parameter angegeben, ist die groesste 
      moegliche Zahl 0. Ist "bis" kleiner als "von", ist die
      die groesste moegliche Zahl "von" */
  //public <Zufallszahl_Implementierung>(int von, int bis);
	
  /** Die naechste ganzzahlige Zufallszahl wird ausgegeben. 
      Sie liegt im Bereich von einschliesslich 0 bis einschliesslich 100, wenn
      bei der Konstruktion des Generators nichts anderes definiert wurde.
   public int naechste();    

  /** Die naechste ganzzahlige Zufallszahl wird ausgegeben. 
      Sie liegt im angegebenen Bereich.
      @param von die kleinste moegliche Zahl. Wird eine negative
      Zahl fuer diesen Parameter angegeben, ist die kleinste 
      moegliche Zahl 0. Ist "von" groesser als "bis", ist die
      die kleinste moegliche Zahl "bis"; 
      @param bis die groesste mögliche Zahl. Wird eine negative
      Zahl fuer diesen Parameter angegeben, ist die groesste 
      moegliche Zahl 0. Ist "bis" kleiner als "von", ist die
      die groesste moegliche Zahl "von"*/
  public int naechste(int von, int bis);
}

