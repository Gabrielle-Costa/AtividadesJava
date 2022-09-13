package Ex_6;

import java.util.Locale;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double n;
		
		n =sc.nextDouble();
		
		if ((n >= 0.00) && (n <= 25.00)) {
			
			System.out.printf("Intervalo: [0,25]");
			
		}else if ((n > 25.00) && (n <= 50.00)){
			
			System.out.printf("Intervalo: [25,50]");
			
		}else if ((n > 50.00) && (n <= 75.00)) {
			
			System.out.printf("Intervalo: [50,75]");
			
		}else if ((n > 75.00) && (n <= 100.00)) {
			
			System.out.printf("Intervalo: [75,100]");
			
		}else
			
			System.out.println("Fora do intervalo.");
		
			
		
		sc.close();

	}

}
