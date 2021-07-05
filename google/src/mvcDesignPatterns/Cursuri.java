package mvcDesignPatterns;

// acesta e un exemplu de MVC design pattern iar ca exemplu sa presupunem ca o facultate are nevoie de o baza
// de date cu cursurile pe care le preda studentilor 
public class Cursuri {
	// clasa aceasta e Model ce e utilizat pt a mentine actualizarea controlerului daca informatiile se schimba 
	
	// variabile
	private String denumire;
	private double pret;
	
	// constructorul
	public Cursuri() {}
	public Cursuri(String denumire, double pret) {
		this.denumire = denumire;
		this.pret = pret;
	}
	
    // getter si setter 
	protected String getDenumire() {
		return denumire;
	}
	protected void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	
	protected double getPret() {
		return pret;
	}
	protected void setPret(double pret) {
		this.pret = pret;
	}
	
	
}
