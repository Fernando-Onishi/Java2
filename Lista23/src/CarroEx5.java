
public class CarroEx5 {
	private String modelo;
	private int ano;
	private int velocidadeAtual;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public void acelerar(int valor) {
		if(valor > 0) {
			velocidadeAtual += valor;
		}else {
			System.out.println("Valor Inválido! Digite números maiores que 0");
		}
	}
	
	public void frear(int valor) {
		if(valor < 0) {
			System.out.println("Valor Inválido! Digite números maiores que 0");
		}else {
			velocidadeAtual -= valor;
		}
	}
}

