public class Pizza {
	String sabor;
	String tamanho;
	boolean BordaRecheada;
	
	void preparar() {
		System.out.println("Preparando pizza de "+sabor);
	}
	
	void assando() {
		System.out.println("Assando pizza tamanho "+tamanho);
	}
	
	void mostrarInformacoes() {
		if(BordaRecheada == true) {
		System.out.println("Sabor: "+sabor+"\nTamanho: "+tamanho+"\nBorda Recheada: Sim");
			}else {
				System.out.println("Sabor: "+sabor+"\nTamanho: "+tamanho+"\nBorda Recheada: Não");
		}
	}
	
}
