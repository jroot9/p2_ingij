package de.janreuteringimp2;

public class Auswahlsortierung implements Sortierung
{
  private boolean aufsteigend=true;
  
  public void sortiere(Liste liste)
  { for(Liste.Iterator i=liste.erzeuge_Iterator();!i.nach_ende();i.weiter())
    { Liste.Iterator j=finde_naechstes_Element(liste,i);
      liste.vertausche(i,j);
    }
  }

  public void setze_aufsteigend(){aufsteigend=true;};    
  public void setze_absteigend(){aufsteigend=false;};

  @SuppressWarnings("unchecked")
  private Liste.Iterator finde_naechstes_Element(Liste liste,Liste.Iterator i)
  { Liste.Iterator j=liste.erzeuge_Iterator(i);
    Liste.Iterator k=liste.erzeuge_Iterator(i);
    for(k.weiter();!k.nach_ende();k.weiter())
    { int k_vergleich_j=k.element().compareTo(j.element());
      if(k_vergleich_j<0 && aufsteigend) j=liste.erzeuge_Iterator(k);
      else if(k_vergleich_j>0 && !aufsteigend) j=liste.erzeuge_Iterator(k);
    }
    return j;
  }
}
