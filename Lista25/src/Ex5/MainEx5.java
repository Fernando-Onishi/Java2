package Ex5;

import java.util.Scanner;

public class MainEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PIX pix = new PIX();
		CartaoCredito cc = new CartaoCredito();
		Dinheiro din = new Dinheiro();
		
		System.out.println("Qual a forma de pagamento? \n1)PIX\n2)Cartão de Crédito\n3)Dinheiro");
		int escolha = sc.nextInt();
		
		switch(escolha) {
		case 1:
			pix.processarPagamento();
			break;
		case 2:
			cc.processarPagamento();
			break;
		case 3:
			din.processarPagamento();
		}
	}
}