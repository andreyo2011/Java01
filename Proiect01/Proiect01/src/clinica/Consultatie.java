package clinica;

import java.util.Calendar;
import java.util.Date;
public class Consultatie {
	
	private Clinica clinica;
	private Doctor doctor;
	private ProfilPacient pacient;
	private Date DataConsultatie;
	
	public Consultatie(Clinica clinica, Doctor doctor, ProfilPacient pacient,
			           int an,int luna,int zi,int ora, int minut) {
		
		this.clinica = clinica;
		this.doctor = doctor;
		this.pacient = pacient;
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, an);
		cal.set(Calendar.MONTH, luna);
		cal.set(Calendar.DAY_OF_MONTH, zi);
		cal.set(Calendar.HOUR_OF_DAY, ora);
		cal.set(Calendar.MINUTE, ora);
		DataConsultatie = cal.getTime();
			
	}

}
