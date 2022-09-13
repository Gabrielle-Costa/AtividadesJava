package Programa_s10_6;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Quantos valores terão em cada vetor: ");
		int n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int [n];
		int[] soma = new int[n];
		
		System.out.println("Digite os valores do vetor A. ");

		for( int v = 0; v <n; v++) {
			
			vetorA[v] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B. ");
		
		for (int v=0;v<n;v++) {
			
			vetorB[v] = sc.nextInt();
			
		}
		
				
		System.out.println("Vetor Resultante: ");
		
		for ( int v=0; v<n; v++) {
			
			soma[v] = vetorA[v] + vetorB[v];
			System.out.println(soma[v]);
			
		}
		
		sc.close();
	}

}
