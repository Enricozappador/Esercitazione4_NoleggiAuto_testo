package noleggiauto;

public class Noleggio {
	private String codiceCliente; 
	private String targa; 
	private String dataInizio;
	private String dataFine;
	
public Noleggio(String codiceCliente, String targa, String dataInizio, String dataFine) {
		super();
		this.codiceCliente = codiceCliente;
		this.targa = targa;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

public String getCodiceCliente() {
	return codiceCliente;
}

public void setCodiceCliente(String codiceCliente) {
	this.codiceCliente = codiceCliente;
}

public String getTarga() {
	return targa;
}

public void setTarga(String targa) {
	this.targa = targa;
}

public String getDataInizio() {
	return dataInizio;
}

public void setDataInizio(String dataInizio) {
	this.dataInizio = dataInizio;
}

public String getDataFine() {
	return dataFine;
}

public void setDataFine(String dataFine) {
	this.dataFine = dataFine;
}
}
