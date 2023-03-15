package PacoteJava;
import java.util.Scanner;
// teste git
public class Calculadora2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double valor1 , valor2 , valor3; 
			int cont;
			
			System.out.println("Informe o primeiro valor:");
			valor1 = scan.nextDouble();
			
			System.out.println("informe o segundo valor");
			valor2 = scan.nextDouble();
			
			System.out.println("informe o que deseja fazr");
			System.out.println(" 1 - Soma ");
			System.out.println(" 2 - Subtração");
			System.out.println(" 3 - Multiplicação");
			System.out.println(" 4 - divisão");
			cont = scan.nextInt();
			
			switch (cont) {
			case 1 :
				valor3 = valor1 + valor2;
				System.out.println(valor1 +" + "+ valor2 + " = " + valor3);
			break;
			
			case 2 :
				valor3 = valor1-valor2;
				System.out.println(valor1 + " - " + valor2 + "=" + valor3);
			break;
			
			case 3 : 
				valor3 = valor1*valor2;
				System.out.println(valor1 + " * " + valor2 + " = "+valor3);
			break;
			
			case 4 :
				valor3 = valor1/valor2;
				System.out.println(valor1+ " / "+ valor2 + " = " + valor3);
				
				break;
				
			default : 
				System.out.println("/n Opção invalida");
				
			}
		}
		
		
	}

}
