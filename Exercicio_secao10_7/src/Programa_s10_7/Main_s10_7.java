package Programa_s10_7;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double soma=0, media=0;
		
		System.out.print("Quantos elemetos o vetor terá? ");
		int e = sc.nextInt();
		double[] vet = new double[e];
		
		for( int v =0; v<e; v++) {
			
			System.out.print("Digite um numero: ");
			vet[v] = sc.nextDouble();
			soma = soma + vet[v];
			
		}
		System.out.println();
		media = soma/e;
		System.out.printf("Media do vetor: %.3f%n", media);
		System.out.println("Elementos abaixo da média: ");
		
		for (int v=0; v < e; v++) {
			
			if (vet[v] < media) {
				System.out.printf("%.1f%n", vet[v]);
			}
			
		}
		
		
		sc.close();

	}

}
