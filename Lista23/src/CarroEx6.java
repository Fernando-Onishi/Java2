<<<<<<< HEAD
import java.util.Scanner;

public class CarroEx6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarroEx5 carro = new CarroEx5();
		
		System.out.print("Modelo do carro: ");
		String modelo = scanner.next();
		carro.setModelo(modelo);
		
		System.out.print("Ano: ");
		int ano = scanner.nextInt();
        carro.setAno(ano);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade inicial: " + carro.getVelocidadeAtual() + " km/h");

        System.out.println("Acelerar ou Frear? ");
        String resposta = scanner.next();
        if(resposta.equalsIgnoreCase("Acelerar")) {
        	System.out.print("Acelerar quanto: ");
        	int velocidade = scanner.nextInt();
        	carro.acelerar(velocidade);
        System.out.println("Após acelerar: " + carro.getVelocidadeAtual() + " km/h");
        }else {
        	System.out.println("Frear quanto: ");
        	int velocidade = scanner.nextInt();
        	carro.frear(velocidade);
        System.out.println("Após frear: " + carro.getVelocidadeAtual() + " km/h");
        }
        
        
        
        

	}
}
=======
import java.util.Scanner;

public class CarroEx6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarroEx5 carro = new CarroEx5();
		
		System.out.print("Modelo do carro: ");
		String modelo = scanner.next();
		carro.setModelo(modelo);
		
		System.out.print("Ano: ");
		int ano = scanner.nextInt();
        carro.setAno(ano);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade inicial: " + carro.getVelocidadeAtual() + " km/h");

        System.out.println("Acelerar ou Frear? ");
        String resposta = scanner.next();
        if(resposta.equalsIgnoreCase("Acelerar")) {
        	System.out.print("Acelerar quanto: ");
        	int velocidade = scanner.nextInt();
        	carro.acelerar(velocidade);
        System.out.println("Após acelerar: " + carro.getVelocidadeAtual() + " km/h");
        }else {
        	System.out.println("Frear quanto: ");
        	int velocidade = scanner.nextInt();
        	carro.frear(velocidade);
        System.out.println("Após frear: " + carro.getVelocidadeAtual() + " km/h");
        }
        
        
        
        

	}
}
>>>>>>> beec1c5a7f0f8521b341166fca7e2e0625fc685a
