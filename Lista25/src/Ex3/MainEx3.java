package Ex3;

import java.util.Scanner;

public class MainEx3 {

	public static void main(String[] args) {
		ContaPoupanca poupanca = new ContaPoupanca(500);
		ContaInvestimento invest = new ContaInvestimento(1000);
		Conta c = new Conta(200);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Método: \n1)Poupança\n2)Investimento");
		int resposta = sc.nextInt();
		c.calcularRendimento();
		switch(resposta) {
		case 1:
			poupanca.calcularRendimento();
			break;
		case 2:
			invest.calcularRendimento();
			break;
		}
		

	}

}
