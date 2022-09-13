package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;

public class Main_s17_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Produto> list = new ArrayList<>();

		String path = "C:\\Users\\gabby\\OneDrive\\�rea de Trabalho\\Java Udemy\\Se��o 17\\arq.csv"; //Caminho at� o arquivo.
		
		File caminhoArq = new File (path); //Caminho at� a pasta onde est� o arquivo
		String caminhoPasta = caminhoArq.getParent(); //Indicando que o ultimo lido � o arquivo.
		
		boolean sucesso = new File(caminhoPasta + "\\out").mkdir(); //Criando nova pasta
		
		String lugarNovoArq = caminhoPasta + "\\out\\summary.csv"; //Criando novo arquivo na nova pasta
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //Instancia a leitura do aquivo colocando o caminho at� o arquivo

			String line = br.readLine(); //Lendo a linha do arquivo
			
			while (line != null) { //La�o para ler at� a ultima linha do arquivo
				
				
				String [] itens = line.split(","); // separar o nome, o pre�o e a quantidade dos itens do arquivo
				String name = itens[0]; //primeira posicao o nome;
				double preco = Double.parseDouble(itens[1]); // Pega a segunda posi��o que � string e converte para double
				int quantidade = Integer.parseInt(itens[2]); // pega a terceira posi��o e converte para int
				
				list.add(new Produto(name, preco, quantidade)); // insere todas as caracteristicas do produto em uma lista
				
				line = br.readLine(); // ler a pr�xima linha
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(lugarNovoArq))){ //reescrever o arquivo
				
				for(Produto prod: list) { //la�o para percorrer a lista de produtos
					bw.write(prod.getNome() + "," + String.format("%.2f", prod.total()));
					bw.newLine();
					
				}
	
			}catch (IOException e) {
				e.getStackTrace();
			}

		} catch (IOException e) {
			e.getStackTrace();
		}
		
		System.out.println("ARQUIVO CRIADO!");

	}
}
