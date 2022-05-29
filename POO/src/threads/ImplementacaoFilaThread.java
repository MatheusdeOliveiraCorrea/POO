package threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	
	

	
	
	
	public static void add(ObjetoFilaThread objeto) {
		
		pilha_fila.add(objeto);
		
		
	}
	
	
	@Override
	public void run() {

		Iterator interacao = pilha_fila.iterator();
		
		synchronized(interacao) {
			while(interacao.hasNext()) {  //enquanto houver dados será processado
				
				ObjetoFilaThread processar = (ObjetoFilaThread) interacao.next(); 
				
				
				/*Gerar várias notas fiscais*/ 
				/*Gerar PDF's e mandar por email*/ 
				/*gerar um envio em massa de emails*/ 
				
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());
				
				
				
				interacao.remove();
				
				
				//tempo discarga de memória 
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				
			}//fim while
			
			
		}
		
		
		//Processou toda a lista, dá um tempo para limpeza de memória 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//fim método run 
	
	
}
