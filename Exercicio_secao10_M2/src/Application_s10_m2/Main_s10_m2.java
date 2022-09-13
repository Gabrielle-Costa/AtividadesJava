package Application_s10_m2;

import java.util.Scanner;

public class Main_s10_m2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, n;
		
		System.out.print("Digite o numero de linhas e de colunas da matriz: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int [][] matriz = new int[a][b];
		System.out.println();
		
		System.out.println("Digite os numeros da matriz: ");
		
		for ( int i =0; i<a; i++) {
			for (int j=0; j<b; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("Numero: ");
		n = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length ; j++) {
				if (matriz[i][j]== n) { // procura o numero N a matriz.
					System.out.println("Posição: " + i + ", " + j);
					
						if(j > 0){
							System.out.println("Esquerda: " + matriz[i][j-1]);
						 }
						if(i > 0) {
							 System.out.println("Emcima: " + matriz[i-1][j]);
							 }
						if(j < matriz[i].length - 1) {
							System.out.println("Direita: " + matriz[i][j+1]);
						}
						 
						if (i < matriz.length - 1) {
							 System.out.println("Embaixo: " + matriz[i+1][j]);
						 }
						
				 
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		
		/*for (int i=0; i<a; i++) {
			System.out.println();
			for(int j=0; j<b; j++) {
				System.out.print(matriz[i][j] + " ");
			}*/
		}
		
		
		
		
		
		
		sc.close();

	}

}
