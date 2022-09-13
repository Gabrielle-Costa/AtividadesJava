package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entities.Aluguel;
import modelo.entities.Veiculo;
import modelo.servicos.ServicoAluguel;
import modelo.servicos.TaxaServicoBrazil;

public class Main_s18_loc {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		
		System.out.println("Digite os dados do carro:");
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		System.out.print("Data incial (dd/mm/aaaa hh:mm):");
		Date dtInicial = sdf.parse(sc.nextLine());
		System.out.print("Data final (dd/mm/aaaa hh:mm):");
		Date dtFinal = sdf.parse(sc.nextLine());
		
		Aluguel aluguel = new Aluguel(dtInicial, dtFinal, new Veiculo(modelo));		
		
		System.out.print("Valor por hora: ");
		double valorPorHora = sc.nextDouble();
		System.out.print("Valor por dia: ");
		double valorPorDia = sc.nextDouble();
				
		ServicoAluguel srvAluguel = new ServicoAluguel(valorPorHora, valorPorDia, new TaxaServicoBrazil());
		
		srvAluguel.calculoAluguel(aluguel);
		
		System.out.println();
		System.out.println("Aluguel: ");
		System.out.println("Pagamento: " + String.format("R$ %.2f", aluguel.getFatura().getPagamento()));
		System.out.println("Taxa: " + String.format("R$ %.2f", aluguel.getFatura().getTaxa()));
		System.out.println("Total: " + String.format("R$ %.2f", aluguel.getFatura().pagtoTotal()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
