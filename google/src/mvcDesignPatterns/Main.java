package mvcDesignPatterns;

import java.util.Scanner;

// clasa main
public class Main {

	// creearea unui scanner pt a adauga informatii
	static Scanner scan = new Scanner(System.in);	
	public static Cursuri adaugareCursuri() {
		Cursuri curs = new Cursuri();
		System.out.println("Specificati numele cursului pe care doriti sa il introduceti");
		String denumire = scan.next();
		curs.setDenumire(denumire);
		System.out.println("Specificati pretul cursului pe care doriti sa il introduceti");
		double pret = scan.nextDouble();
		curs.setPret(pret);
		return curs;
	}
	
	// metoda main
	public static void main(String args[]) {
		System.out.println("Baza de date de cursuri la facultate");
		Cursuri curs = adaugareCursuri();
		VizualizareCursuri vizualizare = new VizualizareCursuri();
		ControllerCursuri actualizare = new ControllerCursuri(curs, vizualizare);
		actualizare.afisareCursuri();
	}
}
