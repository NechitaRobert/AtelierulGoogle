package composite;

// o clasa "leaf" unde definim cursurile de matematica
public class CursuriMatematica implements Cursuri {

	// variabile si constructor
    private int id;
    private String nume;
	public CursuriMatematica(int id, String nume) {
		this.id = id;
		this.nume = nume;
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
	// afisare
	public void detaliiCursuri() {
		System.out.println(id + " " + nume);
		
	}

	
	
}
