<<<<<<< HEAD
import java.util.Scanner;

public class ContaBancariaEx7P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContaBancariaEx7 contaBancaria = new ContaBancariaEx7();
		
		System.out.println("Qual o valor de deposito?");
		double deposito = scanner.nextDouble();
		contaBancaria.depositar(deposito);
		System.out.println("=========================");
		
		System.out.println("Qual o valor de saque? ");
		double valor = scanner.nextDouble();
		contaBancaria.sacar(valor);
		
		System.out.println("=========================");
		contaBancaria.mostrarSaldo();
	}

}
=======
import java.util.Scanner;

public class ContaBancariaEx7P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContaBancariaEx7 contaBancaria = new ContaBancariaEx7();
		
		System.out.println("Qual o valor de deposito?");
		double deposito = scanner.nextDouble();
		contaBancaria.depositar(deposito);
		System.out.println("=========================");
		
		System.out.println("Qual o valor de saque? ");
		double valor = scanner.nextDouble();
		contaBancaria.sacar(valor);
		
		System.out.println("=========================");
		contaBancaria.mostrarSaldo();
	}

}
>>>>>>> beec1c5a7f0f8521b341166fca7e2e0625fc685a
