package Programa_s10_3;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double media = 0, soma = 0;
		int id = 0, percentI;

		System.out.print("Quantos nome serão digitados? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();

			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			System.out.println();
			
		
		}

		for (int i = 0; i < n; i++) {

			soma = soma + altura[i];
		}

		media = soma / n;

		System.out.printf("Altura média: %.2f%n", media);

		for (int i = 0; i < n; i++) {

			if (idade[i] < 16) {
				id = id + 1;

			}

		}
		percentI = (id * 100) / n;
		System.out.println("Pessoas com menos de 16 anos: " + percentI + ".0%");

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

		sc.close();

	}

}
