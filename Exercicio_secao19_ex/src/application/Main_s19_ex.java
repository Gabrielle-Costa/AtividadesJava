package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import entities.Usuario;

public class Main_s19_ex {

	public static void main(String[] args) throws ParseException {

		String caminho = "C:\\Users\\gabby\\OneDrive\\�rea de Trabalho\\Java Udemy\\Se��o 19\\in.txt";
		Set<Usuario> acesso = new HashSet<>();

		try (BufferedReader bf = new BufferedReader(new FileReader(caminho))) {

			String linha = bf.readLine();
			while (linha != null) {
				String[] vec = linha.split(" ");
				String nome = vec[0];
				String dt = vec[1]; // Date dt = Date.from(Instant.parse(vec[1]));
				Date dtAcesso = Date.from(Instant.parse(dt));
				
				Usuario user = new Usuario(nome, dtAcesso);
				
				acesso.add(user); // acesso.add(new Usuario(nome, dtAcesso));

				linha = bf.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());

		}

		
		System.out.println("Total de usuarios: " + acesso.size());

	}
}
