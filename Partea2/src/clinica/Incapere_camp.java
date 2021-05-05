package clinica;

public class Incapere_camp {
	
	private Integer id_incapere;
	private String cod_sala;
	
	public Incapere_camp(int id_sala, String cod_sala) {
		
		this.id_incapere = id_sala;
		this.cod_sala = cod_sala;
		
	}
	
	void Afiseaza() {
		
		System.out.println(id_incapere+" "+cod_sala);
	}

}
