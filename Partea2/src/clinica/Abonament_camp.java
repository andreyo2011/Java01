package clinica;

public class Abonament_camp {

	private Integer id_abonament;
	private String nume;
	private Integer valoare;
	private Integer suma_consultatii,suma_proceduri;
	
	public Abonament_camp(int id_abonament,String nume,int suma,int suma_consultatii,int suma_proceduri) {
		
		this.id_abonament = id_abonament;
		this.nume = nume;
		this.valoare = suma;
		this.suma_consultatii = suma_consultatii;
		this.suma_proceduri = suma_proceduri;
		
	}
	
	void Afiseaza() {
		
		System.out.println(id_abonament+" "+nume+" "+valoare+" "+suma_consultatii+" "+suma_proceduri);
		
	}
	
}
