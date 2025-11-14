package Ex3;

public class Conta {
	protected double investimento;
	
	public Conta(double investimento) {
        this.investimento = investimento;
    }
	
	public void calcularRendimento() {
		System.out.println("O rendimento está sendo calculado...");
	}
	
}
