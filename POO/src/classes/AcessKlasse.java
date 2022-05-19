package classes;

import interfaces.PermitirAcesso;

public class AcessKlasse {

	private PermitirAcesso acesso;
	
	//construtor
	public AcessKlasse(PermitirAcesso acesso) {
		
		this.acesso = acesso;
	}
	
	
	public boolean autenticar() {
		
		
		return acesso.autenticar();
	}
	
	

}
