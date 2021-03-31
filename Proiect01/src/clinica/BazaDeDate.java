package clinica;
import java.util.*;

public class BazaDeDate {
	
	private List<ProfilPacient> TabelClienti;
	private List<Clinica> TabelClinici;
	private List<AbonamentMedical> TabelAbonamente;
	private List<Doctor> TabelDoctori;
	private List<Consultatie> TabelOrarConsultatii;
	private List<Procedura> TabelProceduri;
	private List<Terapeut> TabelTerapeuti;
	private List<RecuperareMedicala> TabelOrarSedinteRecuperare;
	
	public BazaDeDate() {
		
		TabelClienti = new ArrayList<ProfilPacient>();
		TabelClinici = new ArrayList<Clinica>();
		TabelAbonamente = new ArrayList<AbonamentMedical>();
		TabelDoctori = new ArrayList<Doctor>();
		TabelOrarConsultatii = new ArrayList<Consultatie>();
		TabelProceduri = new ArrayList<Procedura>();
		TabelTerapeuti = new ArrayList<Terapeut>();
		TabelOrarSedinteRecuperare = new ArrayList<RecuperareMedicala>();
		
		
	}
	
}
