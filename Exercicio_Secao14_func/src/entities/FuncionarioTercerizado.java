package entities;

public class FuncionarioTercerizado extends Funcionario {

	private double adicionalDeDespesa;
	
	public FuncionarioTercerizado() {
		super();
	}
	
	public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHora, double adicionalDeDespesa) {
		super(nome, horas, valorPorHora);
		this.adicionalDeDespesa = adicionalDeDespesa;
	}

	public double getAdicionalDeDespesa() {
		return adicionalDeDespesa;
	}

	public void setAdicionalDeDespesa(double adicionalDeDespesa) {
		this.adicionalDeDespesa = adicionalDeDespesa;
	}

	@Override

	public Double pagamento() {
		/*Double pg = horas * valorPorHora;
		adicionalDeDespesa = adicionalDeDespesa * 110 /100;
		pg += adicionalDeDespesa;
		return pg;*/
		return super.pagamento() + adicionalDeDespesa *1.1;
	}
	
	

}
