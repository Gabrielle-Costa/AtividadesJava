package services.entities;

import java.util.Calendar;
import java.util.Date;

import dominian.entities.Contrato;
import dominian.entities.Prestacao;

public class ContratoServico {

	Paypal srvPgtoOnline = new Paypal();
	

	public ContratoServico() {

	}

	public ContratoServico(Paypal srvPgtoOnline) {
		this.srvPgtoOnline = srvPgtoOnline;
	}

	public void CalculoContrato(Contrato contrato, Integer meses) {
		
		double vrParc = contrato.getValorTotal()/meses;
		double pgtJuros, pgtTaxa;


		for (int i = 1; i <= meses; i++) {
			Date dtParcela = contrato.getDtContrato();
			Calendar cal = Calendar.getInstance();
			cal.setTime(dtParcela);
			cal.add(Calendar.MONTH, i);
			dtParcela = cal.getTime();
			
			pgtJuros = srvPgtoOnline.pagtoJuros(vrParc, i);
			pgtTaxa = srvPgtoOnline.taxaPagamento(pgtJuros);
			
			Prestacao parc = new Prestacao(dtParcela,pgtTaxa);
			
			contrato.addPrestacao(parc);
			
			}

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
