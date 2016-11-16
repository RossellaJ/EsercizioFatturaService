package it.alfasoft.rossella;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FatturaService {
	
	FattureDao fDao = new FattureDao();
	
	@WebMethod
	public List<Fattura> prendiTutteFatture(){
		
		return fDao.getTutteFatture();	
	}
	
	@WebMethod
	public Fattura prendiFatturaConCodice(String codiceCliente){
		
		return fDao.getFatturaConCodice(codiceCliente);	
	}
}
