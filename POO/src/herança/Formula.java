package herança;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		Retangulo ret = new Retangulo();
		ret.setAltura(5);
		ret.setLargura(3);
		System.out.println(ret.calcularArea());
		
		double largura, altura;
		System.out.println("Qual a largura? ");
		largura = scanner.nextDouble();
		System.out.println("Qual a altura?");
		altura = scanner.nextDouble();
		ret.setAltura(altura);
		ret.setLargura(largura);
		System.out.println(ret.calcularArea());
		System.out.println(ret.calcularPerimetro());
	}
	

}
