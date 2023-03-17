/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
 *  via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total
 *  de pessoas cuja idade seja maior que 50 anos.
 *  A leitura dos dados deve ser finalizada ao digitar uma idade negativa.*/

import java.util.Scanner;


public class LacoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, idadeMenor=0, idadeMaior=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade >= 0) {
			System.out.println("\n Entre com a sua idade");
			idade = leia.nextInt();
				if(idade <21 && idade >=0){
				idadeMenor++;
				}else if(idade > 50) {
					idadeMaior++;
				}
		}
		System.out.println("\n O total de pessoas menor que 21 anos é: "+idadeMenor);
		System.out.println("\n O total de pessoas maior que 50 anos é: "+idadeMaior);
	}

}
