package de.janreuteringimp2;

public class Caesar implements Kryptomethode {
	private String unverschluesselterText;
	private String verschluesselterText;

	public String getUnverschluesselterText() {
		return unverschluesselterText;
	}

	public String getVerschluesselterText() {
		return verschluesselterText;
	}

	private int key;
	@Override
	public void Schluessel(int in_wert) {
		this.key = in_wert;
		while (key > 26)
			key -= 26;
	}
	@Override
	public void verschluesseln(String inout_text) {
		verschluesselterText = "";
		int maximumCharValue;
		inout_text = asciiConverter(inout_text);
		for (int i = 0; i < inout_text.length(); i++) {
			maximumCharValue = 90;
			if((int)inout_text.charAt(i)>=97) maximumCharValue = 122;
			if ((int) inout_text.charAt(i) > (maximumCharValue - key)) {
				verschluesselterText += ((char) (inout_text.charAt(i) - 26 + key));
			} else {
				verschluesselterText += ((char) (inout_text.charAt(i) + key));
			}
		}
	}
	@Override
	public void entschluesseln(String inout_text) {
		unverschluesselterText = "";
		int minimumCharValue;
		for (int i = 0; i < inout_text.length(); i++) {
			minimumCharValue = 65;
			if ((int) inout_text.charAt(i) >= 97) minimumCharValue = 97; 
				if ((int) inout_text.charAt(i) < minimumCharValue + key) {
					unverschluesselterText += ((char) (inout_text.charAt(i) + 26 - key));
				} else {
					unverschluesselterText += ((char) (inout_text.charAt(i) - key));
				}
		}
	}
		public String asciiConverter(String textToConvert) {
			String convertedText = "";
			for(int i = 0; i<textToConvert.length();i++) {
				int charAsInteger = (int) textToConvert.charAt(i);
				if(charAsInteger > 224 && charAsInteger < 231) {
					convertedText += "ae";
				} else if(charAsInteger > 191 && charAsInteger < 199) {
					convertedText += "Ae";
				} else if(charAsInteger > 209 && charAsInteger < 217) {
					convertedText += "Oe";
				} else if(charAsInteger > 216 && charAsInteger < 222) {
					convertedText += "Ue";
				} else if(charAsInteger > 241 && charAsInteger < 247) {
					convertedText += "oe";
				} else if(charAsInteger > 249 && charAsInteger < 253) {
					convertedText += "ue";
				} else if((charAsInteger > 64 && charAsInteger < 91) ||(charAsInteger>96 && charAsInteger <123)) {
					convertedText += textToConvert.charAt(i);
				} else if(charAsInteger == 223) {
					convertedText += "ss";
				} else {
					convertedText += "";
				}
			}
			return convertedText;
		}
}
