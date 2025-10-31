import java.util.Scanner;

public class AvaliacaoEx4P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AvaliacaoEx4 avaliacao = new AvaliacaoEx4();
		
		System.out.println("--------------------");
		System.out.println("Sistema de Notas");
		System.out.println("--------------------");
		
		System.out.print("Nome Aluno:");
		String nome = scanner.next();
		avaliacao.setNome(nome);
		
		System.out.println("--------------------");
		System.out.print("Nota 1:");
		double nota1 = scanner.nextDouble();
		avaliacao.setNota1(nota1);
		
		System.out.print("Nota 2:");
		double nota2 = scanner.nextDouble();
		avaliacao.setNota2(nota2);
		
		System.out.println("---------------------");
		System.out.println("        Média      ");
		System.out.println("---------------------");
		
		System.out.print("Aluno: "+avaliacao.getNome()+"\nNota1: "+avaliacao.getNota1()+"\nNota2: "+avaliacao.getNota2()+"\nMédia: "+avaliacao.media());

	}

}
