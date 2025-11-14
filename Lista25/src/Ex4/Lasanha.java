package Ex4;

public class Lasanha extends Prato{
	
	public Lasanha(double valor) {
		super(valor);
	}

	@Override
	public void calcularPreco(int quant) {
		System.out.println("Total a pagar: "+(valor * quant));
	}
}
