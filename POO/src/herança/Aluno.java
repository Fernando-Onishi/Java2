package herança;

public class Aluno extends Pessoa{
	
	private String curso;
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void estudar() {
		System.out.println(getNome()+" Faz o curso: " + curso);
	}
	
}
