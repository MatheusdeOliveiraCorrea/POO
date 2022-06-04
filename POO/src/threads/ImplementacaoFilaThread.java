package threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	
	
	//adciona a pilha "pilha_fila" um objeto com nome e email "ObjetoFilaThread" 
	public static void add(ObjetoFilaThread objeto) {
		
		pilha_fila.add(objeto);
		
		
	}
	
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {
		
		synchronized(pilha_fila) {
			
			Iterator interacao = pilha_fila.iterator();
			
			while(interacao.hasNext()) {  //enquanto houver dados será processado
				
				ObjetoFilaThread processar = (ObjetoFilaThread) interacao.next(); 
				
				
				/*Gerar várias notas fiscais*/ 
				/*Gerar PDF's e mandar por email*/ 
				/*gerar um envio em massa de emails*/ 
				
				System.out.println("-----------------");
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());

				interacao.remove();

				//tempo descarga de memória 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				
			}//fim while
			
			
		}
		
		
		//Processou toda a lista, dá um tempo para limpeza de memória 
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//fim do while true
		
		
	}//fim método run 
	
	
	
}
