package Programa_s10_9;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int id = 0;
		String exposet = "Ninguém";
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int p = sc.nextInt();
		
		String[] nome = new String[p];
		int[] idade = new int[p];
		
		for (int v =0; v<p; v++) {
			
			System.out.println("Dados da " + (v+1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[v] = sc.next();
			System.out.print("Idade: ");
			idade[v] = sc.nextInt();
			
			if (idade[v] >id) {
				
				id = idade[v];
				exposet = nome[v];
			}
			
		}
		System.out.println();
		System.out.println("Pessoa mais velha: " + exposet );
		
		
		
		
		sc.close();

	}

}
