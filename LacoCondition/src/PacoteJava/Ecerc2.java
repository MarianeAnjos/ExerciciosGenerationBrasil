package PacoteJava;
import java.util.Scanner;

/* Escreva um algoritmo em Java, que leia um número inteiro via teclado
 *  e mostre na tela uma mensagem indicando
 *  se este número é par ou ímpar e se o número é positivo ou negativo.*/

public class Ecerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 ;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com o primeiro número inteiro");
		n1 = leia.nextInt();
		
		if(n1 > 0 ) {
			System.out.println("\n Este número "+ n1 + " é positivo");
		}
		else {
			System.out.println("\n Este número "+ n1 +" é negativo");
		}
		
		if (n1 %2 == 0){
			System.out.println( "\nÉ um número par ");
		}
		
		else {
			System.out.println("\nÉ um numero impar ");
		}
	}
		
		
		
	}

