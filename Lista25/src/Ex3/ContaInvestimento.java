package Ex3;

public class ContaInvestimento extends Conta{
	
	public ContaInvestimento(double investimento) {
		super(investimento);
	}

	@Override
	public void calcularRendimento() {
		double rendimentoF = (investimento * 0.1) + investimento;
		System.out.println("Rendimento do Investimento: R$"+rendimentoF);
	}
}
