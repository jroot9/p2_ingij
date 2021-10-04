package ziffernfolge;

public class Komprimieren implements Komprimierung {
	// Konstruktor für Implementierungen:
	  /** Ein Komprimierer und ein Dekomp
	   * rimierer werden bereitgestellt. */ 
	public Komprimieren() {
		
	}
	
	/** Der Text wird komprimiert. Wenn fuer den Text 
    ein Null-Zeiger uebergeben wird, wird nicht 
    komprimiert.
    @param text der zu komprimierende Text.*/
public String komprimieren(String text) {
	
	String ausgabe="";

	int n = text.length();
    for (int i = 0; i < n; i++) {
    	
    	int zaehler = 1;
        while (i < n - 1 && text.charAt(i) == text.charAt(i + 1)) {
            zaehler++;
            i++;
        }
        
        ausgabe = ausgabe + Integer.toString(zaehler)+text.charAt(i);
    }
    return ausgabe;
	
}
/** Der Text wird expandiert. Wenn fuer den Text 
ein Null-Zeiger uebergeben wird, wird nicht 
expandiert.
@param text der zu expandierende Text.*/

public String expandieren(String text) {
	final StringBuilder sb = new StringBuilder();

    final char[] buchstabenkette = text.toCharArray();

    int i = 0;
    while (i < buchstabenkette.length) {
        int repeat = 0;
        while ((i < buchstabenkette.length) && Character.isDigit(buchstabenkette[i])) {
            repeat = repeat * 10 + buchstabenkette[i++] - '0';
        }
        final StringBuilder s = new StringBuilder();
        while ((i < buchstabenkette.length) && !Character.isDigit(buchstabenkette[i])) {
            s.append(buchstabenkette[i++]);
        }

        if (repeat > 0) {
            for (int j = 0; j < repeat; j++) {
                sb.append(s.toString());
            }
        } else {
            sb.append(s.toString());
        }
    }
    return sb.toString();
}

}
