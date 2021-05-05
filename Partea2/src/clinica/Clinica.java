package clinica;
import java.io.IOException;

import java.util.*;
import java.util.stream.Collectors;

public class Clinica {
	
	private List<Abonament_camp> TabelAbonamente;
	private List<ProfilPacient_camp> TabelPacienti;
	private List<ProgramariConsultatii_camp> TabelProgramariConsultatii;
	private List<Incapere_camp> TabelIncaperi;
	private List<Specialitati_camp> TabelSpecialitati;
	private List<Doctor_camp> TabelDoctori;
	private List<ProgramariProceduri_camp> TabelProgramariProceduri;
	private List<Terapeut_camp> TabelTerapeuti;
	
	
	public Clinica(String fisierPacienti, String fisierAbonamente,String fisierConsultatii, String fisierIncaperi) {
		
		TabelPacienti   = new ArrayList<>();
		TabelAbonamente = new ArrayList<>();
		TabelProgramariConsultatii = new ArrayList<>();
		TabelIncaperi = new ArrayList<>();
		
		
		 try {
			CitesteCSV.CitestePacienti(fisierPacienti,TabelPacienti);
			CitesteCSV.CitesteAbonamente(fisierAbonamente,TabelAbonamente);
			CitesteCSV.CitesteConsultatii(fisierConsultatii, TabelProgramariConsultatii);
			CitesteCSV.CitesteIncaperi(fisierIncaperi,TabelIncaperi);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		
	}
	
	void ObtineConsultatiiLibere() {
		
		
		for(int i = 0; i < TabelProgramariConsultatii.size(); i++) {
			
			if(TabelProgramariConsultatii.get(i).CNP() == null)
				TabelProgramariConsultatii.get(i).Afiseaza();
			
		}
	}
	
	void ObtineProceduriLibere() {
		
		for(int i = 0; i < TabelProgramariProceduri.size(); i++) {
			
			if(TabelProgramariProceduri.get(i).CNP() == null)
				TabelProgramariProceduri.get(i).Afiseaza();
			
		}
		
	}
	
	void SorteazaConsultatiileDupaData() {
		
		List<ProgramariConsultatii_camp> lista = TabelProgramariConsultatii.stream()
	            .sorted(Comparator.comparing(ProgramariConsultatii_camp::DataConsultatie))
	            .collect(Collectors.toList());
		
		try {
			ScrieCSV.ScrieConsultatii("SorteazaConsultatiileDupaData.csv", lista);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void AfiseazaPacienti() {
		
		 for (int i = 0; i < TabelPacienti.size(); i++) 
			 TabelPacienti.get(i).Afiseaza();
		 
	}
	
	public void AfiseazaAbonamente() {
		
		 for (int i = 0; i < TabelAbonamente.size(); i++) 
			 TabelAbonamente.get(i).Afiseaza();
		 
	}
	
	public void AfiseazaConsultatii() {
		
		 for (int i = 0; i < TabelProgramariConsultatii.size(); i++) 
			 TabelProgramariConsultatii.get(i).Afiseaza();
		 
	}
	
	public void AfiseazaIncaperi() {
		
		 for (int i = 0; i < TabelIncaperi.size(); i++) 
			 TabelIncaperi.get(i).Afiseaza();
		 
	}
	
}
