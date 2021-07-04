package composite;

// clasa main unde are acces la elementele de compozitie utilizand clasa composite 
public class Main {
	
	public static void main(String agrs[]) {
		CursuriProgramare programare = new CursuriProgramare(1, "programareOOP");
		CursuriMatematica matematica = new CursuriMatematica(2, "matematica");
		CursuriUniversitare departament = new CursuriUniversitare(3, "analizaSoftware");
		
		departament.adaugaCurs(programare);
		departament.adaugaCurs(matematica);
		departament.detaliiCursuri();
		
		
	}

}
