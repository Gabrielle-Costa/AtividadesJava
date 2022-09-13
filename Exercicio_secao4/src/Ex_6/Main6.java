package Ex_6;

import java.util.Locale;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a, b, c;
		double areaTret, areaCirc, areaTrap, areaQuad, areaRet;
		
		System.out.print("Digite A: ");
		a = sc.nextDouble();
		System.out.print("Digite B: ");
		b = sc.nextDouble();
		System.out.print("Digite C: ");
		c = sc.nextDouble();
		
		areaTret = (a*c)/2.0;
		areaCirc = Math.pow(c, 2.0)* 3.14159;
		areaTrap = (a+b) * c / 2.0;
		areaQuad = b*b ;
		areaRet = a*b;
		
		System.out.printf("Area do tringulo retangulo: %.3f%n", areaTret);
		System.out.printf("Area do ciculo: %.3f%n", areaCirc);
		System.out.printf("Area do trapézio: %.3f%n", areaTrap);
		System.out.printf("Area do quadrado: %.3f%n", areaQuad);
		System.out.printf("Area do retângulo: %.3f%n", areaRet);
		
		
		sc.close();

	}

}
