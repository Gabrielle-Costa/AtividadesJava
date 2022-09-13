package Ex_4_for;

import java.util.Locale;
import java.util.Scanner;

public class Main4for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, r;
		int n;
		
		n = sc.nextInt();
		
		for (int i =0; i < n; i++) {
			
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			if (b != 0) {
				
				r = a/b;
				
				System.out.printf("%.1f%n", r);
				
			}else
				System.out.println("Divisão Impossível");
			
			
			
		}
		
		
		sc.close();
	}

}
