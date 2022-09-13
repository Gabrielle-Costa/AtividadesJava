package Application_m;

import java.util.Scanner;

public class Main_s10_m1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, c = 0;

		System.out.print("Digite o numero n para colunas e linhas: ");
		n = sc.nextInt();

		int[][] matriz = new int[n][n];

		System.out.println("Digite os numeros da matriz: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Diagonal : ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(matriz[i][j] + " ");

				}
			}
		}

		// Utilizado pelo profesor
		/*
		 * for (int i = 0; i < n; i++) { System.out.print(matriz[i][i] + " "); }
		 */

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					c += 1;
				}
			}
		}

		System.out.println();
		System.out.println("Quantidade de numeros negativos: " + c);

		// Não foi pedido no exercicio:

		System.out.println();
		System.out.print("Matriz: ");

		for (int i = 0; i < n; i++) {
			System.out.println();

			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

		sc.close();

	}

}
