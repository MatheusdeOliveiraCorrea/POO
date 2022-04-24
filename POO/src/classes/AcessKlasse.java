package classes;

import interfaces.PermitirAcesso;

public class AcessKlasse {

	
	private PermitirAcesso acesso;
	
	public boolean autenticar() {
		
		
		return acesso.autenticar();
	}
	
	
	public AcessKlasse(PermitirAcesso acesso) {
		
		this.acesso = acesso;
	}
}
