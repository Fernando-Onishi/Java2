import java.util.Scanner;

public class MusicaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Musica musc1 = new Musica();	
		Musica musc2 = new Musica();
		Musica musc3 = new Musica();
		
		System.out.println("Qual o titulo da música 1?");
		musc1.titulo = scanner.next();
		
		System.out.println("Qual o titulo da música 2?");
		musc2.titulo = scanner.next();
		
		System.out.println("Qual o titulo da música 3?");
		musc3.titulo = scanner.next();
		
		System.out.println("=========================");
		
		System.out.println("Qual o artista da música 1?");
		musc1.artista = scanner.next();
		
		System.out.println("Qual o artista da música 2?");
		musc2.artista = scanner.next();
		
		System.out.println("Qual o artista da música 3?");
		musc3.artista = scanner.next();
		
		System.out.println("=========================");
		
		System.out.println("Qual o duração da música 1?");
		musc1.duracao = scanner.nextDouble();	
		
		System.out.println("Qual o duração da música 2?");
		musc2.duracao = scanner.nextDouble();
		
		System.out.println("Qual o duração da música 3?");
		musc3.duracao = scanner.nextDouble();
		
		System.out.println("=========================");
		musc1.tocar();
		musc2.tocar();
		musc3.tocar();
		
		System.out.println("=========================");
		
		musc1.pausar();
		musc2.pausar();
		musc3.pausar();
		
		System.out.println("=========================");
		
		musc1.mostrarDetalhes();
		musc2.mostrarDetalhes();
		musc3.mostrarDetalhes();
	}
}
