package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros serão digitados? ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int x = 0; x <n; x++) {
			System.out.print("Digite um numero: ");
			vect[x] = sc.nextInt();
			
		}
		
		System.out.print("Numeros negativos:");
		
		for ( int x = 0; x < n; x++) {
			
			if (vect [x] <0) {
				System.out.print(" " + vect [x]);
			}
			
		}
		
		
		
		sc.close();
	}

}
