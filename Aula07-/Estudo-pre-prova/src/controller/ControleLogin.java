package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseUsuarios;
import view.Login;
import view.Mensagem;
import view.Menu;
import view.TelaGerente;
import view.TelaVendedor;

public class ControleLogin implements ActionListener{
	Login login;
	Menu menu;
	TelaVendedor vendedor;
	TelaGerente gerente;

	public ControleLogin(Login login, Menu menu, TelaVendedor vendedor, TelaGerente gerente) {
		this.login = login;
		this.menu = menu;
		this.vendedor = vendedor;
		this.gerente = gerente;

		login.getConfirmarButton().addActionListener(this);
		login.getVoltarButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login.getConfirmarButton()) {
			String loginString = login.getLoginField().getText();
			String senhaString = login.getSenhaField().getText();
			if (BaseUsuarios.verificarUsuario(loginString, senhaString)) {
				int codigoAcesso = BaseUsuarios.pegarAcessoUsuario(loginString, senhaString);
				if (codigoAcesso == 1) {
					login.setVisible(false);
					vendedor.setVisible(true);
				} else if (codigoAcesso == 2) {
					login.setVisible(false);
					gerente.setVisible(true);
				}
			} else
				Mensagem.exibirMensagem("Erro ao logar, dados incorretos!");
		}

		if (e.getSource() == login.getVoltarButton()) {
			login.setVisible(false);
			menu.setVisible(true);
		}
	}
}
