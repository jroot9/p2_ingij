package de.janreuteringimp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortierungTest
{
  @Test public void Sortierung_sortieren()
  { Sortierung s=new Auswahlsortierung();
    Liste liste=new VerketteteListe(); 
    for(int i=1;i<10;i++) liste.setze_an_Anfang(i);
    s.sortiere(liste);
    int n=0;
    for(Liste.Iterator i=liste.erzeuge_Iterator();!i.nach_ende();i.weiter())
    { n++;
      int soll=n;
      int ist=(Integer)(i.element());
      assertEquals("Liste wurde nicht aufsteigend sortiert",soll,ist);  
    }
    s.setze_absteigend();
    s.sortiere(liste);
    n=10;
    for(Liste.Iterator i=liste.erzeuge_Iterator();!i.nach_ende();i.weiter())
    { n--;
      int soll=n;
      int ist=(Integer)(i.element());
      assertEquals("Liste wurde nicht absteigend sortiert",soll,ist);  
    }  
    s.setze_aufsteigend();
    s.sortiere(liste);
    n=0;
    for(Liste.Iterator i=liste.erzeuge_Iterator();!i.nach_ende();i.weiter())
    { n++;
      int soll=n;
      int ist=(Integer)(i.element());
      assertEquals("Liste wurde nicht aufsteigend sortiert",soll,ist);  
    }
  }
}  


