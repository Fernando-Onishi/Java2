package Ex2;

import java.util.Scanner;

public class MainEx2 {

	public static void main(String[] args) {
		Guerreiro g = new Guerreiro();
		Mago m = new Mago();
		Curandeiro c = new Curandeiro();
		Personagem p = new Personagem();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um dos personagens a seguir:\n1)Guerreiro\n2)Mago\n3)Curandeiro");
		int personagem = sc.nextInt();
		
		switch(personagem) {
		case 1:
			g.realizarAcao();
			break;
		case 2:
			m.realizarAcao();
			break;
		case 3: 
			c.realizarAcao();
			break;
		}
		
		System.out.println("------------------");
		p.realizarAcao();
	}

}
