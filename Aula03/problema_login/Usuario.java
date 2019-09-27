package problema_login;

public class Usuario {
	private String login;
	private String senha;
	// private double salario; - Questionamento
	
	public Usuario(String login, String usuario) {
		this.login = login;
		this.senha = usuario;
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
	public void setSenha(String usuario) {
		this.senha = usuario;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + "]";
	}
	
}
