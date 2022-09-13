package dominian.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer numero;
	private Date dtContrato;
	private Double valorTotal;

	List<Prestacao> parcelas = new ArrayList<>();

	public Contrato() {

	}

	public Contrato(Integer numero, Date dtContrato, Double valorTotal) {
		this.numero = numero;
		this.dtContrato = dtContrato;
		this.valorTotal = valorTotal;

	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDtContrato() {
		return dtContrato;
	}

	public void setDtContrato(Date dtContrato) {
		this.dtContrato = dtContrato;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void addPrestacao(Prestacao parcela) {

		parcelas.add(parcela);
	}

	public void removePrestacao(Prestacao parcela) {

		parcelas.remove(parcela);
	}

	@Override

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Prestacao p : parcelas){
			sb.append(sdf.format(p.getDtVencimento()));
			sb.append(" - ");
			sb.append(String.format("%.2f", p.getValorPrestacao()));
			sb.append("\n");
		}
			
		return sb.toString();

	}

}
