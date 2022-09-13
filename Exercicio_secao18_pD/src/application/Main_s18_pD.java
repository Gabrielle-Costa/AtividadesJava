package application;

import devices.Impressora;
import devices.Scanner;

public class Main_s18_pD {

	public static void main(String[] args) {
		
		Impressora p = new Impressora ("1080");
		p.processDoc("Minha carta");
		p.print("Minha carta");
		
		Scanner s = new Scanner("2003");
		s.processDoc("meu e-mail");
		System.out.println("Resultado scaneado: " + s.scanner());
		 

	}

}
