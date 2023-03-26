package ExerciciosPoo;

import java.sql.Date;

public class TestaCliente {


	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente( "Mariane", "123.456.789-36", Date(), "(19)9999999", "Rua Generation BR"); 
		Cliente cliente2 = new Cliente("Leona", "321.456.987-32", Date(), "(11)8888888", "Rua Brasil Generation");
		
		cliente1.visualizar();
		cliente2.visualizar();
		
	}

	public static Date Date() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
