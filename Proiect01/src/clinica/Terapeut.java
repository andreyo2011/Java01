package clinica;

public class Terapeut extends Persoana {
	
	private int licenta;
	
	public Terapeut(int CNP,String nume,String prenume,int licenta) {
		
		super(CNP,nume,prenume);
		this.licenta = licenta;
		}
	
}