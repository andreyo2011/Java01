package clinica;

public class Doctor_camp extends Angajat_camp {
	
	public Doctor_camp(int licenta,String nume,String prenume) {
		
		super(licenta,nume,prenume);
		
	}
	
	void Afiseaza() {
		System.out.println(licenta+" "+nume+" "+prenume);
	}
}
