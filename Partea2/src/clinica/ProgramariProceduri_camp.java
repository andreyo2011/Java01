package clinica;

public class ProgramariProceduri_camp {
	
	private Integer id_programare;
	private Integer CNP;
	private Integer id_sala;
	private Integer licenta;
	private String tip_procedura;
	
	public ProgramariProceduri_camp(int id_programare,int CNP,int id_sala,int licenta,String tip_procedura) {
		
		this.id_programare = id_programare;
		this.CNP = CNP;
		this.id_sala = id_sala;
		this.licenta = licenta;
		this.tip_procedura = tip_procedura;
		
	}
	
	
	void Afiseaza() {
		
		System.out.println(id_programare +" "+CNP+" "+licenta+" "+tip_procedura+" "+id_sala);
		
	}
	
	Integer Licenta() {
		
		return licenta;
		
	}
	
	Integer IdProgramare() {
		
		return id_programare;
		
	}
	
	Integer IdSala() {
		
		return id_sala;
		
	}
	
	String TipProcedura() {
		
		return tip_procedura;
		
	}
	
	Integer CNP() {
		
		return CNP;
		
	}

}
