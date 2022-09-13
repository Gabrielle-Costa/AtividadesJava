package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Funcionario.Cadastro;

public class Main_s10_lista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Integer idf;
		List<Cadastro> listF = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int r = sc.nextInt();
		
		for (int i = 0; i < r; i++) {
			
			
			System.out.println();
			System.out.println("Funcionário numero " + (i+1)+ ":");
			System.out.print("ID: ");
			idf = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			Cadastro novoCad = new Cadastro(idf, nome, salario);
			listF.add(novoCad);
			
		}
		
		System.out.println();
		System.out.print("Digite com o Id do funcionário que irá receber o aumento: ");
		int id = sc.nextInt();

		
		Cadastro cod = listF.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if ( cod == null) {
			
			System.out.println("Este Id não existe. ");
		}else {
			
			System.out.print("Digite o percentual de aumento: ");
			double percent = sc.nextDouble();
			cod.aumentoSal(percent);
			
		}
		
		System.out.println();
		System.out.print("Lista de funcionários: ");
		System.out.println();
		
		for (Cadastro funcionario : listF) {
			
			System.out.print(funcionario);
		}

		
		
		
		
		
		
		
		
		sc.close();

	}

}
