//Ele remove o primeiro elemento da lista
package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer>  fila = new LinkedList<Integer>();
		
		for(int i=0;i<=10;i++) {
			fila.add(i);
		}
		System.out.println("\n  Elementos dafila"+fila);
		System.out.println("\n Removendo um elemento da fila:"+fila.remove());
		System.out.println("\n Elementos da lista após a remoção"+fila);
		System.out.println("\n Adicionando um elmento na fila: "+fila.add(11));
		System.out.println("\n Elementos da fila"+fila);
		System.out.println("\n Pegar o primeiro elemento da fila: "+fila.peek()); 
		System.out.println("\n Pegar o tamanho da fila: "+fila.size());
		System.out.println("\n Verificar um elemento na fila: "+fila.contains(37));
	}

}
