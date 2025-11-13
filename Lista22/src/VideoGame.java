<<<<<<< HEAD

public class VideoGame {
	String marca;
	String modelo;
	boolean ligado;
	
	void ligar() {
		ligado = true;
		System.out.println("O console está ligado");
	}
	
	void desligar() {
		ligado = false;
		System.out.println("O console foi desligado");
	}
	
	void verificarStatus(){
		if(ligado) {
			System.out.println("O console foi ligado");
		}else{
			System.out.println("O console está desligado");
		}
	}
	
}
=======

public class VideoGame {
	String marca;
	String modelo;
	boolean ligado;
	
	void ligar() {
		ligado = true;
		System.out.println("O console está ligado");
	}
	
	void desligar() {
		ligado = false;
		System.out.println("O console foi desligado");
	}
	
	void verificarStatus(){
		if(ligado) {
			System.out.println("O console foi ligado");
		}else{
			System.out.println("O console está desligado");
		}
	}
	
}
>>>>>>> beec1c5a7f0f8521b341166fca7e2e0625fc685a
