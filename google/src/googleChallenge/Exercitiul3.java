package googleChallenge;

import java.util.Arrays;

public class Exercitiul3 {
	
	
	// metoda 
	public static void perechi(int array[], int lungime , int suma ) {
		
		// sortarea arrayului
		Arrays.sort(array);
		
		// indici care indica punctele matricei
		int i = 0;
		int j = lungime -1;
		
	    // cautarea in loop a elementelor
		while (i < j) {
			
			// daca suma celor 2 e mai mica sau egala ca 0 si valoarea primului
			// indice e mai mic decat al 2-lea
			while ((array[i] + array[j])<= suma && i < j) {
				// daca suma celor 2 e egala cu suma
				if ((array[i] + array[j]) == suma) 
					// printare
					System.out.println(array[i] + " " + array[j]);
				i++;
			}
			j--;
			// idem doar ca luam invers
			while ((array[i] + array[j]) >= suma && i < j) {
				if ((array[i] + array[j]) == suma) 
					System.out.println(array[i] +  " " + array[j]);
			j--;
			}
		}
		
	}
	
    public static void main(String args[]) {
    	
    	int unArray[] = {3,2,-3,-2,3,0};
    	perechi(unArray, 6 , 0);
    	
    	
	}
	
}
