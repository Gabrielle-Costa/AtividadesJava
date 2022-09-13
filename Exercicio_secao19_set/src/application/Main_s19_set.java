package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class Main_s19_set {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Aluno> setA = new HashSet<>();
		int cod, qt;
		
		System.out.print("Quantos alunos tem no curso A? ");
		qt = sc.nextInt();
		System.out.print("Digite os códigos dos alunos: ");
		
		for (int i = 1; i<=qt; ++i) {
			cod = sc.nextInt();
			setA.add(new Aluno(cod));
		}
		System.out.print("Quantos alunos tem no curso B? ");
		qt = sc.nextInt();
		System.out.print("Digite os códigos dos alunos: ");
		
		for (int i = 1; i<=qt; ++i) {
			cod = sc.nextInt();
			setA.add(new Aluno(cod));
		}
		System.out.print("Quantos alunos tem no curso C? ");
		qt = sc.nextInt();
		System.out.print("Digite os códigos dos alunos: ");
		
		for (int i = 1; i<=qt; ++i) {
			cod = sc.nextInt();
			setA.add(new Aluno(cod));
		}
		
		System.out.println("Quantidade de alunos: " + setA.size());
		
		
		sc.close();

	}

}
