package clinica;

public class AbonamentMedical {
	
	private String nume;
	private int suma;
	private int valabilitate;
	
	public AbonamentMedical(String nume,int suma,int valabilitate) {
		
		this.nume = nume;
		this.valabilitate = valabilitate;
		this.suma = suma;
		
	}
	
	public void show() {
		
		System.out.print(nume+" "+valabilitate+" "+suma+'\n');
	}
	
	public void set(int y) {
		suma = y;
	}

}
