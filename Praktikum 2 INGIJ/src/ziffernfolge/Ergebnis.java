package ziffernfolge;

public class Ergebnis {
	private String name;
	private int spielzeitInSekunden;
	private int reihenlaenge;
	/**
	 * Konstruktor
	 * 
	 * @param String name
	 * @param int spielzeitInSekunden
	 * @param int reihenlaenge
	 * 
	 * public Ergebnis(String name, int spielzeitInSekunden, int reihenlaenge); 
	 */
	
	public Ergebnis(String name, int spielzeitInSekunden, int reihenlaenge)
	  { this.name= name;
	    this.spielzeitInSekunden = spielzeitInSekunden;
	    this.reihenlaenge = reihenlaenge;
	  }
	  
	/**
	 * Ruekgabe Stringvariable name.
	 * 
	 * @return String name
	 * 
	 */
	public String getName() {
		return name;
	}
	/**
	 * Rueckgabe intvariable spielzeitInSekunden.
	 * 
	 * @return int spielzeitInSekunden
	 * 
	 */
	public int getSpielzeitInSekunden() {
		return spielzeitInSekunden;
	}
	/**
	 * Rueckgabe intvariable reihenlaenge.
	 * 
	 * @return int reihenlaenge
	 */
	public int getReihenlaenge() {
		return reihenlaenge;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setReihenlaenge(int reihenlaenge) {
		this.reihenlaenge = reihenlaenge;
	}
	
	public void setSpielzeitInSekunden(int spielzeitInSekunden) {
		this.spielzeitInSekunden = spielzeitInSekunden;
	}
	
	
	

	
 

}
