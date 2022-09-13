package Ex_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio, p, area;
		p = 3.14159;
		
		System.out.print( "Digite a raio do ciculo: ");
		raio = sc.nextDouble();
		
		area = p * Math.pow(raio, 2.0);
		
		System.out.printf("Area = %.4f", area);
		
		
		sc.close();
		
		
		
		
		
		

	}

}
