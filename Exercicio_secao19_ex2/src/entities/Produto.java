package entities;

import java.util.Objects;

public class Produto {

	private String nomePord;
	private Double preco;
	
	public Produto(String nomePord, Double preco) {
		this.nomePord = nomePord;
		this.preco = preco;
	}
	
	public String getNomePord() {
		return nomePord;
	}
	
	public void setNomePord(String nomePord) {
		this.nomePord = nomePord;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nomePord);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nomePord, other.nomePord);
	}
	
	
}
