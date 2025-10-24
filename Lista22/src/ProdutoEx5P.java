import java.util.Scanner;

public class ProdutoEx5P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ProdutoEx5 produtos = new ProdutoEx5();
		ProdutoEx5 produtos1 = new ProdutoEx5();
		
//		Produtos
		System.out.println("1)Coca-Cola 2L..............R$8.99");
		System.out.println("2)Fanta 2L ZERO-AÇUCAR..............R$10.99");
		System.out.println("3)Guaraná 600ml..............R$6.50");
		System.out.println("4)Pepsi Lata 350ml..............R$3.00");
		
		System.out.println("Qual a primeira escolha?");
		produtos.nome = scanner.next();
		
		
		System.out.println("Qual a segunda escolha?");
		produtos1.nome = scanner.next();
		
		System.out.println("=========================");
		
		System.out.println("Qual o preco do produto 1? ");
		produtos.preco = scanner.nextDouble();
		
		System.out.println("Qual o preco do produto 2? ");
		produtos1.preco = scanner.nextDouble();
		
		System.out.println("=========================");
		
		System.out.println("Qual a quantidade desejada do produto 1? ");
		produtos.estoque = scanner.nextDouble();
		
		System.out.println("Qual a quantidade desejada do produto 2? ");
		produtos1.estoque = scanner.nextDouble();
		
		System.out.println("=========================");
		
		produtos.vender(12);
		produtos1.vender(10);
		
		System.out.println("=========================");
		
		produtos.mostrarInformacoes();
		produtos1.mostrarInformacoes();
	}
}
