package Application;

import java.util.Locale;
import java.util.Scanner;

import Aluno.Aluno;

public class Main_3_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno estudante = new Aluno();
		
		System.out.print("Nome do aluno: ");
		estudante.nome = sc.nextLine();
		System.out.print("Nota do primeiro trimestre: ");
		estudante.nt1 = sc.nextDouble();
		System.out.print("Nota do segundo trimestre: ");
		estudante.nt2 = sc.nextDouble();		
		System.out.print("Nota do terceiro trimestre: ");
		estudante.nt3 = sc.nextDouble();
		System.out.println();
		
		if (estudante.nota() > 60) {
			
			System.out.printf("Nota final: %.2f%n", estudante.nota());
			System.out.println("APROVADO");
			
		}else {
			
			double nota = 60 - estudante.nota();
			System.out.printf("Nota Final: %.2f%n", estudante.nota());
			System.out.println("REPROVADO");
			System.out.printf("Faltou %.2f pontos%n", nota);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
