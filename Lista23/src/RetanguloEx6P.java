<<<<<<< HEAD
import java.util.Scanner;

public class RetanguloEx6P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		RetanguloEx6 retangulo = new RetanguloEx6();
		
		System.out.print("Altura do Retângulo: ");
		int altura = scanner.nextInt();
		retangulo.setAltura(altura);
		
		System.out.print("Largura do Retângulo: ");
		int largura = scanner.nextInt();
		retangulo.setLargura(largura);

        System.out.println("---------------------------");
        
        System.out.println("1)Perímetro | 2)Área");
        int resposta = scanner.nextInt();
        if(resposta == 1) {
        	System.out.println("Escolheu Perímetro");
        	System.out.print("Resultado: "+retangulo.calcularPerimetro());
        }else {
        	System.out.println("Escolheu Área");
        	System.out.println("Resultado: "+retangulo.calcularArea());
        }
	}
}
=======
import java.util.Scanner;

public class RetanguloEx6P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		RetanguloEx6 retangulo = new RetanguloEx6();
		
		System.out.print("Altura do Retângulo: ");
		int altura = scanner.nextInt();
		retangulo.setAltura(altura);
		
		System.out.print("Largura do Retângulo: ");
		int largura = scanner.nextInt();
		retangulo.setLargura(largura);

        System.out.println("---------------------------");
        
        System.out.println("1)Perímetro | 2)Área");
        int resposta = scanner.nextInt();
        if(resposta == 1) {
        	System.out.println("Escolheu Perímetro");
        	System.out.print("Resultado: "+retangulo.calcularPerimetro());
        }else {
        	System.out.println("Escolheu Área");
        	System.out.println("Resultado: "+retangulo.calcularArea());
        }
	}
}
>>>>>>> beec1c5a7f0f8521b341166fca7e2e0625fc685a
