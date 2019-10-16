package duvidas;

public class Usuario {
	public String login, senha;

	public Usuario() {}
	
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
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
	
//	public class App {
//		public static void main(String[] args) {
//				Usuario user = new Usuario();
//				System. out .println("Login: " + user.login +"\n Senha: " + user.senha);
//		}
//	}

}
