<<<<<<< HEAD
import java.util.Scanner;

public class VideoGameP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VideoGame vg = new VideoGame();
		
		System.out.println("Qual a marca do Video Game?");
		vg.marca = scanner.next();
		
		System.out.println("=========================");
		
		System.out.println("Qual o modelo do Video Game?");
		vg.modelo = scanner.next();
		
		System.out.println("=========================");
		
		System.out.println("O Video Game está ligado? TRUE OU FALSE");
		vg.ligado = scanner.nextBoolean();
		
		System.out.println("=========================");
		
		vg.verificarStatus();
		
		System.out.println("=========================");
		
		vg.ligar();
		
		System.out.println("=========================");
		
		vg.desligar();
	}

}
=======
import java.util.Scanner;

public class VideoGameP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VideoGame vg = new VideoGame();
		
		System.out.println("Qual a marca do Video Game?");
		vg.marca = scanner.next();
		
		System.out.println("=========================");
		
		System.out.println("Qual o modelo do Video Game?");
		vg.modelo = scanner.next();
		
		System.out.println("=========================");
		
		System.out.println("O Video Game está ligado? TRUE OU FALSE");
		vg.ligado = scanner.nextBoolean();
		
		System.out.println("=========================");
		
		vg.verificarStatus();
		
		System.out.println("=========================");
		
		vg.ligar();
		
		System.out.println("=========================");
		
		vg.desligar();
	}

}
>>>>>>> beec1c5a7f0f8521b341166fca7e2e0625fc685a
