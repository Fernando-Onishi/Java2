package herança;

public class Principal1 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Joana");
		a1.setIdade(16);
		a1.setCurso("Elétrica");

		Professor p1 = new Professor();
		p1.setNome("Márcia");
		p1.setIdade(35);
		p1.setSalario(3500);
		
		System.out.println("Dados do aluno");
		a1.mostrarDados();
		a1.estudar();
		System.out.println("Dados do Professor: ");
		p1.mostrarDados();
		p1.ensinar();
		
		
	}
}