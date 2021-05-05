package clinica;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class ScrieCSV {

	   private static ScrieCSV instance;

	   private ScrieCSV() {
	      // if (instance == null) {
	    	   
	       //}
	   }

	   public static ScrieCSV getInstance() {
	      if (instance == null) {
	          instance = new ScrieCSV();
	      }
	      return instance;
	   }
	   
	   public static void ScrieConsultatii(String fisier,List<ProgramariConsultatii_camp> tabel_ref) throws IOException {
		   
		   FileWriter out = new FileWriter(fisier);
		   
			 for (int i = 0; i < tabel_ref.size(); i++) {
				 ProgramariConsultatii_camp tmp = tabel_ref.get(i);
				 out.append(tmp.IdConsultatie().toString()+",");
				 out.append(tmp.CNP().toString()+",");
				 out.append(tmp.IdSpecialitate().toString()+",");
				 out.append(tmp.IdSala().toString()+",");
				 out.append(tmp.DataConsultatie().toString());
				 out.append("\n");
			 }
 
		   out.flush();
		   out.close();
		   
	   }
}
