package Ex_3_for;

import java.util.Locale;
import java.util.Scanner;

public class Main3for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double caso1 = 0 , caso2 = 0 , caso3 = 0, result;
		
		n = sc.nextInt(); //numero de casos
		
		for (int i = 0; i< n; i++ ) { //repetir o numero de casos
			
			for (int y = 0; y <3; y++) { //repetir 3. receber 3 numeros
				
				if( y == 0) {
					
					caso1 = sc.nextDouble();
					caso1 = caso1 * 2;
					
				}else if (y == 1) {
					
					caso2 = sc.nextDouble();
					caso2 = caso2 *3;
				}else if (y == 2) {
					
					caso3 = sc.nextDouble();
					caso3 = caso3 * 5;
				}
					
			}
			result = (caso1 + caso2 + caso3 )/10;
			
			System.out.printf("%.1f%n", result);
			
		}
		
		
		
		sc.close();

	}

}
