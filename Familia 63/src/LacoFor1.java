/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são 
 * pares e quantos número são ímpares. */

import java.util.Scanner;

public class LacoFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner leia = new Scanner(System.in);
		 
	        int n, contPar = 0, contImpar = 0;
	        
	        for(int x = 1; x <=10 ; x ++){
	            System.out.println("\n Digite o " + x + "º número");
	            n = leia.nextInt();
	            
	            if(n % 2 == 0){
	                contPar++;
	            }
 
	            else if(n % 2 == 1){
	                contImpar++;
	            }
	           
	        }
	        
	        System.out.println("\nForam digitados " + contPar + " números pares \n");
	        System.out.println("\nForam digitados " + contImpar + " números ímpares");
	        
	    }
	}
