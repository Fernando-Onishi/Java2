package Ex3;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(double investimento) {
		super(investimento);
	}

	@Override
	public void calcularRendimento() {
		double rendimentoF = (investimento * 0.05) + investimento;
		System.out.println("Rendimento da Poupança: R$"+rendimentoF);
	}
}