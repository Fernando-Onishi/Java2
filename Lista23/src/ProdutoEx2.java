<<<<<<< HEAD

public class ProdutoEx2 {
	
	private String nome;
	private double preco;
	private int estoque;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		}else {
			System.out.println("Valor Inválido! Digite Números maiores que 0");
		}
		
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		if(estoque < 0) {
			System.out.println("Estoque Insuficiente!");
		}else {
		this.estoque = estoque;	
		}
	}
	
	
=======

public class ProdutoEx2 {
	
	private String nome;
	private double preco;
	private int estoque;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		}else {
			System.out.println("Valor Inválido! Digite Números maiores que 0");
		}
		
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		if(estoque < 0) {
			System.out.println("Estoque Insuficiente!");
		}else {
		this.estoque = estoque;	
		}
	}
	
	
>>>>>>> beec1c5a7f0f8521b341166fca7e2e0625fc685a
}