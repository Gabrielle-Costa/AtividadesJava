package modelo.entities;

import java.util.Date;

public class Aluguel {
	
	private Date dtInicial;
	private Date dtFinal;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public Aluguel() {
		
	}

	public Aluguel(Date dtInicial, Date dtFinal, Veiculo veiculo) {
		this.dtInicial = dtInicial;
		this.dtFinal = dtFinal;
		this.veiculo = veiculo;
	}

	public Date getDtInicial() {
		return dtInicial;
	}

	public void setDtInicial(Date dtInicial) {
		this.dtInicial = dtInicial;
	}

	public Date getDtFinal() {
		return dtFinal;
	}

	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	

}
