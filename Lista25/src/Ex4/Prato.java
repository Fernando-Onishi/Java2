package Ex4;

public class Prato {
	protected double valor;
	protected int quant;
	double valorF;
	
	public Prato(double valor) {
        this.valor = valor;
    }

	public void calcularPreco(int quant) {
		valorF = valor * quant;
		System.out.println("Total: R$" + valorF);
	}
	
}
