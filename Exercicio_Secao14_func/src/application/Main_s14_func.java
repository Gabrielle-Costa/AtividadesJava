package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class Main_s14_func {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//A lista é do tipo funcionario que é a classe super. Não colocar esse tipo no arreylist.
		
		List<Funcionario> listFunc = new ArrayList<>();

		System.out.print("Digite o numero de funcionarios: ");
		int nFunc = sc.nextInt();

		for (int i = 1; i <= nFunc; ++i) {

			System.out.println("Dados do " + i + "º funcionario: ");
			System.out.print("Tercerizado? (y/n): ");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nomeF = sc.next();
			System.out.print("Horas trabalhadas: ");
			int horasF = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();

			if (c == 'y' || c == 'Y') {

				System.out.print("Valor adicional: ");
				double valorAdicional = sc.nextDouble();
				listFunc.add(new FuncionarioTercerizado(nomeF, horasF, valorPorHora, valorAdicional));

			} else {

				listFunc.add(new Funcionario(nomeF, horasF, valorPorHora));

			}

		}

		System.out.println();
		System.out.println("PAGAMENTOS: ");

		for (Funcionario func : listFunc) {
			
			System.out.println(func.getNome() + " - $ " + String.format("%.2f", func.pagamento()));

		}

		sc.close();

	}

}
