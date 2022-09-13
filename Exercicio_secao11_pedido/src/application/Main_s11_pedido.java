package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItensPedido;
import entities.Pedido;
import entities.Produtos;
import entities.enums.StatusPedido;

public class Main_s11_pedido {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Digite os dados do cliente:");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		System.out.print("E-mail: ");
		String emailCliente = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataCliente = sdf.parse(sc.next());
		
		
		System.out.println("Digite os dados do pedido: ");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("Quantos Itens tem este pedido: ");
		int quantItens = sc.nextInt();
		
		Date dataPedido = new Date();
		
		Pedido pedido = new Pedido(dataPedido, StatusPedido.valueOf(status), new Cliente(nomeCliente, emailCliente, dataCliente) );
		
		for(int i =1; i<=quantItens; ++i) {
			System.out.println("Digite os dados do " + i + "º item: ");
			System.out.print("Nome do produto: ");
			String nome = sc.next();
			System.out.print("Preço do produto: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quant = sc.nextInt();
			
			ItensPedido itemPed = new ItensPedido(quant, new Produtos(nome, preco));
			pedido.addItens(itemPed);
			
			
		}
		
		System.out.println(pedido);;
		
		
		
		sc.close();

	}

}
