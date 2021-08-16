package de.janreuteringimp2;

public class Caesar {
	private int key;
	public void Schluessel(int in_wert) {
		this.key = in_wert;
		while(key>26) key-=26;
	}	
	public void verschluesseln(String inout_text) {
		String verschluesselter_Text = "";
		for(int i = 0; i<inout_text.length(); i++) {
			verschluesselter_Text += (inout_text.charAt(i)+key);
		}
	}
	public void entschluesseln(String inout_text) {
		String unverschluesselter_Text = "";
		for(int i = 0; i<inout_text.length();i++) {
			unverschluesselter_Text+=(inout_text.charAt(i)-key);
		}
	}
	
}
