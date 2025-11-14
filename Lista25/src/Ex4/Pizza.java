package Ex4;

public class Pizza extends Prato{
	
	public Pizza(double valor) {
		super(valor);
	}

	@Override
	public void calcularPreco(int quant) {
		System.out.println("Total a pagar: "+(valor * quant));
	}
}
