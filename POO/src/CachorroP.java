import java.util.Scanner;

public class CachorroP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cachorro dog = new Cachorro();
		dog.nome = "Bob";
		dog.idade = 10;
		dog.latir();
		
		Cachorro cachorro = new Cachorro();
		System.out.println("Qual o nome do pet?");
		cachorro.nome = scanner.next();
		System.out.println("Qual a idade?");
		cachorro.idade = scanner.nextInt();
		
		cachorro.latir();
	}
}
