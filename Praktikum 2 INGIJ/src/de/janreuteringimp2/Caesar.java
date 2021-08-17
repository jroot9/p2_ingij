package de.janreuteringimp2;

public class Caesar implements Kryptomethode {
	private int key;
	private String unverschluesselterText;
	private String verschluesselterText;
	public String getUnverschluesselterText() {
		return unverschluesselterText;
	}

	public String getVerschluesselterText() {
		return verschluesselterText;
	}
	@Override
	public void Schluessel(String wert) {
		this.key = Integer.parseInt(wert);
		while (key > 26)
			key -= 26;
	}

	@Override
	public void verschluesseln(StringBuffer text) {
		verschluesselterText = "";
		int maximumCharValue;
		String inout_text = asciiConverter(text.toString());
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
	public void entschluesseln(StringBuffer text) {
		unverschluesselterText = "";
		String in_text = text.toString();
		int minimumCharValue;
		for (int i = 0; i < text.length(); i++) {
			minimumCharValue = 65;
			if ((int) in_text.charAt(i) >= 97) minimumCharValue = 97; 
				if ((int) in_text.charAt(i) < minimumCharValue + key) {
					unverschluesselterText += ((char) (in_text.charAt(i) + 26 - key));
				} else {
					unverschluesselterText += ((char) (in_text.charAt(i) - key));
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
