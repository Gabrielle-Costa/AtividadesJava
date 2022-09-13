package dominian.entities;

import java.util.Date;

public class Prestacao {
	
	private Date dtVencimento;
	private Double valorPrestacao;
	

	public Prestacao() {
		
	}

	public Prestacao(Date dtVencimento, Double valorPrestacao) {
		this.dtVencimento = dtVencimento;
		this.valorPrestacao = valorPrestacao;
	}

	public Date getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public Double getValorPrestacao() {
		return valorPrestacao;
	}

	public void setValorPrestacao(Double valorPrestacao) {
		this.valorPrestacao = valorPrestacao;
	}
	

}
