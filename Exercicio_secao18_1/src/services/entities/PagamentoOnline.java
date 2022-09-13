package services.entities;

public interface PagamentoOnline {
	
	Double taxaPagamento( double valor);
	
	Double pagtoJuros(double valor, int meses);

}
