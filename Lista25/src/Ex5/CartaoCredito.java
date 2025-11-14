package Ex5;

public class CartaoCredito extends Pagamento{
	
	@Override
	public void processarPagamento() {
		System.out.println("Pagamento Via Cartão de Crédito concluído");
	}
}
