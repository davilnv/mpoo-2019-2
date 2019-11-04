package app;

import controller.ControleCadastro;
import controller.ControleLogin;
import controller.ControleMenu;
import controller.ControleVendedor;
import model.BaseUsuarios;
import model.Estoque;
import model.Gerente;
import model.Produto;
import model.Venda;
import model.Vendedor;
import view.Cadastro;
import view.Login;
import view.Menu;
import view.TelaGerente;
import view.TelaVendedor;

public class App {
	public Gerente gerente;
	public Vendedor vendedor;
	public Estoque estoque;
	public Venda venda;
	
	
	public static void main(String[] args) {
		// new TelaGenerica("Menu"); //Não se pode instanciar classe abstrata
		Vendedor admin = new Vendedor();
		admin.setLogin("");
		admin.setCpf("123");
		admin.setSenha("");
		BaseUsuarios.adicionarUser(admin);
		Estoque.addProduto(new Produto("Feijão", "Kikaldo", "1010", 100, 4.50));
		Estoque.addProduto(new Produto("Arrroz", "Rampineli", "2020", 200, 2.25));
		Estoque.addProduto(new Produto("Cuzcuz", "Vitamassa", "3030", 500, 0.89));
		Menu menu = new Menu();
		Login login = new Login();
		Cadastro cadastro = new Cadastro();
		TelaVendedor vendedor = new TelaVendedor();
		TelaGerente gerente = new TelaGerente();
		new ControleMenu(menu, login, cadastro);
		new ControleLogin(login, menu, vendedor, gerente);
		new ControleCadastro(cadastro, menu);
		new ControleVendedor(vendedor, login);
		
	}
}
