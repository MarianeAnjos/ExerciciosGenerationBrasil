package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cores = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String cor = null;
		
			for (int x=0;x<5;x++) {
	            System.out.print("\n Insira uma cor: ");
	            cores.add(cor);
	            cor = scanner.nextLine();	
			}
		
		
		
		System.out.println(" ");
		System.out.println("\n As cores Inseridas são: ");
		Iterator<String> Cores = cores.iterator();
		
		while(Cores.hasNext()) {
			
			System.out.println(Cores.next());
		}

		
		Collections.sort(cores, null);
		System.out.println("\n As cores Ordenadas São: ");
		
		Iterator<String> Corx = cores.iterator();
		
		while(Corx.hasNext()) {
			
			System.out.println(Corx.next());
		}
	}

}
