package Lista03;

public class Gerente extends Funcionario{
	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	void gerenciar() {
		System.out.println("O gerente está gerenciando o departamento: "+departamento);
	}

	public double calcularSalario() {
		return (getSalarioBase() * 0.2) + getSalarioBase();
	}
}
