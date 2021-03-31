package clinica;

public class ProfilPacient extends Persoana {
	

	private AbonamentMedical abonament;
	
	public ProfilPacient(int CNP,String nume,String prenume,AbonamentMedical ab) {
		
		super(CNP,nume,prenume);
		this.abonament = ab;
		
	}
	
}
