package noleggiauto;

public class Noleggio {
	private Cliente cliente; 
	private Auto auto; 
	private String dataInizio;
	private String dataFine;
	
public Noleggio(Cliente cliente, Auto auto, String dataInizio, String dataFine) {
		super();
		this.cliente  = cliente; 
		this.auto = auto; 
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
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




public Cliente getCliente() {
	return cliente;
}




public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}




public Auto getAuto() {
	return auto;
}




public void setAuto(Auto auto) {
	this.auto = auto;
}
}
