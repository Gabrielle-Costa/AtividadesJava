package Ex_4;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double hfunc, pfunc, sfunc;
		int nfuc;
		
		System.out.print("Digite o numero do funcion�rio: ");
		nfuc = sc.nextInt();
		System.out.print("Digite as horas trabalhadas: ");
		hfunc = sc.nextDouble();
		System.out.print("Digite o sal�rio: ");
		pfunc = sc.nextDouble();
		
		sfunc = hfunc * pfunc;
		System.out.println();
		System.out.println("Funcion�rio numero: " + nfuc);
		System.out.printf("Salario: R$ %.2f%n", sfunc);
		
		
		
		
		
		
		sc.close();
	}

}
