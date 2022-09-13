package Funcionario;

public class Func {
	
	public String nome;
	public double salarioBruto;
	public  double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
		
	}
	
	public void aumentoSalario( double a) {
		
		salarioBruto += salarioBruto * a/100.00 - taxa;
				
	}
	
	public String toString() {
		
		return "Salario atualizado: R$ "
				+ String.format("%.2f", salarioBruto);
				
	}

}
