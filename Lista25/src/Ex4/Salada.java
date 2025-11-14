package Ex4;

public class Salada extends Prato{
	
	public Salada(double valor) {
		super(valor);
	}

	@Override
	public void calcularPreco(int quant) {
		System.out.println("Total a pagar: "+(valor * quant));
	}
	
}
