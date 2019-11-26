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
	
}
