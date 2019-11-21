package noleggiauto;

public class Auto {
	private String targa;
	private String marca;
	private String modello;
	private String colore;
	private int NumVGrandi;
	private int NumVPiccole;
	private int CostoGiorno;
	
	

	public Auto(String targa, String marca, String modello, String colore, int numVGrandi, int numVPiccole,
			int costoGiorno) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.colore = colore;
		NumVGrandi = numVGrandi;
		NumVPiccole = numVPiccole;
		CostoGiorno = costoGiorno;
	}

	public String getTarga() {
		return targa;
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
		return CostoGiorno;
	}
	
}
