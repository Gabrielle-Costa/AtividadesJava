package entities;

public class pessoaFisica extends Contribuintes {

	private Double custoSaude = 0.0;
	
	public pessoaFisica() {
		super();
	}

	public pessoaFisica(String nome, Double rendaAnual, Double custoSaude) {
		super(nome, rendaAnual);
		this.custoSaude = custoSaude;
	}
	
	public Double getCustoSaude() {
		return custoSaude;
	}

	public void setCustoSaude(Double custoSaude) {
		this.custoSaude = custoSaude;
	}

	@Override
	public double taxa() {
		double pgImposto =0;
		if ( super.getRendaAnual() < 20000) {
			pgImposto = (super.getRendaAnual() * 0.15) - (custoSaude * 0.5);
	
		}else {
			pgImposto = (super.getRendaAnual() * 0.25) - (custoSaude * 0.5);
		}
		return pgImposto;
	}

}
