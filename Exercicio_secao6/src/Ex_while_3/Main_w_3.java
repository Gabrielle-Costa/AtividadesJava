package Ex_while_3;

import java.util.Scanner;

public class Main_w_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = 0, g = 0, d = 0;
		int c = sc.nextInt();
		
		while (c != 4) {
			
			c = sc.nextInt();
			
			if (c == 1) {
				a = a + 1;
			}else if (c == 2) {
				g = g + 1;
			}else if (c == 3) {
				d = d + 1;
			}
			
		} 
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: "+ d);
		
		sc.close();

	}

}
