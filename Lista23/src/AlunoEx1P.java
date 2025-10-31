import java.util.Scanner;

public class AlunoEx1P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		AlunoEx1 aluno = new AlunoEx1();
		
		System.out.print("Nome: ");
		String nome = scanner.next();
		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		
		aluno.setNome(nome);
		aluno.setIdade(idade);		
		
		System.out.println("----------");
		System.out.println("Resultado");
		System.out.println("----------");
		
		System.out.println("Nome: "+aluno.getNome()+"\nIdade: "+aluno.getIdade());
	}
}