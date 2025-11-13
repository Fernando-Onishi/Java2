package encapsulamento;

import java.util.Scanner;

public class LojaP {

	public static void main(String[] args) {
		Loja loja = new Loja();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("Cadastro de produtos");
		System.out.println("--------------------");
		
		System.out.print("Nome do Produto:");
		String nome = scanner.next();
		System.out.print("Valor do Produto");
		double valor = scanner.nextDouble();
		System.out.println("--------------------");
		
		loja.setNome(nome);
		loja.setPreco(valor);
		System.out.println("--------------------");
		System.out.println("Relatório do Produto");
		System.out.println("--------------------");
		System.out.println("Nome: "+loja.getNome());
		System.out.println("Valor:"+loja.getPreco());
		System.out.println("--------------------");
	}
}
