package classes;

import interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	
	private String login;
	private String senha;
	
	public Secretario(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
		
	}

	
	
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
	
	
	



}
