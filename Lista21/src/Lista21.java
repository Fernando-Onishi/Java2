import java.util.Scanner;

public class Lista21 {

	public static void main(String[] args) {
		//1
		int somar = somar(6 , 6);
		System.out.println("A soma é "+somar);
		separador();
		
		//2
		int diferenca = subtrair(9 , 4);
		System.out.println("A diferença é: "+diferenca);
		separador();
		
		//3
		int multiplicar = multiplicar(5 , 5);
		System.out.println("O produto é "+multiplicar);
		separador();
		
		//4
		int dividir = dividir(10 , 5);
		System.out.println("O quociente é "+dividir);
		separador();
		
		//5
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a nota1: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a nota2: ");
		double nota2 = scanner.nextDouble();
		double media = calcularMedia(nota1, nota2);
		System.out.println("Sua média é: "+media);
		separador();
		
		//6
		System.out.println("Digite a nota1: ");
		double nota3 = scanner.nextDouble();
		System.out.println("Digite a nota2: ");
		double nota4 = scanner.nextDouble();
		String resultado = verificarAprovacao(nota3, nota4);
		System.out.println("Seu resultado foi: "+resultado);
		separador();
		
		//7
		System.out.println("Digite um número: ");
		int num9 = scanner.nextInt();
		System.out.println("Digite outro número: ");
		int num10 = scanner.nextInt();
		int numero = maiorNumero(num9, num10);
		System.out.println(numero);
		separador();
		
		//8
		System.out.println("Digite a temperatura atual em Celsius e eu voltarei em Fahrenheit");
		double temp = scanner.nextDouble();
		double tempF = converterCelsiusParaFahrenheit(temp);
		System.out.println("A temperatura em Fahrenheit é: "+tempF+" °F");
		separador();
		
		//9
		System.out.print("Digite a base e a altura do retângulo que lhe direi a sua área \nBase:");
		double base = scanner.nextInt();
		System.out.print("Altura:");
		double altura = scanner.nextInt();
		double area = calcularAreaRetangulo(base, altura);
		System.out.println("A área do retângulo é: "+area);
		separador();
		
		//10
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		System.out.println(gerarMensagem(nome));
		separador();
		
		//11
		System.out.println("Digite seu nome: ");
		String nome1 = scanner.next();
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scanner.next();
		System.out.println(juntarNomes(nome, sobrenome));
		separador();
		
		//12
		System.out.println("Digite a idade:");
		int idade = scanner.nextInt();
		System.out.println(avaliarIdade(idade));
	}
	public static void separador() {
		System.out.println("------------------");
	}
	//1
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	//2
	public static int subtrair(int num3, int num4) {
		return num3 - num4;
	}
	
	//3
	public static int multiplicar(int num5, int num6) {
		return num5 * num6;
	}
	
	//4
	public static int dividir(int num7, int num8) {
		return num7 / num8;
	}
	
	//5
	public static double calcularMedia(double nota1, double nota2) {
		return (nota1 + nota2) / 2;
	}
	
	//6
	public static String verificarAprovacao(double nota3, double nota4) {
		double media = (nota3 + nota4) / 2;
		if(media >= 6) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}
	
	//7
	public static int maiorNumero(int num9, int num10) {
		if(num9 > num10) {
			return num9;
		}else if(num9 == num10){
			return 0;
		}else {
			return num10;
		}
	}
	
	//8
	public static double converterCelsiusParaFahrenheit(double temp) {
		double tempF = (temp * 9/5) + 32;
		return tempF;
	}
	
	//9
	public static double calcularAreaRetangulo(double base, double altura) {
		double area = base * altura; 
		return area;
	}
	
	//10
	public static String gerarMensagem(String nome) {
		return "Olá, "+ nome;
	}
	
	//11
	public static String juntarNomes(String nome1, String sobrenome) {
		return "Olá, "+nome1+" "+sobrenome;
	}
	
	//12
	public static String avaliarIdade(int idade) {
		if(idade < 12) {
			return "Criança";
		}else if(idade < 18){
			return "Adolescente";
		}else if(idade < 60){
			return "Adulto";
		}else{
			return "Idoso";
		}
	}
	
}
