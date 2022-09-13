package Application;

import java.util.Locale;
import java.util.Scanner;

import Funcionario.Func;

public class Main_2_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Func f = new Func();
		double aumento;

		System.out.print("Nome: ");
		f.nome = sc.nextLine();

		System.out.print("Salario Bruto: ");
		f.salarioBruto = sc.nextDouble();

		System.out.print("Taxa: ");
		f.taxa = sc.nextDouble();

		System.out.println();
		System.out.printf("Funcionario: %s, salario R$ %.2f%n", f.nome, f.salarioLiquido());
		System.out.println();
		System.out.print("O salario vai aumentar quanto, em porcentagem? ");
		aumento = sc.nextDouble();

		f.aumentoSalario(aumento);

		/*System.out.println();
		System.out.printf("Salario atualizado: R$ %.2f%n", f.salarioBruto);*/
		System.out.println();
		System.out.println(f);

		sc.close();

	}

}
