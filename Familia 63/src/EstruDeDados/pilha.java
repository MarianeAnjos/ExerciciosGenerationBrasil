package EstruDeDados;

import java.util.Scanner;
import java.util.Stack;

public class pilha {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)){
		
		Stack<String> pilhaLivros =  new Stack<String>();
	

// loop infinite 
		
		while (true) {
			Integer op;

			System.out.println(" ************************************************************");
			System.out.println(" *                   Estante de livros                      *");
			System.out.println(" *                                                          *");
			System.out.println(" * \t\t 1 - Adicionar livro na pilha               *");
			System.out.println(" * \t\t 2 - Retirar livro da pilha                 *");
			System.out.println(" * \t\t 3 - Listar todos os livros                 *");
			System.out.println(" * \t\t 0 - Sair                                   *");
			System.out.println(" ************************************************************");
			System.out.println("\t\t Entre com a opção desejada : ");
			
			int opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			
// Adicionando um livro a pilha
			
			case 1:
					System.out.println("\n Entre com o livro a ser adicionado: ");
					String entrada = leia.nextLine();
					
					pilhaLivros.add(entrada);
					System.out.println("\n Pilha de livros :");
					
					for (String livro : pilhaLivros) {
					    System.out.println(livro);
					}
					System.out.println("\n O livro foi adicionado");
					
				break;
				
// Removendo um livro da pilha
				
			case 2:
				
				if (pilhaLivros.isEmpty()) {
					System.out.println("\n Não constam livros na pilha."); 
				} else { 
					pilhaLivros.pop();
					System.out.println("\n Pilha de livros:");

					for (String livro : pilhaLivros) {
					    System.out.println(livro);
					 }
					
					System.out.println("\n Um dos livro foi retirado.");
				}
				break;
				
// Listando o conteúdo da pilha		
				
			case 3:
				if (pilhaLivros.isEmpty()) { 
					System.out.println("\n Não consta nenhum livro na pilha");
					} else {
						System.out.println("\n Lista com todos os livros da pilha: ");

						for (String livro : pilhaLivros) {
						    System.out.println(livro);
						 }
					}
				break;
				
// Finalizando o programa e opção inválida				
				
			case 0:
				System.out.println("\n O Programa foi finalizado!");
				break;
				
			default:
				System.out.println("\n Opção inválida!");
		     	}
			}

	}

}
}
