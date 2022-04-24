package classes;

import interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

	private String login;
	private String senha;
	
	
	public Diretor(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
	}
	
	
	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin") && senha.equals("admin");
	}
	
}
