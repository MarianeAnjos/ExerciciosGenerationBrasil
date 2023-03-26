package ExerciciosPoo;

public class TestaFarmacia {

	public static void main(String[] args) {
		Farmacia estoque1 = new Farmacia("Nimesulida", "Shampoos", "Bepantol derma", "Mascaras", "Gatorade");
		Farmacia estoque2 = new Farmacia ("Resfenol", "Condicionadores", "Fraldas","Alcool gel", "Bebida proteica");
		
		estoque1.visualizar();
		estoque2.visualizar();
	}
}
