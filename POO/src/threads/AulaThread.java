package threads;

import java.util.Iterator;
import java.util.Scanner;

public class AulaThread {

	/*
	 * Aprendendo THREADS com as aulas do módulo 14
	 */
	
	
	public static void main(String[] args) {
		

		new Thread() {

			//Todo código executável vai dentro de run 
			public void run() {
				Scanner input = new Scanner(System.in);
				
				System.out.println("What phrase do you want to check? ");
				String mensagem = input.nextLine();
				
				String arrayString[] = new String[1000];
				arrayString = mensagem.split(" "); 

				
				
				System.out.println("\nWhat word do you want to find? ");
				String word = input.next();
				
				
				System.out.println("searching for "+ word + " in: \n\n -->" + mensagem + "\n");
				
				for (int i = 0; i < arrayString.length ; i++) {
					
					
					if(arrayString[i].equals(word)) {
						
						System.out.println("WORD FOUND! -->  " + arrayString[i] + "  <-----");
						
					}else {
						
						System.out.println("Selecting word..." + arrayString[i]);
					}
					
					
					try {
						
						Thread.sleep(100);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}	
				
			};
			
		}.start(); //starta a thread 
		
		
	}
	
	
	
}
