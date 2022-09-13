package Ex_4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hI, hF, totalH, c;
		
		System.out.print("Qual hora inicial e qual hora final? ");
		hI = sc.nextInt();
		hF = sc.nextInt();
		
		if((hI < 24) && (hF < hI )){
			c = (24 - hI)+ hF;
			
			System.out.println("O jogo durou "+ c + " horas");
			
		}else {
			if ( hI == hF){ 
				//0) && (hF == 0) ) {
				System.out.println("O jogo durou 24 horas");
				
			}else if (hI < hF) {
				totalH = hF-hI;
				
				System.out.println("O jogo durou " + totalH + " horas.");
			}
		}
		
		
		sc.close();

	}

}
