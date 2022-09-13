package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Retangulo.Retang;

public class Main_1_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//double result, perimetro, diagonal;
		
		Retang ret;
		
		ret= new Retang();
		
		System.out.print("Enter rectangle width and height: ");
		ret.alt = sc.nextDouble();
		ret.larg = sc.nextDouble();
		/*
		result = ret.area();
		perimetro = ret.perimetro();
		diagonal = ret.diagonal();
		
		System.out.printf("Area: %.2f%n", result);
		System.out.printf("Perimetro: %.2f%n", perimetro);
		System.out.printf("Diagonal: %.2f%n", diagonal);
		*/
		System.out.println();
		System.out.println(ret);
	
		
		sc.close();

	}



}
