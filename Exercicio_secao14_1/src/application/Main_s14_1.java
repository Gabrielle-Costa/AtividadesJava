package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.produtoImportado;
import entities.produtoUsado;

public class Main_s14_1 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> listProd = new ArrayList<>();
		
		System.out.print("Digite o numero de produtos: ");
		int n = sc.nextInt();
		
		for (int i =1; i <= n; ++i) {
			System.out.println("Digite os dados do " + i + "º produto: ");
			System.out.print("Comum, Usado ou Importado (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Custo do frete: ");
				double custoFrete = sc.nextDouble();
				
				listProd.add(new produtoImportado(nome, preco, custoFrete));
			}
			if(ch =='c') {
				listProd.add(new Produto(nome, preco));
			}
			if(ch == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA): ");
				Date dataFab = sdf.parse(sc.next());
				listProd.add(new produtoUsado(nome, preco, dataFab));
			}
		}
		
		System.out.println();
		System.out.print("ETIQUETAS DE PREÇO: ");
		
		for (Produto prod: listProd) {
			
			System.out.print(prod.etiquetaPreco());
			
		}
		
		
		
		sc.close();

	}

}
