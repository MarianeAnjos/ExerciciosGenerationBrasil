/* Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga
 *  pesquisar dados no vetor, 
 * onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. 
 * Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela.*/


import java.util.Scanner;

public class Exerc1Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] vetor = new int[10];
		int x , numero , conte=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<10;x++) {
			System.out.println("Entre com um numero: ");
			vetor[x] = leia.nextInt();		
		}
		
		System.out.println("Informe um valor para procurar no vetor: ");
		numero = leia.nextInt();
		
		for (x=0;x<10;x++) {
			
			if(vetor[x]==numero) {
				System.out.println("Posição do numero digitado é: "+x);
				conte++;
			}
		}
		
		if (conte==0) {
			System.out.println("A posição do numero não foi encontrada!");
		}
		
	}

}
