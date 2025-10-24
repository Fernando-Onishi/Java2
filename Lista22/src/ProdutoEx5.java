
public class ProdutoEx5 {
	String nome;
	double preco;
	double estoque;
	
	void vender(int quantidade){
		if(estoque <= quantidade) {
			System.out.println("Estoque Suficiente");
		}else {
			System.out.println("Estoque Insuficiente!");
		}
	}
	void mostrarInformacoes() {
		System.out.println("Produto: "+nome+"\nPreço: "+preco+"\nEstoque: "+estoque);
	}
}
