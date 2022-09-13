package Ex_5;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double cod, quant, valor;
		
		cod = sc.nextDouble();
		quant = sc.nextDouble();
		
		if (cod == 1) {
			
			valor = quant * 4.0;
			System.out.printf("Valor a pagar R$ %.2f%n", valor);
		
		}else if (cod == 2) {
			
			valor = quant * 4.50;
			System.out.printf("Valor a pagar R$ %.2f%n", valor);
		
		}else if (cod == 3){
			
			valor = quant * 5.0;
			System.out.printf("Valor a pagar R$ %.2f%n", valor);
			
		}else if (cod == 4) {
			
			valor = quant * 2.0;
			System.out.printf("Valor a pagar R$ %.2f%n", valor);
		
		}else if(cod == 5) {
			
			valor = quant * 1.50;
			System.out.printf("Valor a pagar R$ %.2f%n", valor);
		
		}else
			
			System.out.println("Produto inválido");
		
		
		
		
		
		
		
		sc.close();

	}

}
