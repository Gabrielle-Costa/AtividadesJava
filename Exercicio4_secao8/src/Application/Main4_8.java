package Application;

import java.util.Locale;
import java.util.Scanner;

import Conversor.Calculadora;

public class Main4_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual valor do dollar? ");
		Calculadora.dollar = sc.nextDouble();
		System.out.print("Quantos dollares pretende comprar? ");
		Calculadora.cambio = sc.nextDouble();
		//System.out.printf("Voce precisara de R$: %.2f", Calculadora.conversao());//
		
		Calculadora result = new Calculadora();
		System.out.println(result);
		
		
		sc.close();

	}

}
