package Ex4;

import java.util.Scanner;

public class MainEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza p = new Pizza(55.00);
		Lasanha l = new Lasanha(60.00);
		Salada s = new Salada(35.00);
		System.out.println("Qual a escolha: \n"
				+ "1)Lasanha...60,00"
				+ "\n2)Pizza...R$55,00"
				+ "\n3)Salada...35.00");
		int escolha = sc.nextInt();
		System.out.println("Quantidade: ");
		int quant = sc.nextInt();
		switch(escolha) {
		case 1: 
			System.out.println("Escolha Realizada...Lasanha");
			l.calcularPreco(quant);
			break;
		case 3:
			System.out.println("Escolha Realizada...Salada");
			s.calcularPreco(quant);
			break;
		case 2:
			System.out.println("Escolha Realizada...Pizza");
			p.calcularPreco(quant);
			break;
		}

	}
}
