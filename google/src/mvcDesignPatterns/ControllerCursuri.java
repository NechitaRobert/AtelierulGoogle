package mvcDesignPatterns;

public class ControllerCursuri {

	// actesta este controllerul si are rolul de a mentine fluxul de date.Functioneaza ca o "punte" intre view 
	// si model
	// variabile
	private Cursuri curs;
	private VizualizareCursuri vizualizare;
	
	//constructorul
	public ControllerCursuri(Cursuri curs, VizualizareCursuri vizualizare) {
		this.curs = curs;
		this.vizualizare = vizualizare;
	}
	
    // getter si setter
	public void setNumeCurs(String denumire) {
		curs.setDenumire(denumire);
	}
	public String getNumeCurs() {
		return curs.getDenumire();
	}
	public void setPretCurs(double pret) {
		curs.setPret(pret);
	}
	public double getPretCurs() {
		return curs.getPret();	
	}
	public void afisareCursuri() {
		vizualizare.detaliiCursuri(curs.getDenumire(), curs.getPret());
	}
}
