package clinica;

public class ProfilPacient extends Persoana {
	

	private int index_abonament;
	
	public ProfilPacient(int CNP,String nume,String prenume,int ab) {
		
		super(CNP,nume,prenume);
		this.index_abonament = ab;
		
	}
	
	public void show() {
		System.out.print(CNP+" "+nume+" "+prenume+'\n');
	}

}
