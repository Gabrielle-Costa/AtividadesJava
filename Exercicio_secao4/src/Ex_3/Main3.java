package Ex_3;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	 int a, b, c, d, diferenca;
	 
	System.out.print("Digite o primeiro valor: ");
	 a = sc.nextInt();
	
	System.out.print("Digite o segundo valor: ");
	 b = sc.nextInt();
	
	System.out.print("Digite o terceiro valor ");
	 c = sc.nextInt();
	
	System.out.print("Digite o quarto valor ");
	 d = sc.nextInt();
	 
	 diferenca = a*b - c*d;
	 
	System.out.println("DIFERENCA = "+ diferenca);
	
	
	sc.close();
	
	}

}
