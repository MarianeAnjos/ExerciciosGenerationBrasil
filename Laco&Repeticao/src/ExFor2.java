
/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser 
 * menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que
 *  o intervalo é inválido e sair do programa. 
Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.*/


import java.util.Scanner;

public class ExFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner leia = new Scanner(System.in);
		
		float n1,n2;
		int x,y;
		
		System.out.println("\n Primeiro numero");
		n1 = leia.nextFloat();
		System.out.println("\n Segundo numero");
		n2 = leia.nextFloat();
		
			if (n1 < n2) {
				for (x = (int) n1; x <= n2; x ++) {
					if (x % 3 == 0 && x % 5 == 0 ) {
						
						System.out.println("\n O numero "+ x +" é divisivel por 3 e 5.");
					} 
				}
				
			}else {
				System.out.println("\n INTERVALO INVALIDO.");
			}
	}

}
