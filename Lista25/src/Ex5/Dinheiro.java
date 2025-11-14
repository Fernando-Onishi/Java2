package Ex5;

public class Dinheiro extends Pagamento{
	@Override
	public void processarPagamento() {
		System.out.println("Pagamento Via Dinheiro concluído");
	}
}
