package Ex_3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("Digite dois numeros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if ((a%b == 0) || (b%a ==0)) {
			
			System.out.println("S�o multiplos");
			
		}else {
			
			System.out.println("N�o s�o multiplos");
			
		}
		
		
		sc.close();

	}

}
