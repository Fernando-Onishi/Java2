package PrimerioProjeto;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		mensagem();
		linha();
		contagem();
		saudacao("Fernando");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual sua idade?");	
		int idade = scanner.nextInt();
		classificacao(idade);
		
		System.out.println("Quantos produtos comprou?");
		int quantidade = scanner.nextInt();
		System.out.println("Qual o valor do produto?");
		double valor = scanner.nextDouble();
		compra(quantidade, valor);
	}
	
	public static void mensagem() {
		System.out.println("Função sem retorno");
	}
	public static void linha() {
		System.out.println("------------------");
	}
	public static void contagem() {
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
//	Função com Parâmetro
	public static void saudacao(String nome) {
		System.out.println("Olá "+nome);
	}
	public static void classificacao(int idade) {
		if(idade >=18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
	}
	
	public static void compra(int quant, double valor) {
		double total = quant * valor;
		System.out.println("Pague: R$"+total);
	}
}
