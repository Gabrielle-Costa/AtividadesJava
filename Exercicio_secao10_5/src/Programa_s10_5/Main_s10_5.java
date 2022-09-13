package Programa_s10_5;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, p=0;
		double maior = 0;

		System.out.print("Quantos numeros serão digitados? ");
		n = sc.nextInt();
		double[] num = new double[n];

		for (int x = 0; x < n; x++) {
			System.out.print("Digite o numero: ");
			num[x] = sc.nextDouble();

		}

		for (int x = 0; x < n; x++) {

			if (num[x] > maior) {
				maior = num[x];
				p=x;
			}
		}
		System.out.println();
		System.out.printf("Maior valor: %.1f%n", maior);
		System.out.println("Posição do maior valor: " + p);

		sc.close();

	}

}
