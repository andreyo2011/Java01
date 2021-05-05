package clinica;

public class Aplicatie {
	
	public static void main(String[] args) {
		
		
		Clinica cabinet = new Clinica("Pacienti.csv","Abonamente.csv","Consultatii.csv","Incaperi.csv");
	    cabinet.SorteazaConsultatiileDupaData();
	    	
	}

}
