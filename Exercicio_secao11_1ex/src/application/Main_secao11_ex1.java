package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelDoCargo;

public class Main_secao11_ex1 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do departamento: ");
		String dep = sc.nextLine();
		System.out.println("Entre com os dados do funcionário: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Entre com o nivel do funcionário: ");
		String nivel = sc.nextLine();
		System.out.print("Digite o salario base: ");
		double salBase = sc.nextDouble();

		Trabalhador func = new Trabalhador(nome, NivelDoCargo.valueOf(nivel), salBase, new Departamento(dep));

		System.out.print("Quantos contratos tem esse funcionario: ");
		int nContratos = sc.nextInt();

		for (int i = 1; i <= nContratos; i++) {
			System.out.println("Digite o primeiro " + i + "º contrato:");
			System.out.print("Data (DD/MM/AAAA): ");
			Date datac = sdf.parse(sc.next());
			System.out.print("Digite o valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Digite a quantidade de horas: ");
			int hora = sc.nextInt();

			Contrato cont = new Contrato(datac, valorPorHora, hora);
			func.addContratos(cont);
		}
		System.out.println();
		System.out.print("Digite mes e ano para calcular a renda (MM/AAAA): ");
		String mesEAno = sc.next();

		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));

		System.out.println();
		System.out.println("Nome: " + func.getNome());
		System.out.println("Departamento: " + func.getDp().getDepartamento());
		System.out.printf("Renda de " + mesEAno + String.format(": %.2f", func.renda(ano, mes)));

		sc.close();

	}

}
