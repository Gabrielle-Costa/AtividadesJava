package services.entities;

public class Paypal implements PagamentoOnline {
	
	public Paypal() {
		
	}

	@Override
	public Double taxaPagamento(double valor) {
		return valor + (valor * 0.02);
	}

	@Override
	public Double pagtoJuros(double valor, int meses) {
		double taxa = valor +((valor * 0.01) * meses);
		return taxa ;
	}
	

}
