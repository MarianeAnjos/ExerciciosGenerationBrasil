import java.util.Scanner;

/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
 * Ao final,
 *  mostre na tela a soma de todos os números positivos digitados, que sejam positivos.*/

public class LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0, soma = 0 ;
		Scanner leia = new Scanner(System.in);
		
		do  {
			System.out.println("\n Digite um numero que seja diferente de 0: ");
			numero = leia.nextInt();
			
				if(numero >=0) {
				soma += numero ;
				}
			
		 } while(numero !=0);
			
		System.out.println("\n A soma dos números positivos digitados é igual a: " +soma);

	}

	}
