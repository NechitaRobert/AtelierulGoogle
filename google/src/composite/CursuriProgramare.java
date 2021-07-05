package composite;

// o clasa "leaf" unde definim cursurile de programare
public class CursuriProgramare implements Cursuri {
    
	// variabilele si constructorul
	private int id;
	private String nume; 
	public CursuriProgramare(int id, String nume) {
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
	// afisarea
	@Override
	public void detaliiCursuri() {
		System.out.println(id + " " + nume);
		
	}

	
	
}
