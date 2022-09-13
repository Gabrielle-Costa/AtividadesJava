package Ex_2_for;

import java.util.Locale;
import java.util.Scanner;

public class Main2for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		int x, dentro = 0 , fora = 0;
		
		for (int i =0; i< n; i++) {
			
			System.out.print("Valor numero " + i + ": ");
			x=sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				
				dentro = dentro + 1;
				
			}else {
				fora = fora +1;
			}
				
		}
		System.out.println(dentro + " int");
		System.out.println(fora + " out");
		
		
		
		
		
		sc.close();
	

	}

}
