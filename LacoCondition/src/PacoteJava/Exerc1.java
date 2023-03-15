package PacoteJava;
import java.util.Scanner;

/* Faça um algoritmo em Java que leia 3 valores inteiros A, B e C 
 * e imprima na tela se a soma de A + B é maior,  menor ou igual a C.*/

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A , B , C , soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com o primeiro valor inteiro" );
		A = leia.nextInt();
		
		System.out.println("\n Entre com o segundo valor inteiro");
		B = leia.nextInt();
		
		System.out.print("\n Entre com o terceiro valor inteiro");
		C = leia.nextInt();
		
		soma = A + B ;
		
		if(soma > C){
			System.out.println("\n A Soma é maior");
			}
		
		else if (soma < C){
			System.out.println("\n A Soma é menor ");
			}
		
		else {
			System.out.println("\n A soma é igual ao valor");
		}
		
	}

	
	
}
