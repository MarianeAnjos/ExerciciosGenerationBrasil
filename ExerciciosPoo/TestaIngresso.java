package ExerciciosPoo;

import java.sql.Date;

public class TestaIngresso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ingresso ingresso1 = new Ingresso("Mariane", 123.456, Date(), "Rihanna","Jundiaí - City");
		Ingresso ingresso2 = new Ingresso("Leona", 45.369, Date(), "Twenty One Pilots", "Jundiaí-City");
		
		ingresso1.visualizar();
		ingresso2.visualizar();
	
	
	Vip ingressoVip = new Vip("Raffa",123.654, Date(),"Lana Delray" , "São Paulo", 125);
	MeiaEntrada ingressoMeia = new MeiaEntrada("Noah", 789.564, Date(),"Power  Ranger", "Campinas", 10);
	
	ingressoVip.visualizar();
	ingressoMeia.visualizarMeia();
	
	}

	public static Date Date() {
		// TODO Auto-generated method stub
		return null;
	}

}
