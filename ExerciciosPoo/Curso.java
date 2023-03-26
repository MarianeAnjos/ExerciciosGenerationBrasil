package ExerciciosPoo;

public class Curso {
	
	String aluno;
	Double RA;
	String curso;
	String Semestre;
	int anoConclusao;
	
	public Curso(String aluno, Double rA, String curso, String semestre, int anoConclusao) {
		super();
		this.aluno = aluno;
		this.RA = rA;
		this.curso = curso;
		this.Semestre = semestre;
		this.anoConclusao = anoConclusao;
		
	}

	public void visualizar() {
		System.out.println("\nNome do aluno: "+aluno);
		System.out.println("RA do aluno: "+RA);
		System.out.println("Curso de graduação escolhido: "+curso);
		System.out.println("Semestre: "+Semestre);
		System.out.println("Ano previsto para a conclusão do curso: "+anoConclusao);
	}
	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public Double getRA() {
		return RA;
	}

	public void setRA(Double rA) {
		RA = rA;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSemestre() {
		return Semestre;
	}

	public void setSemestre(String semestre) {
		Semestre = semestre;
	}

	public int getAnoConclusao() {
		return anoConclusao;
	}

	public void setAnoConclusao(int anoConclusao) {
		this.anoConclusao = anoConclusao;
	}
	
	

}
