package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import dominian.entities.Contrato;
import services.entities.ContratoServico;

public class Main_s18_1 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite os dados do contrato");
		System.out.print("Numero: ");
		int nContrato = sc.nextInt();
		System.out.print("Data (dd/mm/aaa): ");
		Date dtContrato = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");		
		double vrContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(nContrato, dtContrato, vrContrato);
		
		System.out.print("Quantidade de parcelas: ");
		int prc = sc.nextInt();
		
		ContratoServico calcContrato = new ContratoServico();

		calcContrato.CalculoContrato(contrato, prc);
		
		System.out.println();
		System.out.println("Parcelas do Contrato:");
		System.out.println(contrato);
		
		
		
	
		
		
		
		sc.close();

	}

}
