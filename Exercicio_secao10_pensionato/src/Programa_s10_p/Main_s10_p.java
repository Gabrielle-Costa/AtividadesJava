package Programa_s10_p;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_p {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nQuartos = 10, q;
		// int[] quarto = new int[nQuartos];
		String[] nome = new String[nQuartos];
		String[] email = new String[nQuartos];

		System.out.print("Quantos quartos serão alugados? ");
		int aluguel = sc.nextInt();

		if (aluguel != 0 && aluguel < +10) {

			for (int i = 0; i < aluguel; i++) {

				System.out.println();
				System.out.println("Aluguel numero " + (i + 1) + ": ");
				System.out.print("Nome: ");
				sc.nextLine();
				String nomeCliente = sc.nextLine();
				System.out.print("E-mail: ");
				String emailCliente = sc.nextLine();
				System.out.print("Quarto: ");
				q = sc.nextInt();

				nome[q] = nomeCliente;
				email[q] = emailCliente;

			}

		} else {

			System.out.println();
			System.out.println("Numero de pessoas exede a capaciadde. ");
		}

		System.out.println();
		System.out.println("Quartos ocupados: ");

		for (int i = 0; i < 10; i++) {

			if (nome[i] != null) {

				System.out.println(i + ": " + nome[i] + ", " + email[i]);
			}
		}

		sc.close();

	}

}
