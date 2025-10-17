import java.util.Scanner;

public class Lista20 {

	public static void main(String[] args) {
//		Sem Parâmetro
		saudacao();
		separador();	//Separa os Exercícios
		retangulo();
		separador();
		multiplos();
		separador();
		contagem();
		separador(); 
		meses();
		separador();
		//Com Parâmetro
		
		//1
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número e direi se ele é divisível por 5: \nR:");
		int num = scanner.nextInt();
		divisibilidade(num);
		separador();
		
		//2
		System.out.print("Digite seu nome: ");
		String nome = scanner.next();
		despedida(nome);
		separador();
		
		//3
		System.out.print("Digite seu nome: \nR:");
		String nome1 = scanner.next();
		System.out.print("Agora digite seu sobrenome \nR:");
		String sobrenome = scanner.next();
		nomes(nome1, sobrenome);
		separador();
		
		//4
		System.out.print("Digite um número e lhe direi se é maior que 100 \nR:");
		int num1 = scanner.nextInt();
		maior(num1);
		separador();
		
		//5
		System.out.print("Digite a velocidade \nR:");
		double velocidade = scanner.nextDouble();
		velocidade(velocidade);
		separador();
		
		//6
		System.out.print("Qual o dia da semana? \nR:");
		String dia = scanner.next();
		saudacao(dia);
		separador();
		
		//7
		System.out.print("Digite a quantidade de itens em estoque \nR:");
		int quant = scanner.nextInt();
		estoque(quant);
		separador();
	}
	
	//Separador
	public static void separador() {
		System.out.println("------------------");
		
		//Função Sem Parâmetro
	}
	//1
	public static void saudacao() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Bom dia!");
		}
	}
		
	//2
	public static void retangulo() {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 5; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
		
	//3
	public static void multiplos() {
		for(int i = 5; i <= 25; i+=5) {
			System.out.println(i);
		}
	}
	
	//4
	public static void contagem() {
		for(int i = 1; i <= 8; i++) {
			System.out.println(i);
		}
		System.out.println("Pronto!");
	}
	
	//5
	public static void meses() {
		String meses = "Janeiro\n" + "Fevereiro\n" + "Março\n" + "Abril\n" + "Maio\n" + "Junho\n";
		System.out.println(meses);
		}
	
	//Função com Parâmetro
	
	//1
	public static void divisibilidade(int num) {
		if(num % 5 == 0){
			System.out.println("É divisível");
		}else {
			System.out.println("Não é divisível");
		}
	}
	
	//2
	public static void despedida(String nome) {
		System.out.println("Até logo, "+nome+"!");
	}
	
	//3
	public static void nomes(String nome1, String sobrenome) {
		System.out.println("Olá "+nome1+" "+sobrenome);
	}
	
	//4
	public static void maior(int num1) {
		if(num1 > 100) {
			System.out.println("Maior que 100");
		}else {
			System.out.println("Menor que 100");
		}
	}
	
	//5
	public static void velocidade(double velocidade) {
		if(velocidade < 40) {
			System.out.println("Lenta");
		}else if(velocidade > 40 && velocidade < 80) {
			System.out.println("Normal");
		}else{
			System.out.println("Rápida");
		}
	}
	
	//6
	public static void saudacao(String dia) {
		if(dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Tenha uma ótima Segunda-Feira!");
		}else if(dia.equalsIgnoreCase("Terça")) {
			System.out.println("Tenha uma ótima Terça-Feira!");
		}else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Tenha uma ótima Quarta-Feira!");
		}else if(dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Tenha uma ótima Quinta-Feira!");
		}else if(dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Tenha uma ótima Sexta-Feira!");
		}else if(dia.equalsIgnoreCase("Sabado")) {
			System.out.println("Tenha um ótimo Sábado!");
		}else if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Tenha um ótimo Domingo!");
		}
	}
	
	//7
	public static void estoque(int quant) {
		if(quant >= 10) {
			System.out.println("Estoque Suficiente");
		}else if(quant >10) {
			System.out.println("Estoque Crítico ):");
		}else if(quant >5 && quant <10) {
			System.out.println("Estoque Baixo |:");
		}
	}
	

}