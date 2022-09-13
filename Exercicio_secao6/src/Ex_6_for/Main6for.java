package Ex_6_for;

import java.util.Locale;
import java.util.Scanner;

public class Main6for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n, r;
		
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
		 r = n%i;
			
			if ( r == 0) {
				
				System.out.println(i);
			}
			
		}
		
		
		
		
		sc.close();

	}

}
