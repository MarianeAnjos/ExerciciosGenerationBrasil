package ExerciciosPoo;

public class TestaGame {

	public static void main(String[] args) {
		Produto estoque1 = new Produto("Playstation 5 ", 35.40 , "Orizon Zero Down e God of war ", " Pc e console", "Azul");
		Produto estoque2 = new Produto("Xbox",25.2, "Call of Duty", "Console", "Xadrez");
		
		estoque1.visualizar();
		estoque2.visualizar();
	}

}
