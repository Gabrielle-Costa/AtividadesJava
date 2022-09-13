package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	
	private Date momento;
	private StatusPedido status;
	
	List <ItensPedido> itens = new ArrayList<>();
	Cliente cliente = new Cliente();
	
	public Pedido() {
		
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public void addItens(ItensPedido item) {
		itens.add(item);
	}
	public void removeItens(ItensPedido item) {
		itens.remove(item);
	}
	
	public Double total() {
		double soma =0;
		for (ItensPedido pedido: itens) {
			soma = pedido.subTotal();
		}
		return soma;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nDetalhe do Pedido \n");
		sb.append("Data do pedido: " + sdf1.format(getMomento()) + "\n");
		sb.append("Status do pedido: " + status + "\n");
		sb.append("Cliente: " + cliente.getNome() + " (" + sdf.format(cliente.getDtAniv()) + ") - " + cliente.getEmail() + "\n" );
		sb.append("Itens do Pedido: \n");
		double soma = 0;
		for (ItensPedido p: itens) {
			
			sb.append(p.getProd().getNome() + ", R$" + p.getProd().getPreco() + ", Quantidade: " + p.getQuantidade() + ",  Subtotal: R$" + String.format("%.2f", p.subTotal()) + "\n");
			soma += p.subTotal();
		}
		
		sb.append("Total: R$ " + String.format("%.2f", soma));
		
		return sb.toString();
	}
	
	
}
