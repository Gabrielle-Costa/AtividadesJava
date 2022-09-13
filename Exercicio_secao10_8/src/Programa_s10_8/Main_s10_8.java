package Programa_s10_8;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double media, soma = 0, m=0;

		System.out.print("Quantos elementos vai ter no vetor? ");
		int e = sc.nextInt();

		double[] vetor = new double[e];

		for (int v = 0; v < e; v++) {

			System.out.print("Digite um numero: ");
			vetor[v] = sc.nextDouble();

			if (vetor[v] % 2 == 0) {
				soma = soma + vetor[v];
				m = m+1;
			}

		}

		if (soma == 0) {
			
			System.out.println("Nenhum numero par.");
		
		}else {
			
			media = soma / m;
			
			System.out.printf("Media dos valores %.1f%n", media);
		}

		sc.close();

	}

}
