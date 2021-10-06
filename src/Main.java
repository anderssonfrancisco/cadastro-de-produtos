import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import Models.Produto;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---Cadastro de produto---");
		
		int opcao;
		
		do {
			System.out.println("1 - Cadastrar novo produto");
			System.out.println("0 - SAIR");
			System.out.println("O que você deseja fazer?");
			opcao = scanner.nextInt();
			
			process(opcao);
		}while(opcao != 0);

		
	}

	 public static void process(int opcao) throws Exception{
		 switch(opcao) {
		
		 case 1: {

		        Scanner scanner = new Scanner(System.in);
		     
			    System.out.println("Qual a descrição do Produto?");
				String descricao = scanner.nextLine();
				
				System.out.println("Qual o ID do produto?");
				int id = scanner.nextInt();
				
				System.out.println("Qual o preço? ");
				double preco = scanner.nextDouble();
				
				System.out.println("Qual a data de validade?");
				String dataString = scanner.next();
				
				Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
				
				Produto novoProduto = new Produto(id, descricao, preco, dataValidade );
				
				System.out.println("Produto criado com sucesso:");
				System.out.println("--- ID: " + novoProduto.getId());
				System.out.println("--- Descrição: " + novoProduto.getDescricao());
				System.out.println("--- Preço: " + novoProduto.getPreco());
				System.out.println("--- Data de validade: " + dataValidade);
				
			break;	
		 }
		 }
	
}
}
 



