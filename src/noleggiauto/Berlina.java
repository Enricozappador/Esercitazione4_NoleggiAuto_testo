package noleggiauto;

public class Berlina extends Auto{

	public Berlina(String targa, String marca, String modello, String colore, char tipologia) {
		super(targa, marca, modello, colore, tipologia);
		//costoGiorno = 75;
	
	}
	public  int getNumeroValigieGrandi () {
		return 1; 
	}
	public int getNumeroValigiePiccole () {
		return 3; 
	}
	public int getCostoGiornaliero() {
		return 75; 
	}
	
	

}
