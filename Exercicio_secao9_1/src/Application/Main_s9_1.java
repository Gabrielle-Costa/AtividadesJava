package Application;

import java.util.Locale;
import java.util.Scanner;

import Conta.Conta;

public class Main_s9_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double deposito = 0.0, saque = 0.0;

		Conta cliente = new Conta();

		System.out.print("Entre com o numero da conta: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.print("Entre com o nome do cliente: ");
		String nome = sc.nextLine();

		System.out.println();
		System.out.print("Deseja realizar depósito? (Y-Sim/N-Não) ");
		char depositar = sc.next().charAt(0);

		if (depositar == 'y' || depositar == 'Y') {

			System.out.print("Qual será o valor do depósito? ");
			deposito = sc.nextDouble();

			cliente = new Conta(n, nome, deposito);

		} else {

			cliente = new Conta(n, nome);
		}

		System.out.println(cliente);
		System.out.println();

		System.out.print("Entre com o valor do depósito: ");
		deposito = sc.nextDouble();
		cliente.deposito(deposito);

		System.out.println(cliente);
		System.out.println();

		System.out.print("Entre com o valor do saque: ");
		saque = sc.nextDouble();

		if (saque <= cliente.getSaldo()) {

			cliente.saque(saque);

		} else {

			System.out.println("Saldo Insuficiente.");

		}

		System.out.println(cliente);

		sc.close();

	}

}
