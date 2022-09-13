package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import excecoes.DominianExceptions;

public class Main_s15_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		try {
		System.out.println("Digite os dados da conta");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldoInicial = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();
		
		conta = new Conta(numero, titular, saldoInicial, limiteSaque);
		
		System.out.println();
		System.out.print("Digite o valor de saque: ");
		double valor = sc.nextDouble();
		
		conta.saque(valor);
		
		System.out.println(String.format("Novo saldo: %.2f", conta.getSaldo()));
		
		}
		catch (DominianExceptions e){
			System.out.println("Erro de saque: " + e.getMessage());
			
		}
		
		
		sc.close();

	}

}
