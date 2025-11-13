package Lista03;

public class Funcionario {
	private String nome;
	private double SalarioBase = 500;
	private double calcularSalario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalarioBase() {
		return SalarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}
	
	public double getCalcularSalario() {
		return calcularSalario;
	}
	public void setCalcularSalario(double calcularSalario) {
		this.calcularSalario = calcularSalario;
	}
	
	void exibirInfo() {
		System.out.println("Nome: "+nome+"\nSalário: R$"+calcularSalario);
	}
	
	
}
