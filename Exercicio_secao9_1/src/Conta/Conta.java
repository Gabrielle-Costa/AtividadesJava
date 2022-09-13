package Conta;

public class Conta {
	
	private int nConta;
	private String nomeCliente;
	private double saldo;
	
	public Conta() {
	}
	
	public Conta(int nConta, String nomeCliente, double saldo) {
		this.nConta = nConta;
		this.nomeCliente = nomeCliente;
		this.saldo = deposito(saldo);
	}

	public Conta (int nConta, String nomeCliente) {
		this.nConta = nConta;
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConta() {
		return nConta;
	}
	
	public double deposito(double d) {
		return saldo = saldo + d;
	}
	
	public double saque(double s) {
		
		return saldo = saldo - (s + 5.0);
				
	}
	
	public String toString() {
		
		return  String.format("%n", null)
				+ String.format("Informações da conta: %n", null)
				+ "Conta: "
				+ nConta
				+ " Nome: "
				+ nomeCliente
				+ " Saldo: "
				+ saldo;
		
		
	}




}
