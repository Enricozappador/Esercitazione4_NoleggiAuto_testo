package noleggiauto;

public class Cliente {
	private String codice;
	private String cognome;
	private String nome; 
	private String nazionalita;
	private String numPatente;
	Noleggio noleggi[];
	int numNoleggi;
	


	

	public Cliente(String codice, String cognome, String nome, String nazionalita, String numPatente) {
		super();
		this.codice =codice;
		this.cognome = cognome;
		this.nome = nome;
		this.nazionalita = nazionalita;
		this.numPatente = numPatente;
		this.noleggi = new Noleggio[100];
		this.numNoleggi = 0;
		

	}

	public String getCodice() {
		
		return codice;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public String getNumeroPatente() {
		return numPatente;
	}
	public boolean verificaSeLibero(String dataInizio, String dataFine) {
		
		boolean libero = true;
		
		for (Noleggio n: noleggi) {
			if (n != null) {
				libero = libero && ( (dataFine.compareTo(n.getDataInizio()) < 0) || (dataInizio.compareTo(n.getDataFine()) > 0) );
			}
		}
		
		
		return libero;
	}
	public void nuovoNoleggio(Auto auto, Cliente cliente, String dataInizio, String dataFine) {
		Noleggio nTemp = new Noleggio(cliente, auto, dataInizio, dataFine);
		noleggi[numNoleggi++] = nTemp;
	}
/*  public  String printCode() {
		
		
		for(int i=0 ; i<3 ; i++) {
			if (nome != null) {
				codice = nome;
				return codice+"-";
			}
			if (nome == null)
					codice = "*";
					
		return codice+"-";
		}
		
		return codice;
	}*/

	
}
