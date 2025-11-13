package Lista03;

public class Vendedor extends Funcionario{
	private int comissao = 500;

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	public void vender(){
		System.out.println("O vendedor realizou uma venda! e ganhou uma comissão");
	}
	
	public double calcularSalario() {
		return getSalarioBase() + comissao;
	}
	
	
	
}
