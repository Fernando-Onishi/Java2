import java.util.Scanner;

public class FuncionarioP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		func.nome = "José";
		func.salario = 2000.00;
		func.novoSalario(500);
		System.out.println("---------------");
		System.out.println("Qual seu nome?");
		func.nome = scanner.next();
		System.out.println("Qual seu salário?");
		func.salario = scanner.nextDouble();
		System.out.println("Qual o aumento?");
		double aumento = scanner.nextDouble();
		
		func.novoSalario(aumento);
	}
}
