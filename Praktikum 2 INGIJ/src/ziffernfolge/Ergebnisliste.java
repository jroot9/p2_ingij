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

	public Ergebnis erstes_Element() throws leer_Ausnahme
	{ 
	if(kopf.nachfolger==ende) throw new leer_Ausnahme();
	aktueller_knoten=kopf.nachfolger;
	return aktueller_knoten.element;
	}
	
	public Ergebnis naechstes_Element() throws leer_Ausnahme,ende_Ausnahme 
	{ 
	if(kopf.nachfolger==ende) throw new leer_Ausnahme();
	if(aktueller_knoten.nachfolger==ende) throw new ende_Ausnahme();
	aktueller_knoten=aktueller_knoten.nachfolger;
	return aktueller_knoten.element;
	}


	public boolean ende_erreicht()
	{ 
	return aktueller_knoten.nachfolger==ende;
	}

	public class leer_Ausnahme extends RuntimeException
	{ 
	private static final long serialVersionUID = 1L;
	};    

	public class ende_Ausnahme extends RuntimeException
	{ 
	private static final long serialVersionUID = 1L;
	};

	private class Knoten
	{ 
	private Ergebnis element;
	private Knoten nachfolger;
	};
}
