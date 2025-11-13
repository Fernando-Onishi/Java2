package Lista01;

public class Cachorro extends Animal{
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	void abanarRabo() {
		System.out.println("Cachorro da raça "+raca+" está abanando o rabo");
	}
	
	
}	
