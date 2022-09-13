package Ex_while_1;

import java.util.Scanner;

public class Main_w_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int senha = 2002;
		
		System.out.print("Digite a senha: ");
	    int e = sc.nextInt();
	   
	
		while ( e != senha) {
			
			System.out.println("Senha invalida");
			System.out.println();
			System.out.print( "Digite a senha novamente: ");
			e = sc.nextInt();
			
		}
		System.out.println("Acesso Permitido");
		
		
		sc.close();

	}

}
