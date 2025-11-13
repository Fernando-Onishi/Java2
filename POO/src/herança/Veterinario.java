package herança;

import java.util.Scanner;

public class Veterinario {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o nome do pet? ");
		String nome = scanner.next();
		System.out.println("Qual a raça do pet?");
		String raca = scanner.next();
		
		cachorro.setNome(nome);
		cachorro.setRaca(raca);
		System.out.println("Dados:");
		cachorro.infos();
		cachorro.dados();
		
		
		
	}

}