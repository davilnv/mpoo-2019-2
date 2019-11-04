package app;

import controller.Controller;
import view.Menu;
import view.TelaCadastro;

public class App {
	public static void main(String[] args) {
		Menu menu = new Menu();
		TelaCadastro cadastro = new TelaCadastro();
		new Controller(menu, cadastro);
	}
}
