package Ex1;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pao p1 = new Pao();
		Bolo b1 = new Bolo();
		Torta t1 = new Torta();
		ProdutoPadaria p = new ProdutoPadaria();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Somos da Padaria BigFat, qual sua escolha?");
		System.out.println("Pão........R$0.50/uni");
		System.out.println("Torta........R$7.99");
		System.out.println("Bolo........R$10.00");
		String resposta = sc.next();
		if(resposta.equalsIgnoreCase("Pão")) {
			System.out.println("Escolha Realizada!");
			p1.preparar();
		}else if(resposta.equalsIgnoreCase("Torta")) {
			System.out.println("Escolha Realizada!");
			t1.preparar();
		}else if(resposta.equalsIgnoreCase("Bolo")) {
			System.out.println("Escolha Realizada!");
			b1.preparar();
		}
		
		System.out.println("-------------------");
		p.preparar();
	}

}
