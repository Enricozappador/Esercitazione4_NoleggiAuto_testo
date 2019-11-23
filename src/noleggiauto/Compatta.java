package noleggiauto;

public class Compatta extends Auto{
	//static char C;

	public Compatta(String targa, String marca, String modello, String colore, int numVGrandi, int numVPiccole,
			int costoGiorno) {
		super(targa, marca, modello, colore, numVGrandi, numVPiccole, costoGiorno);


		
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
