package Lista04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Livro l = new Livro();
		Filme f = new Filme();
		
		System.out.println("Filme ou Livro? ");
		String opcao = scanner.next();
		if(opcao.equalsIgnoreCase("Filme")) {
			System.out.println("------");
			System.out.println("Filme");
			System.out.println("------");
			System.out.println("Nome: ");
			String nome = scanner.next();
			f.setNome(nome);
			
			System.out.println("Preço: ");
			int preco = scanner.nextInt();
			f.setPreco(preco);
			
			System.out.println("Autor: ");
			String diretor = scanner.next();
			f.setDiretor(diretor);
			
			f.assistir();
			f.mostrarInfo();
		}else if(opcao.equalsIgnoreCase("Livro")) {
			
		System.out.println("Livro");
		System.out.println("Nome: ");
		String nome1 = scanner.next();
		l.setNome(nome1);
		
		System.out.println("Preço: ");
		int preco1 = scanner.nextInt();
		l.setPreco(preco1);
		
		System.out.println("Autor: ");
		String autor = scanner.next();
		l.setAutor(autor);
		
		l.mostrarInfo();
		l.lerTrecho();
		}
	}

}
