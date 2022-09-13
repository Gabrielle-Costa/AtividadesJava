package Programa_s10_4;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, p = 0;
		
		System.out.print("Quantos numeros serão digitados: ");
		n = sc.nextInt();
		int [] pares = new int[n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Digite o " + (i+1) + "o numero: ");
			pares [i] = sc.nextInt();
			
			
		}
		
		System.out.print("Numeros pares: ");
		
		for (int i = 0; i <n; i++) {
					
			if (pares[i]%2 == 0 ) {
				p = p+1;
				System.out.print(pares[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Quantidade de pares: " + p);
		
		
		
		
		sc.close();

	}

}
