package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class produtoUsado extends Produto{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFabricacao;
	
	public produtoUsado() {
		
	}

	public produtoUsado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiquetaPreco() {
		return  "\n"
				+ super.getNome() 
				+ String.format(" (usado) R$ %.2f", super.getPreco()) 
				+ " (Data de fabricação: " 
				+ sdf.format(dataFabricacao)
				+ ")"; 
	}

}
