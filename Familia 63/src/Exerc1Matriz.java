
/*Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
Todos os elementos da Diagonal Principal
Todos os elementos da Diagonal Secundária
A Soma de todos os elementos da Diagonal Principal
A Soma de todos os elementos da Diagonal Secundária
*/


import java.util.Scanner;

public class Exerc1Matriz {
		
		public static void main(String[] args) {
	
			int[][] numero = new int[3][3];
			int lin , col , somaPrin=0 , somaSec=0;
			
			Scanner read = new Scanner(System.in);
			
			for(lin=0;lin<3;lin++) {
				for(col=0;col<3;col++) {
					System.out.println("\n Insira um numero com um valor inteiro: ");
					numero[lin][col] = read.nextInt();
					
					if(lin==col) {
						somaPrin += numero [lin][col];
						
					} else if((lin==0 && col == 2)||(lin==1 && col==1)||(lin==2 && col==0)) {
						somaSec += numero[lin][col];
						
					}
				}
				
			}
			System.out.println("\n Elementos da diagonal secundaria");
			for(lin=0;lin<3;lin++) {
				for(col=0;col<3;col++) {
				if((lin==0 && col == 2)||(lin==1 && col==1)||(lin==2 && col==0)) {
					System.out.println(numero[lin][col]);
					
			}
				}
		}
			System.out.println(" Os Elementos da diagonal principal");
			for(lin=0;lin<3;lin++) {
				for(col=0;col<3;col++) {
				if(lin==col) {
					System.out.println(numero[lin][col]);
					
			}
				}
		}
			System.out.println("\n A Soma dos elementos da Diagonal Principal: "+somaPrin);
			System.out.println("\n A Soma dos elementos da Diagonal Secundaria: "+somaSec);
			
		}
			
			
}
	

