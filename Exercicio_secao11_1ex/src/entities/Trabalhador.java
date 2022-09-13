package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelDoCargo;

public class Trabalhador {

	private String nome;
	private NivelDoCargo nivel;
	private Double salarioBase;

	private Departamento dp;
	private List<Contrato> contratos = new ArrayList<>();

	public Trabalhador() {

	}

	public Trabalhador(String nome, NivelDoCargo nivel, Double salarioBase, Departamento dp) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.dp = dp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoCargo getNivel() {
		return nivel;
	}

	public void setNivel(NivelDoCargo nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDp() {
		return dp;
	}

	public void setDp(Departamento dp) {
		this.dp = dp;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void addContratos(Contrato contrato) {
		contratos.add(contrato);
	}

	public void removeContratos(Contrato contrato) {
		contratos.remove(contrato);
	}

	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();

		for (Contrato c : contratos) {
			cal.setTime(c.getData());
			int c_Ano = cal.get(Calendar.YEAR);
			int c_Mes = 1+cal.get(Calendar.MONTH);

			if (c_Ano == ano && c_Mes == mes) {
				soma = soma + c.valorTotal();
			}
		}
		return soma;
	}

}
