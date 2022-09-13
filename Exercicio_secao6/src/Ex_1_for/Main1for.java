package Ex_1_for;

import java.util.Locale;
import java.util.Scanner;

public class Main1for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		for ( int x = 0; x <= n; x++) {
			
			if (x%2 != 0) {
				
				System.out.println(x);
				
			}
		}
		
		
		
		
		
		sc.close();

	}

}
