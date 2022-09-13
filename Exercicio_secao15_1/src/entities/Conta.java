package entities;

import excecoes.DominianExceptions;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;

	public Conta() {

	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimite() {
		return limiteSaque;
	}

	public double deposito(double valor) {
		return this.saldo = valor;
	}

	public void saque(double valor) throws DominianExceptions {
		if(valor > this.limiteSaque) {
			throw new DominianExceptions("O saque excede o limite de saque.");
		}
		if (valor < this.limiteSaque && valor > this.saldo) {
			throw new DominianExceptions("Saldo insuficiente. ");
		}
		if (this.saldo != 0.00 || valor < this.limiteSaque) {
			this.saldo = this.saldo - valor;
		} 
		

	}
}
