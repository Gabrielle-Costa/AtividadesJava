package modelo.servicos;

import modelo.entities.Aluguel;
import modelo.entities.Fatura;

public class ServicoAluguel {
	
	private Double precoPorHora;
	private Double precoPorDia;
	
	private TaxaServicoBrazil txBrasil;
	
	public ServicoAluguel() {
		
	}

	public ServicoAluguel(Double precoPorHora, Double precoPorDia, TaxaServicoBrazil txBrasil) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.txBrasil = txBrasil;
	}
	
	public void calculoAluguel(Aluguel aluguel) {
		long t1 = aluguel.getDtInicial().getTime();
		long t2 = aluguel.getDtFinal().getTime();
		double horas = (double) (t2 -t1) / 1000 / 60 /60;
		
		double pagto;
		
		if (horas <= 12.0) {
			pagto = Math.ceil(horas) * precoPorHora;
			
		}else {
			pagto = Math.ceil(horas/24)* precoPorDia;
		}
		
		double taxa = txBrasil.taxaBrasil(pagto);
		
		aluguel.setFatura(new Fatura(pagto, taxa)); // Instanciando a fatura que est? vinculada ? classe aluguel.
		
		
		
		
	}



}
