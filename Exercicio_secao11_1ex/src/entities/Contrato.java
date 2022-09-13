package entities;

import java.util.Date;

public class Contrato {
	
	private Date data;
	private Double valorPorHora;
	private Integer hora;
	
	public Contrato() {
		
	}
	
	public Contrato(Date data, Double valorPorHora, Integer hora) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.hora = hora;
				
	}
	
	public Date getData() {
		return data;
	}

	
	public Double getValorPorHora() {
		return valorPorHora;
	}
	

	
	public Integer getHora() {
		return hora;
	}
	
	
	
	public double valorTotal() {
		return valorPorHora * hora ;

	}

}
