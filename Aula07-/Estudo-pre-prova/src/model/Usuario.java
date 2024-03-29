package model;

public abstract class Usuario {
	private String cpf;
	private String login;
	private String senha;
	
	public Usuario() {};
	
	public Usuario(String cpf, String login, String senha) {
		super();
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
