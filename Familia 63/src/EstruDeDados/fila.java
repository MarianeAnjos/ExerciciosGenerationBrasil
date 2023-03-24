package EstruDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fila {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			
			Queue<String> fila = new LinkedList<String>();

			while (true) {
			

			System.out.println(" ***************************    *****************************");
			System.out.println(" *  \t               BM - BANCO DA MARI                       *");
			System.out.println(" ***************************    *****************************");
			System.out.println(" * \t 1 - Adicionar cliente na fila                          *");
			System.out.println(" * \t 2 - Listar todos os clientes                           *");
			System.out.println(" * \t 3 - Retirar clientes da fila                           *");
			System.out.println(" * \t 0 - Sair                                               *");
			System.out.println(" *************************************************************");
			System.out.println("\t\n entre com a opção desejada: ");
			Integer operacao = leia.nextInt();
			leia.nextLine();

			@SuppressWarnings("unused")
			String nome;
			switch (operacao) {
			
// Adicionando um cliente a fila
			
			case 1:
				
				System.out.println("\n Digite o nome do cliente: ");
				String entrada = leia.nextLine();
				
				fila.offer(entrada);
				
				System.out.println("\n Fila:");
				System.out.println("\t");
				
				for (String cliente : fila) {
				    System.out.println(cliente);
				}
				System.out.println("\n Cliente adicionado!");
				break;
				
// Listagem de clientes na fila				
				
			case 2:
				if (fila.isEmpty())  {
					System.out.println("\n Não existem clientes na fila!");
				} else { 
					
				System.out.println("\n Lista com todos os clientes da fila: ");
				System.out.println("\t");
				
				for (String cliente : fila) {
				System.out.println(cliente);
				
				}
				
				}
				break;
				
// Retirando clientes da fila		
				
			case 3:
				if (fila.isEmpty()) {
				System.out.println("\n Todas as pessoas da lista foram retiradas!"); 
				} else {
					
					System.out.println("\n Digite o nome da pessoa a ser retirada: "); 
					String retirada = leia.nextLine();
					fila.remove(retirada);
					System.out.println("\n Fila:");
					System.out.println("\t");
					
					for (String cliente : fila) {
						
				    System.out.println(cliente);
				    
					}
					
					System.out.println("\n O cliente foi chamado!");
				}
				
				break;
				
// Finalização do programa 		
				
			case 0:
				System.out.println("\n finalizado!");
				break;
			default:
				System.out.println("\n Opção inválida!");
			}
			}
		}
			
		}
	}

