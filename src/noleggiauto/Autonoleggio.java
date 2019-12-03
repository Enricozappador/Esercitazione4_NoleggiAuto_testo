package noleggiauto;



//import java.util.ArrayList;

public class Autonoleggio {
	private Auto auto[];
	private int numAuto;
	private Compatta compatte[];
	private int numCompatte;
	private Berlina berline[];
	private int numBerline;
	private Noleggio noleggi[]; 
	private int numNoleggi; 
	boolean trovato; 
	private Auto atemp[];
	private int numA ;
	int riferimento = 9999;
	
//	private ArrayList codicic;
	
	private Cliente clienti[];
	private int numClienti;

	


	public Autonoleggio(){
		auto = new Auto[1000];
		numAuto = 0; 
		numClienti = 0;
		clienti = new Cliente[10000];
		compatte = new Compatta [10000]; 
		berline = new Berlina [10000];
		numCompatte = 0; 
		numBerline = 0; 
		noleggi = new Noleggio[10000];
		numNoleggi = 0; 
		trovato = false; 
		atemp = new Auto[100];
		numA = 0 ;
		//codicic = new ArrayList() ;
		
	}
	
	public Auto aggiungiAuto(String targa, String marca, String modello, String colore, char tipologia) {
		Auto aTemp;
		aTemp =  new Auto(targa, marca, modello, colore, tipologia);
		
		for (Auto a : auto) 
			if( a != null && a.getTarga().compareTo(targa)==0) {
				a.setColore(colore);}
		
		if (tipologia == 'C') {
			Compatta cTemp = new Compatta(targa, marca, modello, colore, tipologia);
			compatte[numCompatte++]= cTemp; 
			aTemp = cTemp; 
			auto[numAuto++]= cTemp; 
		}
		else  if (tipologia == 'B'){
			Berlina bTemp = new Berlina(targa, marca, modello, colore, tipologia); 
			berline[numBerline++]= bTemp;
			aTemp = bTemp; 
			auto[numAuto++]= bTemp; 
		}
		
		
		
		/*if(tipologia == Compatta.C)
			
		{
			int numTemp = 0;
			
			for(Auto a : auto)
				if(a!=null && a instanceof Compatta)
					numTemp++;

			Auto autoC[] = new Auto[numTemp];
	
			numTemp=0;
			for(Auto a :auto)
				if(a!=null && a instanceof Compatta) 
					autoC[numTemp] = a;
			
			return Compatta.class; 
		}*/
		
		//auto[numAuto++] = aTemp;
		
		
		
		
		return aTemp;
	}
	
	public Auto cercaAuto(String targa) {
		for (Auto a : auto)
			if (a != null && a.getTarga().compareTo(targa)==0) 
				return a;
			
		return null;
	}

	public String elencoAuto() {
		String elencotemp="";
		for (int i=0 ; i<numAuto ; i++) {
			if (auto[i] != null) {
				//System.out.println(a.getTarga()+" "+a.getMarca()+" "+a.getModello()+" "+a.getColore()+" ");
				elencotemp += auto[i].getTarga()+" "+auto[i].getMarca()+" "+auto[i].getModello()+" "+auto[i].getColore()+" "+auto[i].getTipologia();
			}if (i!= numAuto-1)
				elencotemp += "\n";
		
	}
			
		return elencotemp;		
		
		
	}
		
	public Cliente registraCliente(String cognome, String nome, String nazionalita, String numeroPatente) {
		String codice = "";
		Cliente cTemp;
		String nomeT = nome;
		String cognomeT = cognome;
		String nTemp = nazionalita;
		String pTemp = numeroPatente;
		
		int k = numeroPatente.length();
		int a = nome.length();
		int b = cognome.length();
		int c = nTemp.length();
		
		if(k<7 || k>10) {
			numeroPatente = null;
			pTemp = null;
		}
		if (a<2) {
			nome = null;
			//nomeT = null;
		}
		if (b<2) {
			cognome = null; 
			//cognomeT = null;
			
		}
		if(c<2) {
			nazionalita = null; 
			//nTemp = null ; 
		}
		
		if (k<10 && pTemp != null)
			for(int i=k;i<10;i++)
				pTemp = pTemp+"*";
		
		if(a<3 && nome!=null)
			for(int i= a;i<3;i++)
				nomeT = nomeT+"*";

		
		if(b<3 && cognome != null)
			for(int i= b;i<3;i++)
				cognomeT = cognomeT+"*";

		
		if(c<3 && nazionalita != null)
			for(int i= c;i<3;i++)
				nTemp = nTemp+"*";
				
		
				
		nomeT = nomeT.substring(0,3);
		cognomeT = cognomeT.substring(0,3);
		nTemp = nTemp.substring(0,3);
		pTemp = pTemp.substring(0,10);
/*for (int i=0; i<3; i++) {
			if (nomeT.substring(i)!=null)
				codice = nomeT.toUpperCase();
			else if (nomeT.substring(i) == null)
			codice = "*";
				
	codice = codice+"-";
	
		if (cognomeT.substring(i)!=null)
			codice = codice+cognomeT.toUpperCase();
		else if (cognomeT.substring(i) == null)
		codice ="*";
			
	codice = codice+"-";
	
	if (nTemp.substring(i)!=null)
		codice = codice+nTemp.toUpperCase();
	else if (nTemp.substring(i) == null)
	codice ="*";
		
codice = codice+"-";
		
		}*/
		//non numerico,creo metodo di stampa
		/*if(numClienti<10)
			codiceC = "000"+numClienti;
		else if(numClienti<100)
			codiceC = "00"+numClienti;
		else if(numClienti<1000)
			codiceC = "0"+numClienti; **/
			
			/*if (nomeT!=null)
				nomeT= nomeT.toUpperCase();
			if (cognomeT!=null)
				cognomeT=cognomeT.toUpperCase();
			if (nTemp != null)
				nTemp=nTemp.toUpperCase();
			if (pTemp == null)
				pTemp = "*********";*/
		
		codice = nomeT.toUpperCase()+"-"+cognomeT.toUpperCase()+"-"+nTemp.toUpperCase()+"-"+pTemp.toUpperCase();
		
		cTemp = new Cliente(codice, cognome, nome, nazionalita, numeroPatente);
		clienti[numClienti++] = cTemp;
		return cTemp;
	}
	
	public Cliente cercaCliente(String codiceCliente) {
		for (Cliente c : clienti)
			if(c != null && c.getCodice().compareTo(codiceCliente)==0)
				return c;
		return null;
	}
	private Auto[] cercaAutomobile(char tipologiaAuto) {
		//Auto atemp[] = new Auto[100];
		//int numA = 0; 
		for (Auto a : auto) {
			if (a!= null && a.getTipologia() == tipologiaAuto) {
				atemp[numA++] = a; 
				trovato = true;
			}
				/*else if(a!=null && a.getTipologia()!= tipologiaAuto)
				{ Auto c = new Auto (null,"non disponibile", "non disponibile", "non disponibile", tipologiaAuto );
					atemp[numA++] = c ; 
					trovato = false; 
				}*/
		}
		/*if (trovato == false)
		{
			atemp[numA].setTarga(null);
		}*/
			/*if (trovato == false) {
				Auto c = new Auto(null,"non disponibile", "non disponibile", "non disponibile", tipologiaAuto );
				Auto btemp[] = new Auto[100];
				int numB = 0;
				btemp[numB++] = c;
				return btemp;
			}*/
				
		return atemp;
	}
	public Auto nuovoNoleggio(String codiceCliente, char tipologiaAuto, String dataInizio, String dataFine) {
		Cliente cTemp = cercaCliente(codiceCliente);
		Auto autoTemp = null;
		
		if (cTemp == null) {
			return null;
		}
		
		if (cTemp.verificaSeLibero(dataInizio, dataFine)==false) {
			return null;
		}
		
		for (Auto a: auto) {
			if (a != null) {
				if (tipologiaAuto == 'C') {
					// cerchiamo compatta
					if ( a instanceof Compatta) {
						if ( a.verificaSeLibera(dataInizio, dataFine) == true ) {
							// trovato auto
							autoTemp = a;
							break;
						}
					}
				}
				else if (tipologiaAuto == 'B') {
					// cerchiamo berlina
					if ( a instanceof Berlina) {
						if ( a.verificaSeLibera(dataInizio, dataFine) == true ) {
							// trovato auto
							autoTemp = a;
							break;
						}
					}
				}
			}
		}
		
		if(autoTemp==null)
			return new Auto(null, null, null,null, ' ');
	
		autoTemp.nuovoNoleggio(autoTemp, cTemp, dataInizio, dataFine);
		cTemp.nuovoNoleggio(autoTemp, cTemp, dataInizio, dataFine);
		
		return autoTemp;
		//else {
			/*for (Noleggio n : noleggi) {
				/*int q =*/ /*((n.getAuto().getTarga().compareTo(atemp[0].getTarga()) && (n.getDataInizio().compareTo(dataInizio)>0 &&
						n.getDataFine().compareTo(dataInizio)<0))||(n.getAuto().getTarga().compareTo(atemp[0].getTarga()) && (n.getDataInizio().compareTo(dataFine)>0 &&
								n.getDataFine().compareTo(dataFine)<0)))
				if (n!=null && (((n.getCliente().getCodice().equals(codiceCliente) && n.getDataInizio().compareTo(dataInizio)>0 &&
						n.getDataInizio().compareTo(dataFine)<0)||(n.getCliente().getCodice().equals(codiceCliente)&& n.getDataFine().compareTo(dataInizio)>0
								&& n.getDataFine().compareTo(dataFine)<0)))) {
					return null;
				}
			}
			//n.getAuto().getTarga().compareTo(atemp[0])==0
			
			
			ntemp = new Noleggio (tempCliente, atemp[0], dataInizio,dataFine);
			noleggi[numNoleggi++]= ntemp; */
			
		//}
		/*String ttemp = "CC222DD";
		String mtemp ="";
		String modtemp = "";
		String ctemp = "";
		char tiptemp = 'C' ; 
		boolean trovato = false;
		Noleggio ntemp = new Noleggio (codiceCliente, ttemp, dataInizio, dataFine);
		Auto atemp = new Auto (ttemp, mtemp, modtemp, ctemp, tiptemp);
		for (Cliente c : clienti)
		{
			if (c!= null && codiceCliente.compareTo(c.getCodice())==0 ) {
					noleggi[numNoleggi++] = ntemp;	
			}
		}
		for (Auto a : auto) {
			if (a!= null && tipologiaAuto == a.getTipologia() && trovato == false)
				//ttemp = a.setTarga(a.targa); 
			noleggi[numNoleggi++] = ntemp;		
		}*/
		//return atemp[0];
	}

	

	public String elencoNoleggiCliente(String codiceCliente) {
		String risultato = "";
		Cliente cTemp = this.cercaCliente(codiceCliente);
		if(cTemp == null)
			return null;
		
		for(Noleggio n : cTemp.noleggi)
			if(n!=null)
				if(risultato.compareTo("")==0)
					risultato+=""+n.getAuto().getTarga()+" "+n.getDataInizio()+" "+n.getDataFine(); 
				else
					risultato+="\n"+n.getAuto().getTarga()+" "+n.getDataInizio()+" "+n.getDataFine(); 
				
		return risultato;
		
	}
	
	public String elencoNoleggiAuto(String targa) {
		String risultato = "";
		Auto aTemp = this.cercaAuto(targa);
		if(aTemp == null)
			return null;
		
		for(Noleggio n : aTemp.noleggi)
			if(n!=null)
				if(risultato.compareTo("")==0)
					risultato+=""+n.getCliente().getCodice()+" "+n.getDataInizio()+" "+n.getDataFine(); 
				else
					risultato+="\n"+n.getCliente().getCodice()+" "+n.getDataInizio()+" "+n.getDataFine(); 
				
		return risultato;
	}

	public int calcolaCostoNoleggio(String targa, String codiceCliente, String dataInizio, String dataFine) {
		Cliente cTemp = this.cercaCliente(codiceCliente);
		if(cTemp == null)
			return -1;

		for(Noleggio n : cTemp.noleggi)
			if(n!=null && n.getAuto().getTarga().compareTo(targa)==0 && n.getDataInizio().compareTo(dataInizio)==0 && n.getDataFine().compareTo(dataFine)==0)
			{
				int dataFineIntero = Integer.parseInt(dataFine);
				int dataInizioIntero = Integer.parseInt(dataInizio);
				int giorni = dataFineIntero - dataInizioIntero + 1;
				return giorni*n.getAuto().getCostoGiornaliero();
				
			}
		return -1;
	}


}


