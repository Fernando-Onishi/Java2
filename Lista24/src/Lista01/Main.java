package Lista01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Animal animal = new Animal();
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
		
		System.out.println("Qual o nome do seu animal? ");
		String nome = scanner.next();
		animal.setNome(nome);
		
		System.out.println("Qual a idade do seu animal? ");
		int idade = scanner.nextInt();
		animal.setIdade(idade);
		
		System.out.println("Cachorro ou gato? ");
		String tipo = scanner.next();
		if(tipo.equalsIgnoreCase("Cachorro")) {
			System.out.println("Qual a raça do cachorro?");
			String raca = scanner.next();
			dog.setRaca(raca);
			dog.abanarRabo();
		}else if(tipo.equalsIgnoreCase("Gato")) {
			System.out.println("Qual a cor do gato?");
			String cor = scanner.next();
			cat.setCor(cor);
			cat.subirnoMuro();
		}
		
		animal.mostrarInfo();
		
	}

}
