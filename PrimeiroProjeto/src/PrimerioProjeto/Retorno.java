package PrimerioProjeto;

import java.util.Scanner;

public class Retorno {

	public static void main(String[] args) {
		System.out.println(saudacao("Fernando"));
		System.out.println(numeroFavorito());
		
		int dobro = dobro(7);
		System.out.println("O dobro é: "+dobro);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual seu salário?");
		double salario = scanner.nextDouble();
		System.out.println("Qual seu aumento?");
		double aumento = scanner.nextDouble();
		
		double novoSalario = aumento(salario, aumento);
		System.out.println("Novo Salário: R$"+novoSalario);
		
		/*PEÇA A NOTA PARA O USUÁRIO, SE A NOTA FOR MAIOR OU IGUAL A 7, MOSTRE "APROVADO", SENÃO, "REPROVADO"*/
		System.out.println("Digite sua nota:");
		int nota = scanner.nextInt();
		String avaliacao = retorno(nota);
		System.out.println("Você foi: "+avaliacao);
	}
	public static String saudacao(String nome) {
		return "Olá " + nome;
	}
	
	public static int numeroFavorito() {
		return 5;
	}
	
	public static int dobro(int numero) {
		return numero*2;
	}
	
	public static double aumento(double salario, double aumento) {
		double novoSalario = salario + aumento;
		return novoSalario;
	}
	
	public static String retorno(int nota) {
		if(nota >= 7) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}
	
}
