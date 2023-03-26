package ExerciciosPoo;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso aluno1 = new Curso("Leona", 12345895.55, "veterinaria", "Terceiro semestre", 2026);
		Curso aluno2 = new Curso("Mariane", 123569577.55,"Ciências da computação","Segundo semestre", 2027);
		
		aluno1.visualizar();
		aluno2.visualizar();
	}

}
