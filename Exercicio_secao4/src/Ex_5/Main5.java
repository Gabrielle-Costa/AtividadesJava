package Ex_5;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cpeca1, cpeca2;
		double qpeca1, qpeca2, vupeca1, vupeca2, total;
		
		System.out.print("Peca 1: ");
		//System.out.print("Codigo do 1 item: ");
		cpeca1 = sc.nextInt();
		//System.out.print("Quantidade: ");
		qpeca1 = sc.nextDouble();
		//System.out.print("Preço: ");
		vupeca1 = sc.nextDouble();
		
		System.out.print("Peca 2: ");
		//System.out.print("Codigo do 2 item: ");
		cpeca2 = sc.nextInt();
		//System.out.print("Quantidade: ");
		qpeca2 = sc.nextDouble();
		//System.out.print("Preço: ");
		vupeca2 = sc.nextDouble();
		
		total = (qpeca1*vupeca1)+(qpeca2*vupeca2);
		
	
		System.out.printf("Valor total a pagar: R$ %.2f%n", total);
		
		sc.close();

	}

}
