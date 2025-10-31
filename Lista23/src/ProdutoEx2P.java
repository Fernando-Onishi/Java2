import java.util.Scanner;

public class ProdutoEx2P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ProdutoEx2 produto = new ProdutoEx2();
		
		System.out.println("----------");
		System.out.println("Produtos");
		System.out.println("----------");
		
		System.out.println("1)Coca-Cola 2l.............R$12,00");
		System.out.println("2)It 2l.............R$999,99");
		System.out.println("3)Guaraná 2l.............R$9,99");
		System.out.println("4)Sprite 2l.............R$7,00");
		System.out.println("5)Fanta 2l.............R$8,50");
		
		System.out.println("--------------------");
		System.out.print("Qual será o pedido? \nR:");
		String nome = scanner.next();
		
		System.out.println("--------------------");
		System.out.print("Qual o Preço do produto? \nR:");
		double preco = scanner.nextDouble();
		
		System.out.println("--------------------");
		System.out.print("Qual o Estoque do produto? \nR:");
		int estoque = scanner.nextInt();
		System.out.println("--------------------");
		System.out.println("Resultado");
		System.out.println("--------------------");
		
		produto.setNome(nome);
		produto.setPreco(preco);
		produto.setEstoque(estoque);
		
		System.out.println("Produto: "+produto.getNome()+"\nPreço: "+produto.getPreco()+"\nEstoque: "+produto.getEstoque());
		
	}
}