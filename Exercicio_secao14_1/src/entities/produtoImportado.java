package entities;

public class produtoImportado extends Produto{
	
	private double custoFrete;
	
	public produtoImportado() {
		
	}

	public produtoImportado(String nome, double preco, double custoFrete) {
		super(nome, preco);
		this.custoFrete = custoFrete;
	}

	public double getCustoFrete() {
		return custoFrete;
	}

	public void setCustoFrete(double custoFrete) {
		this.custoFrete = custoFrete;
	}
	
	@Override
	
	public String etiquetaPreco() {
		return super.etiquetaPreco() + String.format(" (Custo de frete: %.2f)", custoFrete);
	}

}
