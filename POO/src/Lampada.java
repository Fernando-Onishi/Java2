
public class Lampada {
	boolean ligada;
	
	void acender(){
		ligada = true;
		System.out.println("A lampada está acesa");
	}
	
	void apagar() {
		ligada = false;
		System.out.println("A lampada está apagada");
	}
	
	void verificarStatus() {
		if(ligada) {
			System.out.println("A lâmpada está acesa");
		}else {
			System.out.println("A lampada está apagada");
		}
	}
}
