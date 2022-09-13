package modelo.servicos;

public class TaxaServicoBrazil {
	
	public double taxaBrasil(double valor) {
		if (valor <= 100.0) {
			return valor * 0.2;
		}
		else {
			return valor *  0.15;
		}
	}

}
