package Ex_5_for;

import java.util.Locale;
import java.util.Scanner;

public class Main5for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, f=1;
		n = sc.nextInt();
		

		if (n == 0) {

			System.out.println("1");

		} else if (n != 0) {
			
			for (int y = 1; y <= n; y++) {
				
			f = f * y;
				System.out.print(" " + f + " ");
		
		}
			System.out.println(f);
			}

		sc.close();

		}

}
