package Conversor;

public class Calculadora {
	
	public static double iof = 0.06;
	public static double dollar;
	public static double cambio;

	public static double conversao() {
		
		return cambio = cambio * dollar + ((cambio * dollar) * iof);
		
	}
	
	public String toString() {
		return "Voce precisara de R$: "
				+ String.format("%.2f", conversao());
	}
	
}
