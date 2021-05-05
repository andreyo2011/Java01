package clinica;

public class ProfilPacient_camp {
	
	private Integer CNP;//PK
	private Integer id_abonament;//FK
	private String nume,prenume;
	
	public ProfilPacient_camp() {}
	public ProfilPacient_camp(int CNP,int id_abonament,String nume,String prenume){
		
		this.CNP = CNP;
		this.id_abonament = id_abonament;
		this.nume = nume;
		this.prenume = prenume;
		
	}
	
	void Afiseaza() {
		System.out.println(CNP+" "+id_abonament+" "+nume+" "+prenume);
	}
	
	//void Seteaza
	
	
}
