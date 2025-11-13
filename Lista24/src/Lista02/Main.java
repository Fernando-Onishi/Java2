package Lista02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Carro c = new Carro();
		
		System.out.println("Marca do carro: ");
		String marca = scanner.next();
		c.setMarca(marca);
		
		System.out.println("Ano do carro: ");
		int ano = scanner.nextInt();
		c.setAno(ano);
		
		System.out.println("Quantas portas o carro tem? ");
		int portas = scanner.nextInt();
		c.setPortas(portas);
		c.abrirPortaMalas();
		
		c.exibirInfo();
	}
}
