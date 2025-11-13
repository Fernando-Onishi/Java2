import java.util.Scanner;

public class PizzaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			Pizza pizza = new Pizza();
			Pizza pizza2 = new Pizza();
			
			System.out.println("======================================");
	        System.out.println("      Bem-vindo à Pizzaria        ");
	        System.out.println("    Temos uma promoção especial!                 ");
	        System.out.println("======================================");
	        System.out.println("Leve 2 e PAGUE 1");
	        
	        System.out.println("=========================");
			System.out.println("Qual o sabor da pizza 1?");
			pizza.sabor = scanner.next();

			System.out.println("Qual o sabor da pizza 2?");
			pizza2.sabor = scanner.next();
			System.out.println("=========================");
			System.out.println("Qual o tamanho da pizza 1?");
			pizza.tamanho = scanner.next();
			
			System.out.println("Qual o tamanho da pizza 2?");
			pizza2.tamanho = scanner.next();
			System.out.println("=========================");
			
			System.out.println("Vai querer borda recheada? (TRUE ou FALSE)");
			pizza.BordaRecheada = scanner.nextBoolean();
			pizza2.BordaRecheada = scanner.nextBoolean();
			
			System.out.println("=========================");
			pizza.preparar();
			pizza2.preparar();
			
			System.out.println("=========================");
			pizza.assando();
			pizza2.assando();
			
			System.out.println("=========================");
			pizza.mostrarInformacoes();
			pizza2.mostrarInformacoes();
	}

}
