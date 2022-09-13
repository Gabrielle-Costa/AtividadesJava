package Ex_7_for;

import java.util.Locale;
import java.util.Scanner;

public class Main7for {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n;
		double q, c;
		
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			q = Math.pow(i, 2);
			c = Math.pow(i, 3);
			
			System.out.print(i);
			System.out.printf(" %.0f %.0f%n", q, c);
		}
		
			
		
		sc.close();

	}

}
