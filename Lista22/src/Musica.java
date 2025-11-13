
public class Musica {
	String titulo;
	String artista;
	double duracao;
	
	void tocar() {
		System.out.println("Tocando "+titulo+" de "+artista);
	}
	
	void pausar() {
		System.out.println(titulo+" está pausada");
	}
	
	void mostrarDetalhes() {
		System.out.println("Música escolhida: "+titulo+"\nArtista: "+artista+"Duração: "+duracao);
	}
}
