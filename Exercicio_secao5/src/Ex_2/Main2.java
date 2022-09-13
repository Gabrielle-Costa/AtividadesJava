package Ex_2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		
		if ( n%2 == 0) {
			System.out.println("PAR");
		}else
			System.out.println("IMPAR");
		
		sc.close();
	}

}
