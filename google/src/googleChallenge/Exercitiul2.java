package googleChallenge;


public class Exercitiul2 {
	
	// creearea unui separator intre elemente
	public static String LINE_SEPARATOR = System.clearProperty("line.separator");
    
	// metoda de calcul
	public static String compute(int numereInFooBarQix) {
		String rezultat = "";
		 // cautam daca exista elemente cu 3, 5 sau 7
		 if (numereInFooBarQix % 3 == 0 ) {
			   rezultat = "FOO";
		    } else if (numereInFooBarQix % 5 == 0) {
			   rezultat = "BAR";
		    } else if (numereInFooBarQix % 7 == 0) {
			   rezultat = "QIX";
		    }
		String cifreSchimbateInCuvinte = String.valueOf(numereInFooBarQix);
		// cautam daca exita elemente cu 3 , 5 si 7
		for (int i = 0; i < cifreSchimbateInCuvinte.length(); i++ ) {
			char elemente =  cifreSchimbateInCuvinte.charAt(i);
			if (elemente == '3')
				rezultat += "FOO";
			if (elemente == '5')
				rezultat += "BAR";
			if (elemente == '7') {
				rezultat += "QIX";
			}
		}
		return rezultat.isEmpty() ? String.valueOf(numereInFooBarQix) : rezultat;
	}
	
	// raza de cautare de la ce numar pana la cat
	public static String razaCautarii (int celMic, int celMare) {
		String output = "";
		for (int i = celMic; i <= celMare; i++) {
			output += compute(i) + (i == celMare ? "" : LINE_SEPARATOR);
		}
		return output;
	}
	
	// selectarea numerelor
	public static String UnuLaOSuta() {
		return razaCautarii(1,100);
	}

	
	public static void main (String args[]) {
		System.out.println(Exercitiul2.UnuLaOSuta());
		
	}
	
	
	
	
}
