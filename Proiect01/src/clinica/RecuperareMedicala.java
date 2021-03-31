package clinica;

import java.util.Calendar;
import java.util.Date;
public class RecuperareMedicala {
		
	private Clinica clinica;
	private Terapeut terapeut;
	private ProfilPacient pacient;
	private Date DataProcedura;
		
	public RecuperareMedicala(Clinica clinica, Terapeut terapeut, ProfilPacient pacient,
				int an,int luna,int zi,int ora, int minut) {
			
		this.clinica = clinica;
		this.terapeut = terapeut;
		this.pacient = pacient;
			
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, an);
		cal.set(Calendar.MONTH, luna);
		cal.set(Calendar.DAY_OF_MONTH, zi);
		cal.set(Calendar.HOUR_OF_DAY, ora);
		cal.set(Calendar.MINUTE, ora);
		DataProcedura= cal.getTime();
			
		System.out.print(DataProcedura);
			
			
	}

}

