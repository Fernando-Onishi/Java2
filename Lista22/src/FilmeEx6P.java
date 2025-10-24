import java.util.Scanner;

public class FilmeEx6P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FilmeEx6 filme1 = new FilmeEx6();
		
		System.out.println("Jurassic World..........Ação/Ficção");
		System.out.println("Telefone Preto..........Terror/Suspense");
		System.out.println("Demon Slayer..........Anime");
		
		System.out.println("Qual o filme desejado? ");
		filme1.titulo = scanner.next();
		
		System.out.println("Qual o gênero do filme?");
		filme1.genero = scanner.next();
		
		System.out.println("Qual a duração do filme?");
		filme1.duracao = scanner.nextDouble();
		
		System.out.println("=========================");
		
		filme1.assistir();
		filme1.mostrarInformacoes();

	}

}
