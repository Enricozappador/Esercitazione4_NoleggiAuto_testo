package noleggiauto;

public class Auto {
	private String targa;
	private String marca;
	private String modello;
	private String colore;
	private int NumVGrandi;
	private int NumVPiccole;
	private int costoGiorno;
	private char tipologia;
	Noleggio noleggi[];
	int numNoleggi;
	
	public boolean verificaSeLibera(String dataInizioRichiesta, String dataFineRichiesta) {
		boolean libera = true;
		for(Noleggio n : noleggi)
			if(n!=null 
				&& n.getDataInizio()!=null 
				&& n.getDataFine()!=null
				&& libera)
			{ 
				libera = libera & (((dataFineRichiesta.compareTo(n.getDataInizio()) < 0) || (dataInizioRichiesta.compareTo(n.getDataFine()) > 0)));
				
			}
		return libera;
		
	}

	

	public Auto(String targa, String marca, String modello, String colore, char tipologia) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.colore = colore;
		this.setTipologia(tipologia);
		NumVGrandi = -1;
		NumVPiccole = -1;
		costoGiorno = 0;
		noleggi = new Noleggio[100];
		numNoleggi = 0;
	
		
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public String getColore() {
		return colore;
	}

	public int getNumeroValigieGrandi() {
		return NumVGrandi;
	}
	
	public int getNumeroValigiePiccole() {
		return NumVPiccole;
	}
	
	public int getCostoGiornaliero() {
		return costoGiorno;
	}

	public char getTipologia() {
		return tipologia;
	}

	public void setTipologia(char tipologia) {
		this.tipologia = tipologia;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	public void nuovoNoleggio(Auto auto, Cliente cliente, String dataInizio, String dataFine) {
		Noleggio nTemp = new Noleggio(cliente, auto, dataInizio, dataFine);
		noleggi[numNoleggi++] = nTemp;
	}
	
	
}
