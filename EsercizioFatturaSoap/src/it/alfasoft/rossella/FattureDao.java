package it.alfasoft.rossella;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FattureDao {
	
	private Map<String,Fattura> fatture;

	public FattureDao() {
		
		fatture = new HashMap<>();
		
		Fattura f1 = new Fattura ("452",1500,"ttttt");
		Fattura f2 = new Fattura ("785",1700,"jjj");
		Fattura f3 = new Fattura ("741",2500,"ooooo");
		Fattura f4 = new Fattura ("235",32500,"ppppp");
		Fattura f5 = new Fattura ("197",8400,"bbbbb");
		
		
		fatture.put(f1.getCodiceCliente(), f1);
		fatture.put(f2.getCodiceCliente(), f2);
		fatture.put(f3.getCodiceCliente(), f3);
		fatture.put(f4.getCodiceCliente(), f4);
		fatture.put(f5.getCodiceCliente(), f5);
		
	}
	
	public List<Fattura> getTutteFatture(){
		
		ArrayList<Fattura> listaFatture = (ArrayList<Fattura>) fatture.values();
		
		return listaFatture;
		
	}
	
	public Fattura getFatturaConCodice(String codiceCliente){
		Fattura f = null;
		
		f = fatture.get(codiceCliente);
		
		return f ;
		
	}

}
