package clinica;

import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class ProgramariConsultatii_camp {
	
	private Integer id_consultatie;
	private Integer id_sala;
	private Integer id_specialitate;
	private Integer CNP;
	private Date DataConsultatie;
	
	public ProgramariConsultatii_camp(int id_consultatie,int CNP,int id_specialitate,int id_sala,String data_consultatie) {
		
		this.id_consultatie = id_consultatie;
		this.id_sala = id_sala;
		this.id_specialitate = id_specialitate;
		this.CNP = CNP;
		
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		try {
			DataConsultatie = format.parse(data_consultatie);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	
	void Afiseaza() {
		
		System.out.println(id_consultatie+" "+CNP+" "+id_specialitate+" "+id_sala+" "+DataConsultatie);
		
	}
	
	Date DataConsultatie() {
		
		return DataConsultatie;
		
	}
	
	Integer IdConsultatie() {
		
		return id_consultatie;
		
	}
	
	
	Integer IdSala() {
		
		return id_sala;
		
	}
	
	Integer IdSpecialitate() {
		
		return id_specialitate;
		
	}
	
	Integer CNP() {
		
		return CNP;
		
	}

}
