package Ex_8;

import java.util.Locale;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double s, i, iM, v, vM, vX, iX, total;
		
		s = sc.nextDouble();
		
		if (s >= 0 && s <= 2000.00) {
			
			System.out.println("Isento");
		
		}else if ( s >= 2000.01 && s <= 3000.00 ) {
			
			v = s - 2000.00;
			i = (v * 0.08 );
			
			System.out.printf("Imposto R$ %.2f", i);
			
		}else if ( s >= 3000.01 && s <= 4500.00) {
			
			v = s - 3000.00; 
			i = (v * 0.18);
			vM = (s - 2000.00) - v;
			iM = (vM * 0.08);	
			total = i + iM;
			
			System.out.printf( "Imposto R$ %.2f", total);
			
		}else if (s > 4500.00) {
			
			v = s - 4500.00; 
			i = v * 0.28;
			vM = s - 3000.00 - v;
			iM = vM * 0.18;
			vX = s - 2000.00 - vM-v;
			iX = vX * 0.08;
			
			total = i + iM + iX;
			
			System.out.printf("Importo R$ %.2f", total);
			
		}
		
		
		
		
		sc.close();

	}

}
