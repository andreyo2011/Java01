package clinica;

public class Specialitati_camp {

	private Integer id_specialitate;
	private String nume;
	private Integer licenta;//FK
	
	public Specialitati_camp(int id_specialitate, String nume, int licenta) {
		
		this.id_specialitate = id_specialitate;
		this.nume = nume;
		this.licenta = licenta;
		
	}
	void Afiseaza() {
		
		System.out.println(id_specialitate+" "+ nume+ " " + licenta);
		
	}
}
