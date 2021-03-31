package clinica;

public class Doctor extends Persoana {
	
	private int cod_licenta;
	
	public Doctor(int CNP,String nume,String prenume,int licenta) {
		
		super(CNP,nume,prenume);
		this.cod_licenta = licenta;
		
	}

}
