package noleggiauto;

public class Cliente {
	private String codice;
	private String cognome;
	private String nome; 
	private String nazionalita;
	private String numPatente;

	

	public Cliente(String codice, String cognome, String nome, String nazionalita, String numPatente) {
		super();
		this.codice =codice;
		this.cognome = cognome;
		this.nome = nome;
		this.nazionalita = nazionalita;
		this.numPatente = numPatente;
		

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
