package entities;

public class ItensPedido {
	
	private Integer quantidade;
	private Double valorT;
	
	private Produtos prod = new Produtos();
	
	public ItensPedido() {
		
	}

	public ItensPedido(Integer quantidade, Produtos prod) {
		this.quantidade = quantidade;
		this.prod = prod;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valorT;
	}

	public void setValor(Double valor) {
		this.valorT = valor;
	}

	public Produtos getProd() {
		return prod;
	}

	public void setProd(Produtos prod) {
		this.prod = prod;
	}
	
	
	public double subTotal() {
			valorT = quantidade * prod.getPreco();	
		return valorT;
	}
	

}
