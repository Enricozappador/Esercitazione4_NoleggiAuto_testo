package noleggiauto;

public class Compatta extends Auto{
	//static char C;

	public Compatta(String targa, String marca, String modello, String colore, char tipologia) {
		super(targa, marca, modello, colore, tipologia);
		


		
	}
	public  int getNumeroValigieGrandi () {
		return 0; 
	}
	public int getNumeroValigiePiccole () {
		return 2; 
	}
	public int getCostoGiornaliero() {
		return 50; 
	}
	/*public int ControlloV() {
		if(getNumeroValigieGrandi()<1 && getNumeroValigiePiccole()<3  )
		return getNumeroValigieGrandi()+getNumeroValigiePiccole();
		return -1;
		}*/
		
	
	/*public Object controlloC(){
		if (getNumeroValigieGrandi()>0 && getNumeroValigiePiccole()>2)
		{
			return null;
		}
		else 
		return getNumeroValigiePiccole();
	}*/

}
