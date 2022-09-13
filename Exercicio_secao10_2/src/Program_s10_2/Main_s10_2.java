package Program_s10_2;

import java.util.Locale;
import java.util.Scanner;


public class Main_s10_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0, media = 0;

		System.out.print("Quantos numeros serão digitados? ");
		int n = sc.nextInt();
		double[] vect = new double[n];


		for (int i = 0; i < n; i++) {

			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma = soma + vect[i];
			media = media + vect[i] / n;

		}
		System.out.print("Numeros =");
		for (int i = 0; i < n; i++) {

			System.out.print(" " + vect[i]);
		}
		System.out.println();

		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Media = %.2f%n", media);

		sc.close();

	}

}
