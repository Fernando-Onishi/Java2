package herança;

public class Pet {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void infos() {
		System.out.println("O nome do pet é "+nome);
	}
	
}