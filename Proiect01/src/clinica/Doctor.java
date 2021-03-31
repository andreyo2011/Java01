package clinica;

public class Doctor extends Persoana {
	
	private int licenta;
	
	public Doctor(int CNP,String nume,String prenume,int licenta) {
		
		super(CNP,nume,prenume);
		this.licenta = licenta;
		
	}

}
