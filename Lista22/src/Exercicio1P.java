<<<<<<< HEAD
import java.util.Scanner;

public class Exercicio1P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Exercicio1 gato = new Exercicio1();
		Exercicio1 gato1 = new Exercicio1();
		
		System.out.println("Qual o nome dos gatos \nR:");
		gato.nome = scanner.next();
		gato1.nome = scanner.next();
		
		System.out.println("=========================");
		System.out.println("Qual a raça dos gatos? \nR:");
		gato.raca = scanner.next();
		gato1.raca = scanner.next();
		
		System.out.println("=========================");
		System.out.println("Qual a idade dos gatos? \nR:");
		gato.idade = scanner.nextInt();
		gato1.idade = scanner.nextInt();
		
		System.out.println("=========================");
		
		gato.miar();
		gato1.miar();
		
		System.out.println("=========================");
		
		gato.comer();
		gato1.comer();
		
		System.out.println("=========================");
		gato.mostrarInformacoes();
		gato1.mostrarInformacoes();
		
	}

}
=======
import java.util.Scanner;

public class Exercicio1P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Exercicio1 gato = new Exercicio1();
		Exercicio1 gato1 = new Exercicio1();
		
		System.out.println("Qual o nome dos gatos \nR:");
		gato.nome = scanner.next();
		gato1.nome = scanner.next();
		
		System.out.println("=========================");
		System.out.println("Qual a raça dos gatos? \nR:");
		gato.raca = scanner.next();
		gato1.raca = scanner.next();
		
		System.out.println("=========================");
		System.out.println("Qual a idade dos gatos? \nR:");
		gato.idade = scanner.nextInt();
		gato1.idade = scanner.nextInt();
		
		System.out.println("=========================");
		
		gato.miar();
		gato1.miar();
		
		System.out.println("=========================");
		
		gato.comer();
		gato1.comer();
		
		System.out.println("=========================");
		gato.mostrarInformacoes();
		gato1.mostrarInformacoes();
		
	}

}
>>>>>>> beec1c5a7f0f8521b341166fca7e2e0625fc685a
