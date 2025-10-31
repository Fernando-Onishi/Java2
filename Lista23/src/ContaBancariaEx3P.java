import java.util.Scanner;

public class ContaBancariaEx3P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContaBancariaEx3 conta = new ContaBancariaEx3();
		
		System.out.println("---------------");
		System.out.println("Conta Bancária");
		System.out.println("---------------");
		
		System.out.print("Titular da conta: \nR:");
		String titular = scanner.next();
		conta.setTitular(titular);
		
		System.out.println("--------------------");
		
		System.out.println("1)Depositar | 2)Sacar");
		int resposta = scanner.nextInt();
			if(resposta == 1) {
			System.out.println("Você escolheu Depositar");
			System.out.println("--------------------");
			System.out.print("Quanto gostaria de Depositar?\nR:");
			double valor = scanner.nextDouble();
			conta.depositar(valor);
		}else {
			System.out.println("Você escolheu Sacar");
			System.out.println("--------------------");
			System.out.print("Quanto gostaria de sacar?\nR:");
			double valor = scanner.nextDouble();
			conta.sacar(valor);
		}
			System.out.print("Gostaria de ver seu saldo?\nR:");
			String resposta1 = scanner.next();
			if(resposta1.equalsIgnoreCase("Sim")) {
				conta.getSaldo();
				System.out.println("Titular: "+conta.getTitular()+"\nSaldo: "+conta.getSaldo());
			}else {
				System.out.println("Fecharemos em 3....2....1");
			}
			
			
	}
}
