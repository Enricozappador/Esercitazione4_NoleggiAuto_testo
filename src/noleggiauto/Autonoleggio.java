package noleggiauto;


public class Autonoleggio {
	private Auto auto[];
	private int numAuto;


	public Autonoleggio(){
		auto = new Auto[1000];
		numAuto = 0; 
		
	}
	
	public Auto aggiungiAuto(String targa, String marca, String modello, String colore, char tipologia) {
		Auto aTemp;
		aTemp =  new Auto(targa, marca, modello, colore, tipologia, 0, 0);
		auto[numAuto++] = aTemp;
		
		
		
		
		return aTemp;
	}
	
	public Auto cercaAuto(String targa) {
		for (Auto a : auto)
			if (a != null && a.getTarga().compareTo(targa)==0) 
				return a;
			
		return null;
	}

	public String elencoAuto() {
		for (Auto a : auto)
			if (a != null)
				System.out.println(a.getTarga()+" "+a.getMarca()+" "+a.getModello()+" "+a.getColore()+" ");
		
			
		return "Fine Elenco";
	}
		
	public Cliente registraCliente(String cognome, String nome, String nazionalita, String numeroPatente) {
		return null;
	}
	
	public Cliente cercaCliente(String codiceCliente) {
		return null;
	}
	
	public Auto nuovoNoleggio(String codiceCliente, char tipologiaAuto, String dataInizio, String dataFine) {
		return null;
	}

	public String elencoNoleggiCliente(String codiceCliente) {
		return null;
	}
	
	public String elencoNoleggiAuto(String targa) {
		return null;
	}

	public int calcolaCostoNoleggio(String targa, String codiceCliente, String dataInizio, String dataFine) {
		return -1;
	}
}


