package ziffernfolge;

public class Ergebnisliste 
{
	private Knoten kopf=new Knoten();
	private Knoten ende=new Knoten();
	private Knoten aktueller_knoten=kopf;

	public Ergebnisliste()
	{ 
	kopf.nachfolger=ende;
	ende.nachfolger=ende;
	}



	public void fuege_ein_nach(Ergebnis element)
	{ 
	Knoten neuer_knoten=new Knoten();
	neuer_knoten.element=element;
	neuer_knoten.nachfolger=aktueller_knoten.nachfolger;
	aktueller_knoten.nachfolger=neuer_knoten;
	aktueller_knoten=neuer_knoten;
	}

	private class Knoten
	{ 
	private Ergebnis element;
	private Knoten nachfolger;
	};
}
