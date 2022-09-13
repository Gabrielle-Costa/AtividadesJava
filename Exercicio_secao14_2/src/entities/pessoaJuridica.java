package entities;

public class pessoaJuridica extends Contribuintes {

	private Integer nFuncionarios;

	public pessoaJuridica() {
		super();
	}

	public pessoaJuridica(String nome, Double rendaAnual, Integer nFuncionarios) {
		super(nome, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public double taxa() {
		double pgImposto =0;
		if (nFuncionarios > 10) {
			pgImposto = super.getRendaAnual() * 0.14;
		} else {
			pgImposto = super.getRendaAnual()* 0.16;
		}

		return pgImposto;
	}

}
