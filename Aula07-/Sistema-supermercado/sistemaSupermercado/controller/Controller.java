package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDados;
import model.Produto;
import view.Mensagem;
import view.Menu;
import view.TelaCadastro;

public class Controller implements ActionListener{
	
	Menu menu;
	TelaCadastro cadastro;
	
	public Controller(Menu menu, TelaCadastro cadastro) {
		this.menu = menu;
		this.cadastro = cadastro;
		
		menu.getCadastrarButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(false);
				cadastro.setVisible(true);
			}
		});
		
		menu.getSairButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		cadastro.getAddButton().addActionListener(this);
		cadastro.getSairButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cadastro.getAddButton()) {
			Produto produto = new Produto();
			produto.setNome(cadastro.getNomeField().getText());
			produto.setPreco(Double.parseDouble(cadastro.getPrecoField().getText()));
			produto.setValidade(cadastro.getValidadeField().getText());
			produto.setPerecivel(cadastro.getPerecivelButton().isSelected());
			if (BaseDados.addProduto(produto))
				Mensagem.exibirMensagem("Produto cadastrado com sucesso!");
			else
				Mensagem.exibirMensagem("Produto já cadastrado!");
//			for (Produto p : BaseDados.getProdutos()) {
//				System.out.println(p.toString());
//			}
		}
		
		if (e.getSource() == cadastro.getSairButton()) {
			cadastro.setVisible(false);
			menu.setVisible(true);
		}
	}
	
}
