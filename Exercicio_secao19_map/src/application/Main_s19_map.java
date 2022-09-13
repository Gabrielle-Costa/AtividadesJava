package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Main_s19_map {

	public static void main(String[] args) {

		File arquivo = new File("C:\\Users\\gabby\\OneDrive\\�rea de Trabalho\\Java Udemy\\Se��o 19\\eleicao.txt");
		Map<String, Integer> candidato = new TreeMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

			String linha = br.readLine();
			while (linha != null) {
				String[] vec = linha.split(",");
				String nome = vec[0];
				int votos = Integer.parseInt(vec[1]);

				if (candidato.containsKey(nome)) {
					int somaVoto = candidato.get(nome);
					candidato.put(nome, votos + somaVoto);
				} else {
					candidato.put(nome, votos);
				}

				linha = br.readLine();
			}
			
			for(String s: candidato.keySet()) {
				System.out.println(s + ": " + candidato.get(s));
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getStackTrace());
		}

	}

}
