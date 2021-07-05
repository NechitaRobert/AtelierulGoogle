package composite;

import java.util.ArrayList;
// o clasa tip composite unde vom implementa metodele de baza si vom defini operatiuni legate de clasele copii
public class CursuriUniversitare implements Cursuri {

	// variabile si constructorul
	private int id;
	private String nume;
	private ArrayList<CursuriUniversitare> lista;
	public CursuriUniversitare(int id, String nume) {
		this.id = id;
		this.nume = nume;
		lista = new ArrayList<CursuriUniversitare>();
	}
	// incapsularea
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getNume() {
		return nume;
	}
	protected void setNume(String nume) {
		this.nume = nume;
	}
	protected ArrayList<CursuriUniversitare> getLista() {
		return lista;
	}
	protected void setLista(ArrayList<CursuriUniversitare> lista) {
		this.lista = lista;
	}
	// afisarea tuturor cursuriloe
	public void detaliiCursuri() {
		for (Cursuri curs : lista) {
			curs.detaliiCursuri();
		}	
	}
	// adaugarea unui curs
	public void adaugaCurs(Cursuri curs) {
		lista.add((CursuriUniversitare) curs);		
	}
	
		
}
