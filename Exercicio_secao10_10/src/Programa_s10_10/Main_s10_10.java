package Programa_s10_10;

import java.util.Locale;
import java.util.Scanner;

public class Main_s10_10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media;
		
		System.out.print("Quantos alunos serão digitados? ");
		int q = sc.nextInt();
		
		
		double[] pNota = new double [q];
		double[] sNota = new double [q];
		String[] nome = new String[q];
		
		
		for ( int v =0; v<q; v++) {
			
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (v+1) + "o aluno");
			nome[v] = sc.nextLine();
			pNota[v] = sc.nextDouble();
			sNota[v] = sc.nextDouble();
			
		}
		System.out.println("Alunos Aprovados: ");
		
		for (int v=0; v<q; v++) {
			
			media = (pNota[v] + sNota[v]) /2;
			
			if (media >= 6.0) {
				System.out.println(nome[v]);
			}
			
		}
		
		
		
		
		sc.close();

	}

}
