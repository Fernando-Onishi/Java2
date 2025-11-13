
public class Exercicio1 {
	String nome;
	String raca;
	int idade;
	
	void miar() {
		System.out.println("Miau!");
	}
	
	void comer() {
		System.out.println(nome+", está comendo");
	}
	
	void mostrarInformacoes() {
		if(idade == 1) {
			System.out.println(nome+" é da raça "+raca+" e tem "+idade+" ano..");
		}else {
			System.out.println(nome+" é da raça "+raca+" e tem "+idade+" anos..");
		}
	}
	
}
