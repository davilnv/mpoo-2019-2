package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseUsuarios;
import model.Gerente;
import model.Vendedor;
import view.Cadastro;
import view.Mensagem;
import view.Menu;

public class ControleCadastro implements ActionListener{

	Cadastro cadastro;
	Menu menu;

	public ControleCadastro(Cadastro cadastro, Menu menu) {
		this.cadastro = cadastro;
		this.menu = menu;

		cadastro.getVoltarButton().addActionListener(this);
		cadastro.getCadastrarButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cadastro.getCadastrarButton()) {
			if (cadastro.getSenhaField().getText().equals(cadastro.getConfirmarSenhaField().getText())) {
				if (cadastro.getVendedorRadioButton().isSelected()) {
					Vendedor vendedor = new Vendedor();
					vendedor.setLogin(cadastro.getLoginField().getText());
					vendedor.setCpf(cadastro.getCpfField().getText());
					vendedor.setSenha(cadastro.getSenhaField().getText());
					if (BaseUsuarios.adicionarUser(vendedor))
						Mensagem.exibirMensagem("Usuário (Vendedor) cadastrado com sucesso!");
					else
						Mensagem.exibirMensagem("Erro! Usuário já cadastrado no sistema!");
				} else if (cadastro.getGerenteRadioButton().isSelected()) {
					Gerente gerente = new Gerente();
					gerente.setLogin(cadastro.getLoginField().getText());
					gerente.setCpf(cadastro.getCpfField().getText());
					gerente.setSenha(cadastro.getSenhaField().getText());
					if (BaseUsuarios.adicionarUser(gerente))
						Mensagem.exibirMensagem("Usuário (Gerente) cadastrado com sucesso!");
					else
						Mensagem.exibirMensagem("Erro! Usuário já cadastrado no sistema!");
				} else {
					Mensagem.exibirMensagem("Nenhuma opção de cargo selecionada!");
				}
			} else
				Mensagem.exibirMensagem("As senhas digitadas não coincidem!");
		}

		if (e.getSource() == cadastro.getVoltarButton()) {
			cadastro.setVisible(false);
			menu.setVisible(true);
		}
	}

}
