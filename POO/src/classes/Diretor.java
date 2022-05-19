package classes;

import interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {
	
	//variaveis 
	private String login;
	private String senha;
	
	//construtor
	public Diretor(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
	}
	
	//construtor padrão 
	public Diretor() {

	}
	
	
	
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
	
}
