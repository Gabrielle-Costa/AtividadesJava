package Programa_s10_11;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double altMenor = 0, altMaior = 0, contM = 0, somaM = 0, media;
		int contH = 0;

		System.out.print("Quantas pessoas serão digitadas? ");
		int p = sc.nextInt();

		double[] altura = new double[p];
		char[] genero = new char[p];

		for (int v = 0; v < p; v++) {

			System.out.print("Altura da " + (v + 1) + "a pessoa: ");
			altura[v] = sc.nextDouble();
			System.out.print("Genero da " + (v + 1) + "a pessoa: ");
			genero[v] = sc.next().charAt(0);

			if (altura[v] > altMaior) {

				altMaior = altura[v];

			} else {

				altMenor = altura[v];
			}

		}

		for (int v = 0; v < p; v++) {
			
			if (genero[v] == 'f' || genero[v] == 'F') {

				contM = contM + 1;
				somaM = somaM + altura[v];

			} else if (genero[v] == 'm' || genero[v] == 'M') {

				contH = contH + 1;
			}
		}

		media = somaM / contM;
		
		System.out.println();
		System.out.printf("Menor Altura: %.2f%n", altMenor);
		System.out.printf("Maior Altura: %.2f%n", altMaior);
		System.out.printf("Media das alturas das mulheres: %.2f%n", media);
		System.out.print("Numero de homens: " + contH);

		sc.close();

	}

}
