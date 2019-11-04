package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Cadastro;
import view.Login;
import view.Menu;

public class ControleMenu implements ActionListener{
	Menu menu;
	Login login;
	Cadastro cadastro;
	
	public ControleMenu(Menu menu, Login login, Cadastro cadastro) {
		this.menu = menu;
		this.login = login;
		this.cadastro = cadastro;
		menu.getLoginButton().addActionListener(this);
		menu.getCadastrarButton().addActionListener(this);
		menu.getSairButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menu.getLoginButton()) {
			menu.setVisible(false);
			login.setVisible(true);
		}
		
		if (e.getSource() == menu.getCadastrarButton()) {
			menu.setVisible(false);
			cadastro.setVisible(true);
		}
		
		if (e.getSource() == menu.getSairButton()) {
			System.exit(0);
		}
	}
}
