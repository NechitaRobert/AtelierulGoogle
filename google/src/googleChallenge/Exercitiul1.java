package googleChallenge;

public class Exercitiul1 {

	public static void main(String args[]) {
		
		// printarea numarelor de la 1 la 100
		for (int i = 1; i <= 100; i++) {	
			
			// daca e divizibil cu 3 si 5 va afisa FizzBuzz 
			if (i % 3 == 0 ) {
				if (i % 5 == 0) {
					System.out.println("FizzBuzz");
				}
				// altfel daca e divizibil doar cu 3 va afisa doar fizz
				else {
					System.out.println("Fizz");
				}
			}
			// daca e divizibil doar cu 5 va afisa doar Buzz
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			
			// daca e divizibil cu 7 va afisa Rizz
			else if (i % 7 == 0) {
				System.out.println("Rizz");
			}
			
			// daca e divizibil cu 11 va afisa Jazz
			else if (i % 11 == 0) {
				System.out.println("Jazz");
			}
			
			// daca nu e divizibil nici cu 3 sau cu 5 va printa numarul
			else {
				System.out.println(i);
			}
			
			
			
		}
			
	}
	
}
