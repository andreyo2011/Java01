package clinica;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.util.*;

public class CitesteCSV {
	   
	   private static CitesteCSV instance;

	   private CitesteCSV() {
	      // if (instance == null) {
	    	   
	       //}
	   }

	   public static CitesteCSV getInstance() {
	      if (instance == null) {
	          instance = new CitesteCSV();
	      }
	      return instance;
	   }

	   public static void CitestePacienti(String fisierPacienti,List<ProfilPacient_camp> tabel_ref) throws IOException {
		   
		   BufferedReader in = new BufferedReader(new FileReader(fisierPacienti));
		   
		   String row;
		   while ((row = in.readLine()) != null) {
			    String[] data = row.split(",");
			    Integer CNP = Integer.parseInt(data[0]);
			    Integer id_abonament = Integer.parseInt(data[1]);
			    
			    tabel_ref.add(new ProfilPacient_camp(CNP,id_abonament,data[2],data[3]));
			        
			}
		   
	   }
	   
	   
	   public static void CitesteAbonamente(String fisierAbonamente,List<Abonament_camp> tabel_ref) throws IOException {
		   
		   BufferedReader in = new BufferedReader(new FileReader(fisierAbonamente));
		   
		   String row;
		   while ((row = in.readLine()) != null) {
			    String[] data = row.split(",");
			    Integer id_abonament = Integer.parseInt(data[0]);
			    Integer valoare = Integer.parseInt(data[2]);
			    Integer suma_cons = Integer.parseInt(data[3]);
			    Integer suma_prod = Integer.parseInt(data[4]);

			    tabel_ref.add(new Abonament_camp(id_abonament,data[1],valoare,suma_cons,suma_prod));
			        
			}
		   
	   }
	   
	   
	   
	   public static void CitesteConsultatii(String fisierConsultatii,List<ProgramariConsultatii_camp> tabel_ref) throws IOException {
		   
		   BufferedReader in = new BufferedReader(new FileReader(fisierConsultatii));
		   
		   String row;
		   while ((row = in.readLine()) != null) {
			    String[] data = row.split(",");
			    Integer id_consultatie = Integer.parseInt(data[0]);
			    Integer CNP = Integer.parseInt(data[1]);
			    Integer id_specialitate = Integer.parseInt(data[2]);
			    Integer id_sala = Integer.parseInt(data[3]);
			   
			    tabel_ref.add(new ProgramariConsultatii_camp(id_consultatie,CNP,id_specialitate,id_sala,data[4]));
			        
			}
		   
	   }
	   
	   public static void CitesteIncaperi(String fisierIncaperi,List<Incapere_camp> tabel_ref) throws IOException {
		   
		   BufferedReader in = new BufferedReader(new FileReader(fisierIncaperi));
		   
		   String row;
		   while ((row = in.readLine()) != null) {
			    String[] data = row.split(",");
			    Integer id_incapere = Integer.parseInt(data[0]);
			    
			    tabel_ref.add(new Incapere_camp(id_incapere,data[1]));
			        
			}
		   
	   }  
	   
	}