package ExerciciosPoo;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Mariane","123.456.789-89","FullStack Java","Back-end", 1997);
		Funcionario funcionario2 = new Funcionario("Leona", "345.789.456-99", "Cão suporte de emocional","Dar amor e carinho", 2021);
		
		funcionario1.visualizar();
		funcionario2.visualizar();
	}

}
