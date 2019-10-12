package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.Usuario;
import view.Janela;
import view.Login;
import view.Menssagem;

public class Controlador implements ActionListener{
	private Login login;
	private Janela janela;
	
	public Controlador(Login login, Janela janela) {
		this.login = login;
		this.janela = janela;
		
		login.getBtnComfirmar().addActionListener(this);
		login.getBtnSair().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login.getBtnComfirmar()) {
			Usuario usuario = new Usuario(login.getTfLogin().getText(), login.getTfSenha().getText());
			if (BaseDados.isUsuario(usuario)) {
				janela.setVisible(true);
				login.setVisible(false);
			} else
				Menssagem.exibirMensagem("Não logado, você não é um usuário");
		} else if (e.getSource() == login.getBtnSair()) {
			System.out.println("Saiu");
			System.exit(0);
		}
	}
}
