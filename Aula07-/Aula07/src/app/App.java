package app;

import controller.Controlador;
import model.BaseDados;
import model.Usuario;
import view.Janela;
import view.Login;

public class App {
	public static void main(String[] args) {
		Login login = new Login("Login", 200, 200);
		Janela janela = new Janela();
		new Controlador(login, janela);
		
		BaseDados.addUsuario(new Usuario("jose", "1Ab"));
		BaseDados.addUsuario(new Usuario("maria", "maria123"));
		
	}
}
