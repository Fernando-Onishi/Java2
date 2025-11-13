
public class AvaliacaoEx4 {
	private String nome;
	private double nota1;
	private double nota2;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		if(nota1 < 0 || nota1 > 10) {
			System.out.println("Valor Inválido! Digite valores maiores que 0 ou menores que 10");
		}else {
		this.nota1 = nota1;
		}
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		if(nota2 < 0 || nota2 > 10) {
			System.out.println("Valor Inválido! Digite valores maiores que 0 ou menores que 10");
		}else {
		this.nota2 = nota2;
		}
	}
	
	public double media() {
			return (nota1 + nota2) / 2;
	}
	
	
}
